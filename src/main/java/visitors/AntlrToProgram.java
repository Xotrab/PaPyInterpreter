package visitors;

import antlr.PaPyBaseVisitor;
import antlr.PaPyParser;
import models.Program;

public class AntlrToProgram extends PaPyBaseVisitor<Program> {

    @Override
    public Program visitProgram(PaPyParser.ProgramContext ctx) {
        Program program = new Program();
        AntlrToSection sectionVisitor = new AntlrToSection();
        for (var child: ctx.children) {
            program.addSection(sectionVisitor.visit(child));
        }

        return program;
    }
}
