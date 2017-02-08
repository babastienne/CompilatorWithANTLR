package parserCCalc;

import org.antlr.v4.runtime.ConsoleErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

/**
 * Created by bpotiron on 25/01/2017.
 */
public class ErrorListener extends ConsoleErrorListener{
    public ErrorListener(){
        ErrorFlag.resetFlag(); // no error by default
    }

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol,
                            int line, int charPositionInLine, String msg, RecognitionException e) {
        super.syntaxError(recognizer, offendingSymbol, line, charPositionInLine, msg, e);
        ErrorFlag.setFlag(); // report error
    }
}
