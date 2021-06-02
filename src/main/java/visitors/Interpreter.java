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
}
