// Generated from D:/e-cosi/perso/Documents/FIL/UV Languages de programmation/structure et execution des langages de programmation/Compilateur/TP/src/parser\Calc.g4 by ANTLR 4.6
package parserCCalc;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CalcLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, LPAR=2, RPAR=3, PLUS=4, MINUS=5, TIMES=6, DIVIDE=7, EX=8, ASSERT=9, 
		OR=10, AND=11, EQUALITYRULES=12, BOOLEAN=13, MARK=14, COLON=15, IDENTIFIER=16, 
		LITERAL=17, COMMENT=18, LINE_COMMENT=19, WS=20;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "LPAR", "RPAR", "PLUS", "MINUS", "TIMES", "DIVIDE", "EX", "ASSERT", 
		"OR", "AND", "EQUALITYRULES", "BOOLEAN", "MARK", "COLON", "IDENTIFIER", 
		"LITERAL", "COMMENT", "LINE_COMMENT", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'if'", "'('", "')'", "'+'", "'-'", "'*'", "'/'", "'!'", "'='", 
		"'||'", "'&&'", null, null, "'?'", "':'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "LPAR", "RPAR", "PLUS", "MINUS", "TIMES", "DIVIDE", "EX", 
		"ASSERT", "OR", "AND", "EQUALITYRULES", "BOOLEAN", "MARK", "COLON", "IDENTIFIER", 
		"LITERAL", "COMMENT", "LINE_COMMENT", "WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public CalcLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Calc.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\26\u0091\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3"+
		"\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\rN\n\r\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\5\16Y\n\16\3\17\3\17\3\20\3\20\3\21\3\21\7\21a\n"+
		"\21\f\21\16\21d\13\21\3\22\3\22\3\22\7\22i\n\22\f\22\16\22l\13\22\5\22"+
		"n\n\22\3\23\3\23\3\23\3\23\7\23t\n\23\f\23\16\23w\13\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\24\3\24\3\24\3\24\7\24\u0082\n\24\f\24\16\24\u0085\13\24"+
		"\3\24\3\24\3\24\3\24\3\25\6\25\u008c\n\25\r\25\16\25\u008d\3\25\3\25\3"+
		"u\2\26\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17"+
		"\35\20\37\21!\22#\23%\24\'\25)\26\3\2\6\4\2>>@@\4\2\62;c|\3\2\f\f\5\2"+
		"\13\f\17\17\"\"\u009b\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2"+
		"\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\3+\3\2\2"+
		"\2\5.\3\2\2\2\7\60\3\2\2\2\t\62\3\2\2\2\13\64\3\2\2\2\r\66\3\2\2\2\17"+
		"8\3\2\2\2\21:\3\2\2\2\23<\3\2\2\2\25>\3\2\2\2\27A\3\2\2\2\31M\3\2\2\2"+
		"\33X\3\2\2\2\35Z\3\2\2\2\37\\\3\2\2\2!^\3\2\2\2#m\3\2\2\2%o\3\2\2\2\'"+
		"}\3\2\2\2)\u008b\3\2\2\2+,\7k\2\2,-\7h\2\2-\4\3\2\2\2./\7*\2\2/\6\3\2"+
		"\2\2\60\61\7+\2\2\61\b\3\2\2\2\62\63\7-\2\2\63\n\3\2\2\2\64\65\7/\2\2"+
		"\65\f\3\2\2\2\66\67\7,\2\2\67\16\3\2\2\289\7\61\2\29\20\3\2\2\2:;\7#\2"+
		"\2;\22\3\2\2\2<=\7?\2\2=\24\3\2\2\2>?\7~\2\2?@\7~\2\2@\26\3\2\2\2AB\7"+
		"(\2\2BC\7(\2\2C\30\3\2\2\2DN\t\2\2\2EF\7@\2\2FN\7?\2\2GH\7>\2\2HN\7?\2"+
		"\2IJ\7?\2\2JN\7?\2\2KL\7#\2\2LN\7?\2\2MD\3\2\2\2ME\3\2\2\2MG\3\2\2\2M"+
		"I\3\2\2\2MK\3\2\2\2N\32\3\2\2\2OP\7v\2\2PQ\7t\2\2QR\7w\2\2RY\7g\2\2ST"+
		"\7h\2\2TU\7c\2\2UV\7n\2\2VW\7u\2\2WY\7g\2\2XO\3\2\2\2XS\3\2\2\2Y\34\3"+
		"\2\2\2Z[\7A\2\2[\36\3\2\2\2\\]\7<\2\2] \3\2\2\2^b\4c|\2_a\t\3\2\2`_\3"+
		"\2\2\2ad\3\2\2\2b`\3\2\2\2bc\3\2\2\2c\"\3\2\2\2db\3\2\2\2en\7\62\2\2f"+
		"j\4\63;\2gi\4\62;\2hg\3\2\2\2il\3\2\2\2jh\3\2\2\2jk\3\2\2\2kn\3\2\2\2"+
		"lj\3\2\2\2me\3\2\2\2mf\3\2\2\2n$\3\2\2\2op\7\61\2\2pq\7,\2\2qu\3\2\2\2"+
		"rt\13\2\2\2sr\3\2\2\2tw\3\2\2\2uv\3\2\2\2us\3\2\2\2vx\3\2\2\2wu\3\2\2"+
		"\2xy\7,\2\2yz\7\61\2\2z{\3\2\2\2{|\b\23\2\2|&\3\2\2\2}~\7\61\2\2~\177"+
		"\7\61\2\2\177\u0083\3\2\2\2\u0080\u0082\n\4\2\2\u0081\u0080\3\2\2\2\u0082"+
		"\u0085\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0086\3\2"+
		"\2\2\u0085\u0083\3\2\2\2\u0086\u0087\7\f\2\2\u0087\u0088\3\2\2\2\u0088"+
		"\u0089\b\24\2\2\u0089(\3\2\2\2\u008a\u008c\t\5\2\2\u008b\u008a\3\2\2\2"+
		"\u008c\u008d\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u008f"+
		"\3\2\2\2\u008f\u0090\b\25\2\2\u0090*\3\2\2\2\13\2MXbjmu\u0083\u008d\3"+
		"\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}