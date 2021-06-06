package models;

public abstract class Number extends Value {
    public abstract Number add(Number v);
    public abstract Number subtract(Number v);
    public abstract Number multiply(Number v);
    public abstract Number divide(Number v);
    public abstract BooleanValue eq(Number v);
    public abstract BooleanValue neq(Number v);
    public abstract BooleanValue gte(Number v);
    public abstract BooleanValue lte(Number v);
    public abstract BooleanValue gt(Number v);
    public abstract BooleanValue lt(Number v);
}
