package app;

import antlr.PaPyLexer;
import antlr.PaPyParser;
import listeners.SyntaxErrorListener;
import models.SemanticErrorException;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import visitors.ProgramVisitor;

import javax.xml.transform.ErrorListener;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        //For now only allow file inputs, later on add cmd mode when no args are passed
        if(args.length != 1){
            System.err.println("Please provide a file as an argument \n");
            return;
        }

        //Get the fileName from the input arguments and set up the parser
        String fileName = args[0];
        PaPyParser parser = getParser(fileName);

        //Get the abstract syntax tree starting with the program symbol
        ParseTree ast = parser.program();

        if(SyntaxErrorListener.hasError)
            return;

        //Create the program visitor and simply visit
        ProgramVisitor programVisitor = new ProgramVisitor();
        try {
            programVisitor.visit(ast);
        }
        catch (SemanticErrorException e) {
            System.err.println(e.getMessage());
        }
    }

    private static PaPyParser getParser(String fileName) {
        PaPyParser parser = null;

        try {
            CharStream input = CharStreams.fromFileName(fileName);
            PaPyLexer lexer = new PaPyLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            parser = new PaPyParser(tokens);
            parser.removeErrorListeners();
            parser.addErrorListener(new SyntaxErrorListener());
        } catch(IOException e) {
            e.printStackTrace();
        }

        return parser;
    }
}
