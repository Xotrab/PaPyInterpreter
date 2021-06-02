package models;

public abstract class Value extends Expression {
    public abstract void add(Value v);
    public abstract void subtract(Value v);
    public abstract void multiply(Value v);
    public abstract void divide(Value v);

}