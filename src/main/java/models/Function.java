package models;

import java.util.List;

public class Function extends Section {

    public String identifier;
    public List<FunctionDeclarationArgument> arguments;
    public String returnType;
    public FunctionBlock body;

    public Function(String id, List<FunctionDeclarationArgument> args, String retType, FunctionBlock functionBody){
        identifier = id;
        arguments = args;
        returnType = retType;
        body = functionBody;
    }
}
