package visitors;

import antlr.PaPyBaseVisitor;
import antlr.PaPyLexer;
import antlr.PaPyParser;
import models.*;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Interpreter extends PaPyBaseVisitor<Section> {

    private HashMap<String, Function> functions;

    private int scopeDepth = 0; //determines the current scope depth that we are in
    private List<HashMap<String,Variable>> scopes; // each hashMap in a list represents the scope, the item at 0 is always present and resembles the global scope

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

        for(int i = scopeDepth; i >= 0; i--) {
            if(scopes.get(i).containsKey(identifier))
                throw new RuntimeException("Variable has been already declared");
        }

        scopes.get(scopeDepth).put(identifier, variable);

        return variable;
    }

    @Override
    public Section visitValue(PaPyParser.ValueContext ctx) {
        ParseTree child = ctx.getChild(0);

        if(child.getPayload() instanceof Token) { //If the child is a token - e.g. IDENTIFIER
            Token token = (Token) ctx.getChild(0).getPayload();
            int tokenType = token.getType();

            if (tokenType == PaPyLexer.IDENTIFIER) { //If the token is Identifier then do the following
                String identifier = ctx.IDENTIFIER().getText(); //Retrieve the variable identifier

                Value returnValue = null;
                for(int i = scopeDepth; i >= 0; i--) { //Go throught all the scopes starting from the current one to the global scope
                    if(scopes.get(i).containsKey(identifier)) { //If the i-th scope has the variable declaration with identifier
                        returnValue = scopes.get(i).get(identifier).value; //simply retrieve the value and break
                        break;
                    }
                }

                if(returnValue == null) //returnValue will be null if none of the scopes had the variable with identifier declared
                    throw new RuntimeException("Reference to the undeclared variable"); //so throw and error

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

        if((lastChild.getPayload() instanceof Token)) //If it's a token it means there is no else/elseif block
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

        if((lastChild.getPayload() instanceof Token)) //If it's a token it means there is no else/elseif block
            return null;

        return visit(lastChild); //Otherwise the last child is else/elseif so visit it
    }

    @Override
    public Section visitElseStatement(PaPyParser.ElseStatementContext ctx) {
        return visit(ctx.block());
    }

    @Override
    public Section visitBlock(PaPyParser.BlockContext ctx) {

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

        return null;
    }
}
