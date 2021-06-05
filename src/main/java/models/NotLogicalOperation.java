package models;

public class NotLogicalOperation extends LogicalExpression {

    public Expression value;

    public NotLogicalOperation(Expression expr){
        value = expr;
    }

    @Override
    public Value evaluate() {
        return new BooleanValue(!((BooleanValue)value.evaluate()).value);
    }
}
