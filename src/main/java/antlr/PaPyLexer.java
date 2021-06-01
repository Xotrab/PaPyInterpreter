// Generated from PaPy.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PaPyLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NL=1, EMPTY_LINE=2, LBR=3, RBR=4, LPAR=5, RPAR=6, LSQBR=7, RSQBR=8, INT=9, 
		FLOAT=10, STRING=11, INT_TYPE=12, FLOAT_TYPE=13, BOOL_TYPE=14, STRING_TYPE=15, 
		COMMENT=16, FOR=17, IN=18, WHILE=19, IF=20, ELSE=21, ELIF=22, MUL=23, 
		ADD=24, SUB=25, DIV=26, REMOVE_AT=27, ASSIGN=28, EQ=29, NEQ=30, LTE=31, 
		GTE=32, GT=33, LT=34, AND=35, OR=36, NOT=37, TRUE=38, FALSE=39, DEF=40, 
		RET=41, RETURN=42, COMMA=43, DOT=44, TAB=45, SPACES=46, IDENTIFIER=47;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"NL", "EMPTY_LINE", "LBR", "RBR", "LPAR", "RPAR", "LSQBR", "RSQBR", "INT", 
			"FLOAT", "STRING", "INT_TYPE", "FLOAT_TYPE", "BOOL_TYPE", "STRING_TYPE", 
			"COMMENT", "FOR", "IN", "WHILE", "IF", "ELSE", "ELIF", "MUL", "ADD", 
			"SUB", "DIV", "REMOVE_AT", "ASSIGN", "EQ", "NEQ", "LTE", "GTE", "GT", 
			"LT", "AND", "OR", "NOT", "TRUE", "FALSE", "DEF", "RET", "RETURN", "COMMA", 
			"DOT", "TAB", "SPACES", "IDENTIFIER"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'{'", "'}'", "'('", "')'", "'['", "']'", null, null, 
			null, "'int'", "'float'", "'bool'", "'string'", null, "'for'", "'in'", 
			"'while'", "'if'", "'else'", "'elif'", "'*'", "'+'", "'-'", "'/'", "'@-'", 
			"'='", "'=='", "'!='", "'<='", "'>='", "'>'", "'<'", "'and'", "'or'", 
			"'not'", "'True'", "'False'", "'def'", "'ret'", "'return'", "','", "'.'", 
			"'\t'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "NL", "EMPTY_LINE", "LBR", "RBR", "LPAR", "RPAR", "LSQBR", "RSQBR", 
			"INT", "FLOAT", "STRING", "INT_TYPE", "FLOAT_TYPE", "BOOL_TYPE", "STRING_TYPE", 
			"COMMENT", "FOR", "IN", "WHILE", "IF", "ELSE", "ELIF", "MUL", "ADD", 
			"SUB", "DIV", "REMOVE_AT", "ASSIGN", "EQ", "NEQ", "LTE", "GTE", "GT", 
			"LT", "AND", "OR", "NOT", "TRUE", "FALSE", "DEF", "RET", "RETURN", "COMMA", 
			"DOT", "TAB", "SPACES", "IDENTIFIER"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public PaPyLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "PaPy.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\61\u011b\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\3\2\5\2c\n\2\3\2\3\2\3\3\3\3\3\3\3"+
		"\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\7\ny\n\n\f"+
		"\n\16\n|\13\n\5\n~\n\n\3\13\3\13\3\13\3\13\3\f\3\f\7\f\u0086\n\f\f\f\16"+
		"\f\u0089\13\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\7"+
		"\21\u00a5\n\21\f\21\16\21\u00a8\13\21\3\21\3\21\3\22\3\22\3\22\3\22\3"+
		"\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3"+
		"\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3"+
		"\33\3\33\3\34\3\34\3\34\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 "+
		"\3 \3!\3!\3!\3\"\3\"\3#\3#\3$\3$\3$\3$\3%\3%\3%\3&\3&\3&\3&\3\'\3\'\3"+
		"\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3*\3*\3*\3*\3+\3+\3+\3+\3+\3"+
		"+\3+\3,\3,\3-\3-\3.\3.\3/\6/\u010f\n/\r/\16/\u0110\3/\3/\3\60\3\60\7\60"+
		"\u0117\n\60\f\60\16\60\u011a\13\60\2\2\61\3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+"+
		"\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+"+
		"U,W-Y.[/]\60_\61\3\2\t\3\2\63;\3\2\62;\3\2$$\4\2\f\f\17\17\3\2\"\"\4\2"+
		"C\\c|\6\2\62;C\\aac|\2\u0121\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3"+
		"\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2"+
		"\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37"+
		"\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3"+
		"\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2"+
		"\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C"+
		"\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2"+
		"\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2"+
		"\2]\3\2\2\2\2_\3\2\2\2\3b\3\2\2\2\5f\3\2\2\2\7i\3\2\2\2\tk\3\2\2\2\13"+
		"m\3\2\2\2\ro\3\2\2\2\17q\3\2\2\2\21s\3\2\2\2\23}\3\2\2\2\25\177\3\2\2"+
		"\2\27\u0083\3\2\2\2\31\u008c\3\2\2\2\33\u0090\3\2\2\2\35\u0096\3\2\2\2"+
		"\37\u009b\3\2\2\2!\u00a2\3\2\2\2#\u00ab\3\2\2\2%\u00af\3\2\2\2\'\u00b2"+
		"\3\2\2\2)\u00b8\3\2\2\2+\u00bb\3\2\2\2-\u00c0\3\2\2\2/\u00c5\3\2\2\2\61"+
		"\u00c7\3\2\2\2\63\u00c9\3\2\2\2\65\u00cb\3\2\2\2\67\u00cd\3\2\2\29\u00d0"+
		"\3\2\2\2;\u00d2\3\2\2\2=\u00d5\3\2\2\2?\u00d8\3\2\2\2A\u00db\3\2\2\2C"+
		"\u00de\3\2\2\2E\u00e0\3\2\2\2G\u00e2\3\2\2\2I\u00e6\3\2\2\2K\u00e9\3\2"+
		"\2\2M\u00ed\3\2\2\2O\u00f2\3\2\2\2Q\u00f8\3\2\2\2S\u00fc\3\2\2\2U\u0100"+
		"\3\2\2\2W\u0107\3\2\2\2Y\u0109\3\2\2\2[\u010b\3\2\2\2]\u010e\3\2\2\2_"+
		"\u0114\3\2\2\2ac\7\17\2\2ba\3\2\2\2bc\3\2\2\2cd\3\2\2\2de\7\f\2\2e\4\3"+
		"\2\2\2fg\5\3\2\2gh\5\3\2\2h\6\3\2\2\2ij\7}\2\2j\b\3\2\2\2kl\7\177\2\2"+
		"l\n\3\2\2\2mn\7*\2\2n\f\3\2\2\2op\7+\2\2p\16\3\2\2\2qr\7]\2\2r\20\3\2"+
		"\2\2st\7_\2\2t\22\3\2\2\2u~\7\62\2\2vz\t\2\2\2wy\t\3\2\2xw\3\2\2\2y|\3"+
		"\2\2\2zx\3\2\2\2z{\3\2\2\2{~\3\2\2\2|z\3\2\2\2}u\3\2\2\2}v\3\2\2\2~\24"+
		"\3\2\2\2\177\u0080\5\23\n\2\u0080\u0081\5Y-\2\u0081\u0082\5\23\n\2\u0082"+
		"\26\3\2\2\2\u0083\u0087\7$\2\2\u0084\u0086\n\4\2\2\u0085\u0084\3\2\2\2"+
		"\u0086\u0089\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u008a"+
		"\3\2\2\2\u0089\u0087\3\2\2\2\u008a\u008b\7$\2\2\u008b\30\3\2\2\2\u008c"+
		"\u008d\7k\2\2\u008d\u008e\7p\2\2\u008e\u008f\7v\2\2\u008f\32\3\2\2\2\u0090"+
		"\u0091\7h\2\2\u0091\u0092\7n\2\2\u0092\u0093\7q\2\2\u0093\u0094\7c\2\2"+
		"\u0094\u0095\7v\2\2\u0095\34\3\2\2\2\u0096\u0097\7d\2\2\u0097\u0098\7"+
		"q\2\2\u0098\u0099\7q\2\2\u0099\u009a\7n\2\2\u009a\36\3\2\2\2\u009b\u009c"+
		"\7u\2\2\u009c\u009d\7v\2\2\u009d\u009e\7t\2\2\u009e\u009f\7k\2\2\u009f"+
		"\u00a0\7p\2\2\u00a0\u00a1\7i\2\2\u00a1 \3\2\2\2\u00a2\u00a6\7%\2\2\u00a3"+
		"\u00a5\n\5\2\2\u00a4\u00a3\3\2\2\2\u00a5\u00a8\3\2\2\2\u00a6\u00a4\3\2"+
		"\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a9\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a9"+
		"\u00aa\b\21\2\2\u00aa\"\3\2\2\2\u00ab\u00ac\7h\2\2\u00ac\u00ad\7q\2\2"+
		"\u00ad\u00ae\7t\2\2\u00ae$\3\2\2\2\u00af\u00b0\7k\2\2\u00b0\u00b1\7p\2"+
		"\2\u00b1&\3\2\2\2\u00b2\u00b3\7y\2\2\u00b3\u00b4\7j\2\2\u00b4\u00b5\7"+
		"k\2\2\u00b5\u00b6\7n\2\2\u00b6\u00b7\7g\2\2\u00b7(\3\2\2\2\u00b8\u00b9"+
		"\7k\2\2\u00b9\u00ba\7h\2\2\u00ba*\3\2\2\2\u00bb\u00bc\7g\2\2\u00bc\u00bd"+
		"\7n\2\2\u00bd\u00be\7u\2\2\u00be\u00bf\7g\2\2\u00bf,\3\2\2\2\u00c0\u00c1"+
		"\7g\2\2\u00c1\u00c2\7n\2\2\u00c2\u00c3\7k\2\2\u00c3\u00c4\7h\2\2\u00c4"+
		".\3\2\2\2\u00c5\u00c6\7,\2\2\u00c6\60\3\2\2\2\u00c7\u00c8\7-\2\2\u00c8"+
		"\62\3\2\2\2\u00c9\u00ca\7/\2\2\u00ca\64\3\2\2\2\u00cb\u00cc\7\61\2\2\u00cc"+
		"\66\3\2\2\2\u00cd\u00ce\7B\2\2\u00ce\u00cf\7/\2\2\u00cf8\3\2\2\2\u00d0"+
		"\u00d1\7?\2\2\u00d1:\3\2\2\2\u00d2\u00d3\7?\2\2\u00d3\u00d4\7?\2\2\u00d4"+
		"<\3\2\2\2\u00d5\u00d6\7#\2\2\u00d6\u00d7\7?\2\2\u00d7>\3\2\2\2\u00d8\u00d9"+
		"\7>\2\2\u00d9\u00da\7?\2\2\u00da@\3\2\2\2\u00db\u00dc\7@\2\2\u00dc\u00dd"+
		"\7?\2\2\u00ddB\3\2\2\2\u00de\u00df\7@\2\2\u00dfD\3\2\2\2\u00e0\u00e1\7"+
		">\2\2\u00e1F\3\2\2\2\u00e2\u00e3\7c\2\2\u00e3\u00e4\7p\2\2\u00e4\u00e5"+
		"\7f\2\2\u00e5H\3\2\2\2\u00e6\u00e7\7q\2\2\u00e7\u00e8\7t\2\2\u00e8J\3"+
		"\2\2\2\u00e9\u00ea\7p\2\2\u00ea\u00eb\7q\2\2\u00eb\u00ec\7v\2\2\u00ec"+
		"L\3\2\2\2\u00ed\u00ee\7V\2\2\u00ee\u00ef\7t\2\2\u00ef\u00f0\7w\2\2\u00f0"+
		"\u00f1\7g\2\2\u00f1N\3\2\2\2\u00f2\u00f3\7H\2\2\u00f3\u00f4\7c\2\2\u00f4"+
		"\u00f5\7n\2\2\u00f5\u00f6\7u\2\2\u00f6\u00f7\7g\2\2\u00f7P\3\2\2\2\u00f8"+
		"\u00f9\7f\2\2\u00f9\u00fa\7g\2\2\u00fa\u00fb\7h\2\2\u00fbR\3\2\2\2\u00fc"+
		"\u00fd\7t\2\2\u00fd\u00fe\7g\2\2\u00fe\u00ff\7v\2\2\u00ffT\3\2\2\2\u0100"+
		"\u0101\7t\2\2\u0101\u0102\7g\2\2\u0102\u0103\7v\2\2\u0103\u0104\7w\2\2"+
		"\u0104\u0105\7t\2\2\u0105\u0106\7p\2\2\u0106V\3\2\2\2\u0107\u0108\7.\2"+
		"\2\u0108X\3\2\2\2\u0109\u010a\7\60\2\2\u010aZ\3\2\2\2\u010b\u010c\7\13"+
		"\2\2\u010c\\\3\2\2\2\u010d\u010f\t\6\2\2\u010e\u010d\3\2\2\2\u010f\u0110"+
		"\3\2\2\2\u0110\u010e\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u0112\3\2\2\2\u0112"+
		"\u0113\b/\2\2\u0113^\3\2\2\2\u0114\u0118\t\7\2\2\u0115\u0117\t\b\2\2\u0116"+
		"\u0115\3\2\2\2\u0117\u011a\3\2\2\2\u0118\u0116\3\2\2\2\u0118\u0119\3\2"+
		"\2\2\u0119`\3\2\2\2\u011a\u0118\3\2\2\2\n\2bz}\u0087\u00a6\u0110\u0118"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}