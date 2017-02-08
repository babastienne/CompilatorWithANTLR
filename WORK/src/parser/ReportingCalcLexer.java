package parser;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.LexerNoViableAltException;

/**
 * Created by bpotiron on 16/01/2017.
 */
public class ReportingCalcLexer extends CalcLexer {

    public ReportingCalcLexer(CharStream input) {
        super(input);
    }

    public void recover(LexerNoViableAltException e) {
        ErrorFlag.setFlag(); // report error
        super.recover(e);
    }
}