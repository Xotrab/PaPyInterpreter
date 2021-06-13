package models;

public class Variable extends Statement {

    public String type;
    public String identifier;
    public Value value;

    public Variable(String t, String id, Value v){
        type = t;
        identifier = id;
        value = v;
    }
}
