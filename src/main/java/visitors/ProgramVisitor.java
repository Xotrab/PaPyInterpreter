package visitors;

import antlr.PaPyBaseVisitor;
import antlr.PaPyParser;
import models.Program;

public class ProgramVisitor extends PaPyBaseVisitor<Program> {

    @Override
    public Program visitProgram(PaPyParser.ProgramContext ctx) {
        Program program = new Program();
        Interpreter interpreter = new Interpreter();

        for (var child: ctx.children) {
            program.addSection(interpreter.visit(child));
        }

        return program;
    }
}
