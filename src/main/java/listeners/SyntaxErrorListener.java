package listeners;

import org.antlr.v4.runtime.*;

import java.util.Collections;
import java.util.List;

public class SyntaxErrorListener extends BaseErrorListener {
    public static boolean hasError = false;

    @Override
    public void syntaxError(
            Recognizer<?, ?> recognizer,
            Object offendingSymbol,
            int line,
            int charPositionInLine,
            String msg,
            RecognitionException e) {

        if(hasError)
            return;

        List<String> stack = ((Parser) recognizer).getRuleInvocationStack();
        Collections.reverse(stack);
        System.err.print("Syntax Error: ");
        System.err.println("token " + "\"" + ((Token) offendingSymbol).getText() + "\""
                +
                " (line " + line + ", column " + (charPositionInLine + 1) + ")"
                );

        hasError = true;
    }


}
