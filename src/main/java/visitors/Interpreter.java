package visitors;

import antlr.PaPyBaseVisitor;
import antlr.PaPyLexer;
import antlr.PaPyParser;
import models.*;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.HashMap;

public class Interpreter extends PaPyBaseVisitor<Section> {

    private HashMap<String, Function> functions;
    private HashMap<String, Variable> variables;

    public Interpreter(){
        functions = new HashMap<>();
        variables = new HashMap<>();
    }

    @Override
    public Section visitStatement(PaPyParser.StatementContext ctx) {
        return visit(ctx.getChild(0)); //Statement has two children 0 - expression/funcCall/ifStatement etc and 1 - nl, so simply skip the nl's and visit only child at 0
    }

    @Override
    public Section visitVariableDeclaration(PaPyParser.VariableDeclarationContext ctx) {
        String type = ctx.type().getChild(0).getText(); //Type always has only one child so get it's text value
        String identifier = ctx.IDENTIFIER().getText();
        Expression expression = (Expression) visit(ctx.expression()); //Visit the expression child and cast the result to Expression from Section, as we are certain it's an Expression
        Value value =  expression.evaluate(); //Evaluate the expression to obtain the value

        Variable variable = new Variable(type, identifier, value);

        if(variables.containsKey(identifier)){
            //Print an error msg and stop the execution as the variable has been already declared
            throw new RuntimeException("Variable has been already declared");
        }

        variables.put(identifier, variable);
        return variable;
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
    public Section visitMultiplication(PaPyParser.MultiplicationContext ctx) {
        Expression left = (Expression) visit(ctx.getChild(0));
        Expression right = (Expression) visit(ctx.getChild(2));

        return new Multiplication(left, right);
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
}
