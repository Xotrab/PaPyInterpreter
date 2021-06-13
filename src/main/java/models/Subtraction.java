package models;

public class Subtraction extends ArithmeticExpression {
    public Expression left;
    public Expression right;

    public Subtraction(Expression leftExpr, Expression rightExpr)
    {
        left = leftExpr;
        right = rightExpr;
    }

    @Override
    public String toString() {
        return left.toString() + " - " + right.toString();
    }

    @Override
    public Value evaluate() {
        return ((Number) left.evaluate()).subtract((Number) right.evaluate());
    }
}
