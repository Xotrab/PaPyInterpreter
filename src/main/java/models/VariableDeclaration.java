package models;

public class VariableDeclaration extends Statement {

    public Type type;
    public String identifier;
    public Expression value;

    public VariableDeclaration(Type t, String id, Expression v){
        type = t;
        identifier = id;
        value = v;
    }
}
