package models;

public class BooleanValue extends Value {

    boolean value;

    public BooleanValue(boolean v) {
        value = v;
    }

    @Override
    public BooleanValue evaluate() {
        return this;
    }

}
