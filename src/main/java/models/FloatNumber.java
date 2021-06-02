package models;

public class FloatNumber extends Value {
    public double value; // >:D
    public FloatNumber(double val)
    {
        value = val;
    }

    @Override
    public void add(Value v) {

    }

    @Override
    public void subtract(Value v) {

    }

    @Override
    public void multiply(Value v) {

    }

    @Override
    public void divide(Value v) {

    }

    @Override
    public Value evaluate() {
        return this;
    }
}
