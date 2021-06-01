package models;

import java.util.List;

public class FunctionBlock {
    public List<Statement> statements;
    public Expression returnExpression;

    public FunctionBlock(List<Statement> list, Expression retExpr) {
        statements = list;
        returnExpression = retExpr;
    }
}
