package models;

import java.util.List;

public class IntegerNumber extends Number {
    int value;
    public IntegerNumber(int val)
    {
        value = val;
    }

    @Override
    public String toString() {
        return Integer.toString(value);
    }

    //For now let's assume we can only add/sub/mul/div two ints and not int with float later maybe fix
    @Override
    public IntegerNumber add(Number v) {
            return new IntegerNumber(value + ((IntegerNumber) v).value);
    }

    @Override
    public IntegerNumber subtract(Number v) {
        return new IntegerNumber(value - ((IntegerNumber) v).value);
    }

    @Override
    public IntegerNumber multiply(Number v) {
        return new IntegerNumber(value * ((IntegerNumber) v).value);
    }

    @Override
    public IntegerNumber divide(Number v) {
        int divisor = ((IntegerNumber) v).value;
        if(divisor == 0)
            throw new RuntimeException("Divison by 0");
        return new IntegerNumber(value / divisor);
    }

    @Override
    public BooleanValue eq(Number v) {
        return new BooleanValue(value == ((IntegerNumber) v).value);
    }

    @Override
    public BooleanValue neq(Number v) {
        return new BooleanValue(value != ((IntegerNumber) v).value);
    }

    @Override
    public BooleanValue gte(Number v) {
        return new BooleanValue(value >= ((IntegerNumber) v).value);
    }

    @Override
    public BooleanValue lte(Number v) {
        return new BooleanValue( value <= ((IntegerNumber) v).value);
    }

    @Override
    public BooleanValue gt(Number v) {
        return new BooleanValue(value >= ((IntegerNumber) v).value);
    }

    @Override
    public BooleanValue lt(Number v) {
        return new BooleanValue(value < ((IntegerNumber) v).value);
    }

    @Override
    public IntegerNumber evaluate() {
        return this;
    }
}
