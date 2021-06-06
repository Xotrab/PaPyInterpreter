package models;

public class BinaryLogicalOperation extends LogicalExpression {

    public Expression left;
    public Expression right;
    public String operator;

    public BinaryLogicalOperation(Expression l, Expression r, String op){
        left = l;
        right = r;
        operator = op;
    }

    @Override
    public Value evaluate() {
        switch(operator) {
            case "and":
                return new BooleanValue(((BooleanValue)left.evaluate()).value && ((BooleanValue)right.evaluate()).value);
            case "or":
                return new BooleanValue(((BooleanValue)left.evaluate()).value || ((BooleanValue)right.evaluate()).value);
            default:
                return null;
        }
    }
}
