package models;

public class Subtraction extends ArithmeticExpression {
    public ArithmeticExpression left;
    public ArithmeticExpression right;

    public Subtraction(ArithmeticExpression leftExpr, ArithmeticExpression rightExpr)
    {
        left = leftExpr;
        right = rightExpr;
    }

    @Override
    public String toString() {
        return left.toString() + " - " + right.toString();
    }
}
