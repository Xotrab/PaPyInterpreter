package models;

public class BooleanValue extends Value {

    public boolean value;

    public BooleanValue(boolean v) {
        value = v;
    }

    @Override
    public String toString() {
        return value ? "True" : "False";
    }

    @Override
    public BooleanValue evaluate() {
        return this;
    }

}
