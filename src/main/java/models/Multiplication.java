package models;

public class Multiplication extends ArithmeticExpression{
    public Expression left;
    public Expression right;

    public Multiplication(Expression leftExpr, Expression rightExpr)
    {
        left = leftExpr;
        right = rightExpr;
    }

    @Override
    public String toString() {
        return left.toString() + " * " + right.toString();
    }

    @Override
    public Value evaluate() {
        var value = (Number) left.evaluate();
        value.multiply((Number) right.evaluate());
        return value;
    }
}
