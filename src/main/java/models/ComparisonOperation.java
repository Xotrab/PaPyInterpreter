package models;

public class ComparisonOperation extends Expression {

    public Expression left;
    public Expression right;
    public String operator;

    public ComparisonOperation(Expression l, Expression r, String op) {
        left = l;
        right = r;
        operator = op;
    }

    @Override
    public Value evaluate() {
        switch(operator) {
            case "==":
                return ((Number) left.evaluate()).eq((Number) right.evaluate());
            case "!=":
                return ((Number) left.evaluate()).neq((Number) right.evaluate());
            case ">=":
                return ((Number) left.evaluate()).gte((Number) right.evaluate());
            case "<=":
                return ((Number) left.evaluate()).lte((Number) right.evaluate());
            case ">":
                return ((Number) left.evaluate()).gt((Number) right.evaluate());
            case "<":
                return ((Number) left.evaluate()).lt((Number) right.evaluate());
            default:
                return null;
        }
    }
}
