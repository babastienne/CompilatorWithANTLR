// Generated from D:/e-cosi/perso/Documents/FIL/UV Languages de programmation/structure et execution des langages de programmation/Compilateur/WORK/src/parser\Calc.g4 by ANTLR 4.6
package parser;
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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, OP=7, IDENTIFIER=8, LITERAL=9, 
		COMMENT=10, LINE_COMMENT=11, WS=12;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "OP", "IDENTIFIER", "LITERAL", 
		"COMMENT", "LINE_COMMENT", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "'define'", "')'", "'='", "'-'", "'if'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, "OP", "IDENTIFIER", "LITERAL", 
		"COMMENT", "LINE_COMMENT", "WS"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\16f\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3"+
		"\5\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\5\b\62\n\b\3\t\3\t\7\t\66\n\t\f"+
		"\t\16\t9\13\t\3\n\3\n\3\n\7\n>\n\n\f\n\16\nA\13\n\5\nC\n\n\3\13\3\13\3"+
		"\13\3\13\7\13I\n\13\f\13\16\13L\13\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f"+
		"\3\f\3\f\7\fW\n\f\f\f\16\fZ\13\f\3\f\3\f\3\f\3\f\3\r\6\ra\n\r\r\r\16\r"+
		"b\3\r\3\r\3J\2\16\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\3\2\6\4\2,-\61\61\4\2\62;c|\3\2\f\f\5\2\13\f\17\17\"\"m\2\3\3\2\2"+
		"\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3"+
		"\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2"+
		"\2\3\33\3\2\2\2\5\35\3\2\2\2\7$\3\2\2\2\t&\3\2\2\2\13(\3\2\2\2\r*\3\2"+
		"\2\2\17\61\3\2\2\2\21\63\3\2\2\2\23B\3\2\2\2\25D\3\2\2\2\27R\3\2\2\2\31"+
		"`\3\2\2\2\33\34\7*\2\2\34\4\3\2\2\2\35\36\7f\2\2\36\37\7g\2\2\37 \7h\2"+
		"\2 !\7k\2\2!\"\7p\2\2\"#\7g\2\2#\6\3\2\2\2$%\7+\2\2%\b\3\2\2\2&\'\7?\2"+
		"\2\'\n\3\2\2\2()\7/\2\2)\f\3\2\2\2*+\7k\2\2+,\7h\2\2,\16\3\2\2\2-\62\t"+
		"\2\2\2./\7?\2\2/\62\7?\2\2\60\62\7>\2\2\61-\3\2\2\2\61.\3\2\2\2\61\60"+
		"\3\2\2\2\62\20\3\2\2\2\63\67\4c|\2\64\66\t\3\2\2\65\64\3\2\2\2\669\3\2"+
		"\2\2\67\65\3\2\2\2\678\3\2\2\28\22\3\2\2\29\67\3\2\2\2:C\7\62\2\2;?\4"+
		"\63;\2<>\4\62;\2=<\3\2\2\2>A\3\2\2\2?=\3\2\2\2?@\3\2\2\2@C\3\2\2\2A?\3"+
		"\2\2\2B:\3\2\2\2B;\3\2\2\2C\24\3\2\2\2DE\7\61\2\2EF\7,\2\2FJ\3\2\2\2G"+
		"I\13\2\2\2HG\3\2\2\2IL\3\2\2\2JK\3\2\2\2JH\3\2\2\2KM\3\2\2\2LJ\3\2\2\2"+
		"MN\7,\2\2NO\7\61\2\2OP\3\2\2\2PQ\b\13\2\2Q\26\3\2\2\2RS\7\61\2\2ST\7\61"+
		"\2\2TX\3\2\2\2UW\n\4\2\2VU\3\2\2\2WZ\3\2\2\2XV\3\2\2\2XY\3\2\2\2Y[\3\2"+
		"\2\2ZX\3\2\2\2[\\\7\f\2\2\\]\3\2\2\2]^\b\f\2\2^\30\3\2\2\2_a\t\5\2\2`"+
		"_\3\2\2\2ab\3\2\2\2b`\3\2\2\2bc\3\2\2\2cd\3\2\2\2de\b\r\2\2e\32\3\2\2"+
		"\2\n\2\61\67?BJXb\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}