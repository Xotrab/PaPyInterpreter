package models;

import java.util.List;

public class IntegerNumber extends Value {
    int value;
    public IntegerNumber(int val)
    {
        value = val;
    }

    @Override
    public void add(Value v) {
        if(v instanceof IntegerNumber){
            value += ((IntegerNumber) v).value;
        }
    }

    @Override
    public void subtract(Value v) {
        if(v instanceof IntegerNumber){
            value -= ((IntegerNumber) v).value;
        }
    }

    @Override
    public void multiply(Value v) {
        if(v instanceof IntegerNumber){
            value *= ((IntegerNumber) v).value;
        }
    }

    @Override
    public void divide(Value v) {
        if(v instanceof IntegerNumber){
            int divisor = ((IntegerNumber) v).value;
            if(divisor == 0)
                throw new RuntimeException("Divison by 0");

            value /= ((IntegerNumber) v).value;
        }
    }

    @Override
    public Value evaluate() {
        return this;
    }
}
