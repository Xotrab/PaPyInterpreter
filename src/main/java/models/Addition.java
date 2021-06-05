package models;

public class Addition extends ArithmeticExpression {
    public Expression left;
    public Expression right;

    public Addition(Expression leftExpr, Expression rightExpr)
    {
        left = leftExpr;
        right = rightExpr;
    }

    @Override
    public String toString() {
        return left.toString() + " + " + right.toString();
    }

    @Override
    public Value evaluate() {
        var value = (Number) left.evaluate();
        value.add((Number) right.evaluate());
        return value;
    }
}
