package models;

import java.util.List;

public class IntegerNumber extends Number {
    int value;
    public IntegerNumber(int val)
    {
        value = val;
    }

    @Override
    public void add(Number v) {
        if(v instanceof IntegerNumber){
            value += ((IntegerNumber) v).value;
        }
    }

    @Override
    public void subtract(Number v) {
        if(v instanceof IntegerNumber){
            value -= ((IntegerNumber) v).value;
        }
    }

    @Override
    public void multiply(Number v) {
        if(v instanceof IntegerNumber){
            value *= ((IntegerNumber) v).value;
        }
    }

    @Override
    public void divide(Number v) {
        if(v instanceof IntegerNumber){
            int divisor = ((IntegerNumber) v).value;
            if(divisor == 0)
                throw new RuntimeException("Divison by 0");

            value /= ((IntegerNumber) v).value;
        }
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
