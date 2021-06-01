package visitors;

import antlr.PaPyBaseVisitor;
import antlr.PaPyParser;
import models.FunctionDeclaration;
import models.FunctionDeclarationArgument;
import models.Section;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.ArrayList;
import java.util.List;

public class AntlrToSection extends PaPyBaseVisitor<Section> {

    @Override
    public Section visitStatement(PaPyParser.StatementContext ctx) {
        return super.visitStatement(ctx);
    }

    @Override
    public Section visitFunctionDeclaration(PaPyParser.FunctionDeclarationContext ctx) {
        String identifier = ctx.IDENTIFIER().getText(); //The child with index 1 is always an identifier
        String returnType = null;
        if(ctx.getChild(ctx.getChildCount() - 3).getText().equals("ret")) // If the third to last child equals ret
            returnType = ctx.getChild(ctx.getChildCount() - 2).getText(); // then the second to last child is the return type so get it

        int endIndex = returnType != null ? ctx.getChildCount() - 4 : ctx.getChildCount() - 2; // If there was a return type then end arguments for loop on the fourth to last child, otherwise second to last
        List<FunctionDeclarationArgument> functionArguments = new ArrayList<>();

        for(int i = 3; i < endIndex; i+=2) {
            String argType = ctx.getChild(i).getChild(0).getChild(0).getText(); // i-th child is the i-th argument, it's child at 0 is always type, which has token at child 0, so get it
            String argIdentifier = ctx.getChild(i).getChild(1).getText(); // child at 1 of i-th argument is always the identifier
            functionArguments.add(new FunctionDeclarationArgument(argType, argIdentifier)); // store arguments
        }

        //Valid return check
        ParseTree functionBlock = ctx.functionBlock();

        //If the first to last child contains \n then the return expression is at two to last, otherwise it's at one to last child
        ParseTree returnStatement = functionBlock.getChild(functionBlock.getChildCount() - 2).getText().contains("\n") ?
                    functionBlock.getChild(functionBlock.getChildCount() - 3)
                    : functionBlock.getChild(functionBlock.getChildCount() - 2);

        //TODO something is no yes z returnStatementem gotta fix

        // Ale że tak łatwo jest zwracany pustak
        return null;
    }
}
