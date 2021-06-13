package models;

import org.antlr.v4.runtime.tree.ParseTree;

import java.util.List;

public class Function extends Section {

    public String identifier;
    public List<FunctionDeclarationArgument> arguments;
    public String returnType;
    public ParseTree body;

    public Function(String id, List<FunctionDeclarationArgument> args, String retType, ParseTree functionBody){
        identifier = id;
        arguments = args;
        returnType = retType;
        body = functionBody;
    }
}
