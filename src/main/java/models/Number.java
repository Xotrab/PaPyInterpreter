package models;

public abstract class Number extends Value {
    public abstract void add(Number v);
    public abstract void subtract(Number v);
    public abstract void multiply(Number v);
    public abstract void divide(Number v);
    public abstract BooleanValue eq(Number v);
    public abstract BooleanValue neq(Number v);
    public abstract BooleanValue gte(Number v);
    public abstract BooleanValue lte(Number v);
    public abstract BooleanValue gt(Number v);
    public abstract BooleanValue lt(Number v);
}
