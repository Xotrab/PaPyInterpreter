package models;

public class Addition extends ArithmeticExpression {
    public ArithmeticExpression left;
    public ArithmeticExpression right;

    public Addition(ArithmeticExpression leftExpr, ArithmeticExpression rightExpr)
    {
        left = leftExpr;
        right = rightExpr;
    }

    @Override
    public String toString() {
        return left.toString() + " + " + right.toString();
    }
}
