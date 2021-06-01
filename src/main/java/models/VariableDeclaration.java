package models;

public class VariableDeclaration extends Statement {

    public String type;
    public String identifier;
    public Expression value;

    public VariableDeclaration(String t, String id, Expression v){
        type = t;
        identifier = id;
        value = v;
    }
}
