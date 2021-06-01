package models;

public class Multiplication extends ArithmeticExpression{
    public ArithmeticExpression left;
    public ArithmeticExpression right;

    public Multiplication(ArithmeticExpression leftExpr, ArithmeticExpression rightExpr)
    {
        left = leftExpr;
        right = rightExpr;
    }

    @Override
    public String toString() {
        return left.toString() + " * " + right.toString();
    }
}
