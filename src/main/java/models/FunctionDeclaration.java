package models;

import java.util.List;

public class FunctionDeclaration extends Section {

    public String identifier;
    public List<FunctionDeclarationArgument> arguments;
    public Type returnType;

    public FunctionDeclaration(String id, List<FunctionDeclarationArgument> args, Type retType){
        identifier = id;
        arguments = args;
        returnType = retType;
    }
}
