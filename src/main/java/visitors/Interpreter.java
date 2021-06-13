package visitors;

import antlr.PaPyBaseVisitor;
import antlr.PaPyLexer;
import antlr.PaPyParser;
import models.*;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Interpreter extends PaPyBaseVisitor<Section> {

    private long scopeStackDelimiter = 0; //used to constrain the scope for functions e.g. when invoking a function inside another scope
    private HashMap<String, Function> functions;

    private int scopeDepth = 0; //determines the current scope depth that we are in
    private List<HashMap<String,Variable>> scopes; // each hashMap in a list represents the scope, the item at 0 is always present and resembles the global scope

    private Map<String, Class<? extends Value>> nameToType = Map.of( //xD
            "int", IntegerNumber.class,
            "float", FloatNumber.class,
            "bool", BooleanValue.class
    );

    private Map<Class<? extends Value>, String> typeToName = Map.of( //xD2
            IntegerNumber.class, "int",
            FloatNumber.class, "float",
            BooleanValue.class, "bool"
    );

    public Interpreter(){
        functions = new HashMap<>();
        scopes = new ArrayList<>();
        scopes.add(new HashMap<String,Variable>()); // add the first hashMap, which represents the global scope
    }

    @Override
    public Section visitStatement(PaPyParser.StatementContext ctx) {
        return visit(ctx.getChild(0)); //Statement has two children 0 - expression/funcCall/ifStatement etc and 1 - nl, so simply skip the nl's and visit only child at 0
    }

    @Override
    public Section visitExpression(PaPyParser.ExpressionContext ctx) {
        Section section = visitChildren(ctx); //Visit all the children

        //If the grand parent of an expression is the section rule it means we want to print the evaluated expression to the terminal
        if(ctx.parent.parent.getRuleIndex() == PaPyParser.RULE_section)
            System.out.println(((Expression) section).evaluate());

        return section;
    }

    @Override
    public Section visitVariableDeclaration(PaPyParser.VariableDeclarationContext ctx) {
        String type = ctx.type().getChild(0).getText(); //Type always has only one child so get it's text value
        String identifier = ctx.IDENTIFIER().getText();
        Expression expression = (Expression) visit(ctx.expression()); //Visit the expression child and cast the result to Expression from Section, as we are certain it's an Expression
        Value value =  expression.evaluate(); //Evaluate the expression to obtain the value

        Variable variable = new Variable(type, identifier, value);

        for(int i = scopeDepth; i >= scopeStackDelimiter; i--) { //in case of function calls we want to constrain the visible scopes based on the delimiter
            if(scopes.get(i).containsKey(identifier))
                throw new SemanticErrorException("Semantic Error at line " + ctx.start.getLine() +
                        ": variable \"" + identifier + "\" has been already declared");
        }

        scopes.get(scopeDepth).put(identifier, variable);

        return variable;
    }

    @Override
    public Section visitVariableReassignment(PaPyParser.VariableReassignmentContext ctx) {
        String identifier = ctx.IDENTIFIER().getText();

        Variable foundVariable = null;
        for(int i = scopeDepth; i >= scopeStackDelimiter; i--) {
            if(scopes.get(i).containsKey(identifier)) {
                foundVariable = scopes.get(i).get(identifier);
                break;
            }
        }

        if(foundVariable == null) {
            if(scopes.get(0).containsKey(identifier))
                foundVariable = scopes.get(0).get(identifier);
        }

        if(foundVariable == null)
            throw new SemanticErrorException("Semantic Error at line " + ctx.start.getLine() + ": reference to the undeclared variable \"" + identifier +"\"");

        Value newAssignment = ((Expression) visit(ctx.expression())).evaluate();

        if(!newAssignment.getClass().equals(nameToType.get(foundVariable.type)))
            throw new SemanticErrorException(
                    "Semantic Error at line " + ctx.start.getLine() +
                    ": the assigned type \"" + typeToName.get(newAssignment.getClass()) + "\" does not match the declared variable type \"" + foundVariable.type + "\"");

        foundVariable.value = newAssignment;

        return null;
    }

    @Override
    public Section visitValue(PaPyParser.ValueContext ctx) {
        ParseTree child = ctx.getChild(0);

        if(child.getPayload() instanceof Token) { //If the child is a token - e.g. IDENTIFIER
            Token token = (Token) ctx.getChild(0).getPayload();
            int tokenType = token.getType();

            var wasValueFound = false;

            if (tokenType == PaPyLexer.IDENTIFIER) { //If the token is Identifier then do the following
                String identifier = ctx.IDENTIFIER().getText(); //Retrieve the variable identifier

                Value returnValue = null;
                for(int i = scopeDepth; i >= scopeStackDelimiter; i--) { //Go through all the scopes starting from the current one to the one set by the delimiter
                    if(scopes.get(i).containsKey(identifier)) { //If the i-th scope has the variable declaration with identifier
                        returnValue = scopes.get(i).get(identifier).value; //simply retrieve the value and break
                        wasValueFound = true;
                        break;
                    }
                }

                //Same as in VisitVariableDeclaration, we allow the functions to access the global scope
                if(!wasValueFound && scopes.get(0).containsKey(identifier))
                    returnValue = scopes.get(0).get(identifier).value;

                if(returnValue == null) //returnValue will be null if none of the scopes had the variable with identifier declared
                    throw new SemanticErrorException("Semantic Error at line " + ctx.start.getLine() + ": reference to the undeclared variable \"" + identifier +"\""); //so throw and error

                return returnValue;
            }
        }

        return visit(child); //For any other token types simply visit them
    }

    @Override
    public Section visitNumber(PaPyParser.NumberContext ctx) {
        String valueTxt = ctx.getChild(0).getText();
        Token token = (Token) ctx.getChild(0).getPayload();
        int tokenType = token.getType();
        if(tokenType == PaPyLexer.INT)
            return new IntegerNumber(Integer.parseInt(valueTxt));
        else
            return new FloatNumber(Float.parseFloat(valueTxt));
    }

    @Override
    public Section visitAddition(PaPyParser.AdditionContext ctx) {
        Expression left = (Expression) visit(ctx.getChild(0));
        Expression right = (Expression) visit(ctx.getChild(2));

        return new Addition(left, right);
    }

    @Override
    public Section visitSubtraction(PaPyParser.SubtractionContext ctx) {
        Expression left = (Expression) visit(ctx.getChild(0));
        Expression right = (Expression) visit(ctx.getChild(2));

        return new Subtraction(left, right);
    }

    @Override
    public Section visitMultiplication(PaPyParser.MultiplicationContext ctx) {
        Expression left = (Expression) visit(ctx.getChild(0));
        Expression right = (Expression) visit(ctx.getChild(2));

        return new Multiplication(left, right);
    }

    @Override
    public Section visitDivision(PaPyParser.DivisionContext ctx) {
        Expression left = (Expression) visit(ctx.getChild(0));
        Expression right = (Expression) visit(ctx.getChild(2));

        return new Division(left, right);
    }

    @Override
    public Section visitArithmeticParentheses(PaPyParser.ArithmeticParenthesesContext ctx) {
        return visit(ctx.arithmeticExpression()); // Skip parentheses and simply visit the expression  between them
    }

    @Override
    public Section visitBooleanValue(PaPyParser.BooleanValueContext ctx) {
        String valueTxt = ctx.getChild(0).getText();
        Token token = (Token) ctx.getChild(0).getPayload();
        int tokenType = token.getType();
        var value = tokenType == PaPyLexer.TRUE;

        return new BooleanValue(value);
    }

    @Override
    public Section visitLogicalComparison(PaPyParser.LogicalComparisonContext ctx) {
        ParseTree comparisonExpression = ctx.comparisonExpression();
        Expression left =  (Expression) visit(comparisonExpression.getChild(0));
        Expression right =  (Expression) visit(comparisonExpression.getChild(2));
        String operator = comparisonExpression.getChild(1).getText(); // Logical comparison always has the operator at the child with index 1

        return new ComparisonOperation(left, right, operator);
    }

    @Override
    public Section visitLogicalNot(PaPyParser.LogicalNotContext ctx) {
        Expression expression =  (Expression) visit(ctx.logicalExpression());

        return new NotLogicalOperation(expression);
    }

    @Override
    public Section visitLogicalAnd(PaPyParser.LogicalAndContext ctx) {
        Expression left =  (Expression) visit(ctx.getChild(0));
        Expression right =  (Expression) visit(ctx.getChild(2));
        String operator = ctx.AND().getText();

        return new BinaryLogicalOperation(left, right, operator);
    }

    @Override
    public Section visitLogicalOr(PaPyParser.LogicalOrContext ctx) {
        Expression left =  (Expression) visit(ctx.getChild(0));
        Expression right =  (Expression) visit(ctx.getChild(2));
        String operator = ctx.OR().getText();

        return new BinaryLogicalOperation(left, right, operator);
    }

    @Override
    public Section visitLogicalParentheses(PaPyParser.LogicalParenthesesContext ctx) {
        return visit(ctx.logicalExpression());
    }

    @Override
    public Section visitIfStatement(PaPyParser.IfStatementContext ctx) {
        Expression condition = (Expression) visit(ctx.expression()); //Visit the if statement condition
        BooleanValue evaluatedConditionValue = (BooleanValue) condition.evaluate(); //Evaluate the if condition value

        if(evaluatedConditionValue.value) { //If the condition evaluated to true
            return visit(ctx.block()); //Simply visit the block
        }

        ParseTree lastChild = ctx.getChild(ctx.getChildCount() - 1); //Get the last child

        if(((RuleContext)lastChild).getRuleIndex() == PaPyParser.RULE_block) //If it's a token it means there is no else/elseif block
            return null;

        return visit(lastChild); //Otherwise the last child is else/elseif so visit it
    }

    @Override
    public Section visitElifStatement(PaPyParser.ElifStatementContext ctx) {

        Expression condition = (Expression) visit(ctx.expression()); //Visit the elseif statement condition
        BooleanValue evaluatedConditionValue = (BooleanValue) condition.evaluate(); //Evaluate the if condition value

        if(evaluatedConditionValue.value) { //If the condition evaluated to true
            return visit(ctx.block()); //Simply visit the block
        }

        ParseTree lastChild = ctx.getChild(ctx.getChildCount() - 1); //Get the last child

        if(((RuleContext)lastChild).getRuleIndex() == PaPyParser.RULE_block) //If it's a token it means there is no else/elseif block
            return null;

        return visit(lastChild); //Otherwise the last child is else/elseif so visit it
    }

    @Override
    public Section visitElseStatement(PaPyParser.ElseStatementContext ctx) {
        return visit(ctx.block());
    }

    @Override
    public Section visitBlock(PaPyParser.BlockContext ctx) {

        var previousScopeStackDelimiter = scopeStackDelimiter; //store the current delimiter state in order to reset it later on

        if(ctx.parent.getRuleIndex() == PaPyParser.RULE_functionDeclaration) { //If the block is connected to the function declaration
            scopeStackDelimiter = scopes.size() - 1; //then set the delimiter accordingly, -1 cause we allow the function to access the args hashMap
        }

        scopeDepth++; //when visit the block increment the scopeDepth counter, which is used to correctly add/check declared variables
        scopes.add(new HashMap<String,Variable>()); //and add the new hashMap for this particular scope

        List<PaPyParser.StatementContext> statements = ctx.statement(); //retrieve the the list of block statements

        for (PaPyParser.StatementContext statementContext : statements) {
            Statement statement = (Statement) visit(statementContext); // visit each of the statements
            if (statement instanceof Expression) //If the statement in block is an expression then print it's evaluated value
                System.out.println(((Expression) statement).evaluate());
        }

        scopes.remove(scopes.size() - 1); //After evaluating the whole block simply remove the hashMap for that block
        scopeDepth--; //and decrement the scopeDepth

        scopeStackDelimiter = previousScopeStackDelimiter; //Go back to the previous delimiter state before the function call

        return null;
    }

    @Override
    public Section visitReturnBlock(PaPyParser.ReturnBlockContext ctx) {

        var previousScopeStackDelimiter = scopeStackDelimiter; //store the current delimiter state in order to reset it later on
        scopeStackDelimiter = scopes.size() - 1; //set the delimiter accordingly, -1 cause we allow the function to access the args hashMap

        scopeDepth++; //when visit the block increment the scopeDepth counter, which is used to correctly add/check declared variables
        scopes.add(new HashMap<String,Variable>()); //and add the new hashMap for this particular scope

        List<PaPyParser.StatementContext> statements = ctx.statement(); //retrieve the list of block statements

        for (PaPyParser.StatementContext statementContext : statements) {
            Statement statement = (Statement) visit(statementContext); // visit each of the statements
            if (statement instanceof Expression) //If the statement in block is an expression then print it's evaluated value
                System.out.println(((Expression) statement).evaluate());
        }

        Expression returnExpression =  (Expression) visit(ctx.returnExpression().expression());

        scopes.remove(scopes.size() - 1); //After evaluating the whole block simply remove the hashMap for that block
        scopeDepth--; //and decrement the scopeDepth

        scopeStackDelimiter = previousScopeStackDelimiter; //Go back to the previous delimiter state before the function call

        Value returnValue = returnExpression.evaluate();

        //Access the parent type context and retrieve the return type in string
        String expectedReturnType = ((PaPyParser.FunctionDeclarationContext) (ctx.parent)).type().getChild(0).toString();

        if(!returnValue.getClass().equals(nameToType.get(expectedReturnType))) //Check if the class of the evaluated return expression matches the return type from the function declaration (using xd map)
            throw new SemanticErrorException("Semantic Error at line " + ctx.start.getLine() +
                    ": the return type \"" + typeToName.get(returnValue.getClass()) + "\" does not match the signature return type \"" + expectedReturnType + "\"");

        return returnValue;
    }

    @Override
    public Section visitFunctionDeclaration(PaPyParser.FunctionDeclarationContext ctx) {
        String identifier = ctx.IDENTIFIER().getText(); //Retrieve the function identifier

        List<PaPyParser.FunctionDeclarationArgumentContext> arguments = ctx.functionDeclarationArgument(); //retrieve all the arguments
        List<FunctionDeclarationArgument> declarationArguments = new ArrayList<>(); //create a list, which will be appended upon visiting a FunctionDeclarationArgument node

        for (PaPyParser.FunctionDeclarationArgumentContext argument: arguments) {
            String argumentIdentifier = argument.IDENTIFIER().getText(); //retrieve the argument's identifier
            String argumentType = argument.type().getChild(0).getText(); //retrieve the argument's type (typeContext has always only one child, thus we call getChild(0))
            declarationArguments.add(new FunctionDeclarationArgument(argumentType, argumentIdentifier)); //when all info has been gathered, then add the new argument object to the list
        }

        String returnType = ctx.RET() != null ? ctx.type().toString() : null; //If the RET token is present then get the return type from the .type() child, otherwise set the returnType to null;

        ParseTree bodyReference = ctx.getChild(ctx.getChildCount() - 1); //function body is always the last child

        if(functions.containsKey(identifier)) //for now we throw an error if a function with the same identifier has been already declared, no overloading included ;(
            throw new SemanticErrorException("Semantic Error at line " + ctx.start.getLine() +
                    ": function with identifier \"" + identifier + "\" has been already declared");

        Function function = new Function(identifier, declarationArguments, returnType, bodyReference); //Create the Function instance based on retrieved params
        functions.put(identifier, function); //add the function to the functions hashMap

        return function;
    }

    @Override
    public Section visitFuncCall(PaPyParser.FuncCallContext ctx) {
        String identifier = ctx.IDENTIFIER().toString();

        if(!functions.containsKey(identifier))
            throw new SemanticErrorException("Semantic Error at line " + ctx.start.getLine() +
                    ": reference to the undeclared function \"" + identifier + "\"");

        Function function = functions.get(identifier);

        ParseTree argList = ctx.argList();
        int argListChildrenCount = argList != null ?  argList.getChildCount(): 0;

        int commaCount = (argListChildrenCount - 1) / 2;
        int argCount = argListChildrenCount - commaCount;

        if(argCount != function.arguments.size())
            throw new SemanticErrorException("Semantic Error at line " + ctx.start.getLine() +
                    ": the passed amount of arguments does not match the amount in the function declaration - got " + argCount + ", expected " + function.arguments.size());

        scopeDepth++;
        scopes.add(new HashMap<>());

        for(int i = 0; i < argListChildrenCount; i+=2) {
            var child = argList.getChild(i);

            var valueCtx = (PaPyParser.ValueContext) child;
            var value = (Value) visit(valueCtx);

            String variableType = function.arguments.get(i >> 1).type;
            if(!value.getClass().equals(nameToType.get(variableType))) { //Let this line be a secret of mine ;)
                throw new SemanticErrorException("Semantic Error at line " + ctx.start.getLine() +
                        ": the type \"" + typeToName.get(value.getClass()) + "\" of the passed argument \""
                        + function.arguments.get(i >> 1).identifier + "\"" +
                        " does not match the expected type \"" + function.arguments.get(i >> 1).type + "\"");
            }

            String variableIdentifier = function.arguments.get(i >> 1).identifier;
            scopes.get(scopeDepth).put(function.arguments.get(i >> 1).identifier, new Variable(variableType, variableIdentifier, value));
        }

        Value returnValue =  (Value) visit(function.body);
        scopes.remove(scopes.size() - 1);
        scopeDepth--;

        return returnValue;
    }

    @Override
    public Section visitWhileStatement(PaPyParser.WhileStatementContext ctx) {
        ParseTree conditionReference =  ctx.logicalExpression();

        while(((BooleanValue)(((Expression) (visit(conditionReference))).evaluate())).value) {
            visit(ctx.block());
        }

        return null;
    }

    @Override
    public Section visitForStatement(PaPyParser.ForStatementContext ctx) {
        String identifier = ctx.IDENTIFIER().getText();
        int startIndex = Integer.parseInt(ctx.range().INT(0).getText());
        int endIndex = Integer.parseInt(ctx.range().INT(1).getText());

        Variable loopIndex = new Variable("int", identifier, new IntegerNumber(startIndex));

        for(int i = scopeDepth; i >= scopeStackDelimiter; i--) {
            if(scopes.get(i).containsKey(identifier))
                throw new SemanticErrorException("Semantic Error at line " + ctx.start.getLine() +
                        ": variable \"" + identifier + "\" has been already declared");
        }

        scopes.get(scopeDepth).put(identifier, loopIndex);

        if(startIndex <= endIndex) {
            for(int i = startIndex; i < endIndex; i++) {
                visit(ctx.block());
                ((IntegerNumber) (loopIndex.value)).value += 1;
            }
        }
        else {
            for(int i = startIndex; i > endIndex; i--) {
                visit(ctx.block());
                ((IntegerNumber) (loopIndex.value)).value -= 1;
            }
        }

        scopes.get(scopeDepth).remove(identifier);

        return null;
    }
}
