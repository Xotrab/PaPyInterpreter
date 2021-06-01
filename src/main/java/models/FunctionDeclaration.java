package models;

import java.util.List;

public class FunctionDeclaration extends Section {

    public String identifier;
    public List<FunctionDeclarationArgument> arguments;
    public Type returnType;
    public FunctionBlock body;

    public FunctionDeclaration(String id, List<FunctionDeclarationArgument> args, Type retType, FunctionBlock functionBody){
        identifier = id;
        arguments = args;
        returnType = retType;
        body = functionBody;
    }
}
