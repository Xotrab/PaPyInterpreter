package models;

public class FloatNumber extends Number {
    public double value; // >:D
    public FloatNumber(double val)
    {
        value = val;
    }

    @Override
    public void add(Number v) {

    }

    @Override
    public void subtract(Number v) {

    }

    @Override
    public void multiply(Number v) {

    }

    @Override
    public void divide(Number v) {

    }

    @Override
    public BooleanValue eq(Number v) {
        return new BooleanValue(value == ((FloatNumber) v).value);
    }

    @Override
    public BooleanValue neq(Number v) {
        return new BooleanValue(value != ((FloatNumber) v).value);
    }

    @Override
    public BooleanValue gte(Number v) {
        return new BooleanValue(value >= ((FloatNumber) v).value);
    }

    @Override
    public BooleanValue lte(Number v) {
        return new BooleanValue(value <= ((FloatNumber) v).value);
    }

    @Override
    public BooleanValue gt(Number v) {
        return new BooleanValue(value > ((FloatNumber) v).value);
    }

    @Override
    public BooleanValue lt(Number v) {
        return new BooleanValue(value < ((FloatNumber) v).value);
    }

    @Override
    public FloatNumber evaluate() {
        return this;
    }
}
