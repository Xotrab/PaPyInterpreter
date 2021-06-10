package models;

public class FloatNumber extends Number {
    public double value; // >:D
    public FloatNumber(double val)
    {
        value = val;
    }

    @Override
    public String toString() {
        return Double.toString(value);
    }

    @Override
    public FloatNumber add(Number v) {
        return new FloatNumber(value + ((FloatNumber) v).value);
    }

    @Override
    public FloatNumber subtract(Number v) {
        return new FloatNumber(value - ((FloatNumber) v).value);
    }

    @Override
    public FloatNumber multiply(Number v) {
        return new FloatNumber(value * ((FloatNumber) v).value);
    }

    @Override
    public FloatNumber divide(Number v) {
        double divisor = ((FloatNumber) v).value;
        if(divisor == 0.0)
            throw new RuntimeException("Divison by 0");
        return new FloatNumber(value / divisor);
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
