package models;

public class Division extends ArithmeticExpression {
    public ArithmeticExpression left;
    public ArithmeticExpression right;

    public Division(ArithmeticExpression leftExpr, ArithmeticExpression rightExpr)
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
        return null;
    }
}
