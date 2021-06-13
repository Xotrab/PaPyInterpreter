package models;

public class Division extends ArithmeticExpression {
    public Expression left;
    public Expression right;

    public Division(Expression leftExpr, Expression rightExpr)
    {
        left = leftExpr;
        right = rightExpr;
    }

    @Override
    public String toString() {
        return left.toString() + " / " + right.toString();
    }

    @Override
    public Value evaluate() {
        return ((Number) left.evaluate()).divide((Number) right.evaluate());
    }
}
