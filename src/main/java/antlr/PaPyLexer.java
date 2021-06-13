// Generated from src\main\java\antlr\PaPy.g4 by ANTLR 4.9.2
 package antlr;
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
		NL=1, LBR=2, RBR=3, LPAR=4, RPAR=5, LSQBR=6, RSQBR=7, INT=8, FLOAT=9, 
		STRING=10, INT_TYPE=11, FLOAT_TYPE=12, BOOL_TYPE=13, STRING_TYPE=14, COMMENT=15, 
		FOR=16, IN=17, WHILE=18, IF=19, ELSE=20, ELIF=21, MUL=22, ADD=23, SUB=24, 
		DIV=25, REMOVE_AT=26, ASSIGN=27, EQ=28, NEQ=29, LTE=30, GTE=31, GT=32, 
		LT=33, AND=34, OR=35, NOT=36, TRUE=37, FALSE=38, DEF=39, RET=40, RETURN=41, 
		COMMA=42, DOT=43, TAB=44, SPACES=45, IDENTIFIER=46, ERROR=47;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"NL", "LBR", "RBR", "LPAR", "RPAR", "LSQBR", "RSQBR", "INT", "FLOAT", 
			"STRING", "INT_TYPE", "FLOAT_TYPE", "BOOL_TYPE", "STRING_TYPE", "COMMENT", 
			"FOR", "IN", "WHILE", "IF", "ELSE", "ELIF", "MUL", "ADD", "SUB", "DIV", 
			"REMOVE_AT", "ASSIGN", "EQ", "NEQ", "LTE", "GTE", "GT", "LT", "AND", 
			"OR", "NOT", "TRUE", "FALSE", "DEF", "RET", "RETURN", "COMMA", "DOT", 
			"TAB", "SPACES", "IDENTIFIER", "ERROR"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'{'", "'}'", "'('", "')'", "'['", "']'", null, null, null, 
			"'int'", "'float'", "'bool'", "'string'", null, "'for'", "'in'", "'while'", 
			"'if'", "'else'", "'elif'", "'*'", "'+'", "'-'", "'/'", "'@-'", "'='", 
			"'=='", "'!='", "'<='", "'>='", "'>'", "'<'", "'and'", "'or'", "'not'", 
			"'True'", "'False'", "'def'", "'ret'", "'return'", "','", "'.'", "'\t'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "NL", "LBR", "RBR", "LPAR", "RPAR", "LSQBR", "RSQBR", "INT", "FLOAT", 
			"STRING", "INT_TYPE", "FLOAT_TYPE", "BOOL_TYPE", "STRING_TYPE", "COMMENT", 
			"FOR", "IN", "WHILE", "IF", "ELSE", "ELIF", "MUL", "ADD", "SUB", "DIV", 
			"REMOVE_AT", "ASSIGN", "EQ", "NEQ", "LTE", "GTE", "GT", "LT", "AND", 
			"OR", "NOT", "TRUE", "FALSE", "DEF", "RET", "RETURN", "COMMA", "DOT", 
			"TAB", "SPACES", "IDENTIFIER", "ERROR"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\61\u011a\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\3\2\5\2c\n\2\3\2\3\2\3\3\3\3\3\4\3"+
		"\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\7\tv\n\t\f\t\16\ty\13\t"+
		"\5\t{\n\t\3\n\3\n\3\n\3\n\3\13\3\13\7\13\u0083\n\13\f\13\16\13\u0086\13"+
		"\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3"+
		"\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\7\20\u00a2\n\20"+
		"\f\20\16\20\u00a5\13\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3"+
		"\26\3\26\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3"+
		"\33\3\33\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 "+
		"\3 \3!\3!\3\"\3\"\3#\3#\3#\3#\3$\3$\3$\3%\3%\3%\3%\3&\3&\3&\3&\3&\3\'"+
		"\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3+\3"+
		"+\3,\3,\3-\3-\3.\6.\u010c\n.\r.\16.\u010d\3.\3.\3/\3/\7/\u0114\n/\f/\16"+
		"/\u0117\13/\3\60\3\60\2\2\61\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61"+
		"\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61"+
		"\3\2\t\3\2\63;\3\2\62;\3\2$$\4\2\f\f\17\17\3\2\"\"\4\2C\\c|\6\2\62;C\\"+
		"aac|\2\u0120\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2"+
		"\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2"+
		"\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2"+
		"\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3"+
		"\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2"+
		"\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2"+
		"S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3"+
		"\2\2\2\3b\3\2\2\2\5f\3\2\2\2\7h\3\2\2\2\tj\3\2\2\2\13l\3\2\2\2\rn\3\2"+
		"\2\2\17p\3\2\2\2\21z\3\2\2\2\23|\3\2\2\2\25\u0080\3\2\2\2\27\u0089\3\2"+
		"\2\2\31\u008d\3\2\2\2\33\u0093\3\2\2\2\35\u0098\3\2\2\2\37\u009f\3\2\2"+
		"\2!\u00a8\3\2\2\2#\u00ac\3\2\2\2%\u00af\3\2\2\2\'\u00b5\3\2\2\2)\u00b8"+
		"\3\2\2\2+\u00bd\3\2\2\2-\u00c2\3\2\2\2/\u00c4\3\2\2\2\61\u00c6\3\2\2\2"+
		"\63\u00c8\3\2\2\2\65\u00ca\3\2\2\2\67\u00cd\3\2\2\29\u00cf\3\2\2\2;\u00d2"+
		"\3\2\2\2=\u00d5\3\2\2\2?\u00d8\3\2\2\2A\u00db\3\2\2\2C\u00dd\3\2\2\2E"+
		"\u00df\3\2\2\2G\u00e3\3\2\2\2I\u00e6\3\2\2\2K\u00ea\3\2\2\2M\u00ef\3\2"+
		"\2\2O\u00f5\3\2\2\2Q\u00f9\3\2\2\2S\u00fd\3\2\2\2U\u0104\3\2\2\2W\u0106"+
		"\3\2\2\2Y\u0108\3\2\2\2[\u010b\3\2\2\2]\u0111\3\2\2\2_\u0118\3\2\2\2a"+
		"c\7\17\2\2ba\3\2\2\2bc\3\2\2\2cd\3\2\2\2de\7\f\2\2e\4\3\2\2\2fg\7}\2\2"+
		"g\6\3\2\2\2hi\7\177\2\2i\b\3\2\2\2jk\7*\2\2k\n\3\2\2\2lm\7+\2\2m\f\3\2"+
		"\2\2no\7]\2\2o\16\3\2\2\2pq\7_\2\2q\20\3\2\2\2r{\7\62\2\2sw\t\2\2\2tv"+
		"\t\3\2\2ut\3\2\2\2vy\3\2\2\2wu\3\2\2\2wx\3\2\2\2x{\3\2\2\2yw\3\2\2\2z"+
		"r\3\2\2\2zs\3\2\2\2{\22\3\2\2\2|}\5\21\t\2}~\5W,\2~\177\5\21\t\2\177\24"+
		"\3\2\2\2\u0080\u0084\7$\2\2\u0081\u0083\n\4\2\2\u0082\u0081\3\2\2\2\u0083"+
		"\u0086\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0087\3\2"+
		"\2\2\u0086\u0084\3\2\2\2\u0087\u0088\7$\2\2\u0088\26\3\2\2\2\u0089\u008a"+
		"\7k\2\2\u008a\u008b\7p\2\2\u008b\u008c\7v\2\2\u008c\30\3\2\2\2\u008d\u008e"+
		"\7h\2\2\u008e\u008f\7n\2\2\u008f\u0090\7q\2\2\u0090\u0091\7c\2\2\u0091"+
		"\u0092\7v\2\2\u0092\32\3\2\2\2\u0093\u0094\7d\2\2\u0094\u0095\7q\2\2\u0095"+
		"\u0096\7q\2\2\u0096\u0097\7n\2\2\u0097\34\3\2\2\2\u0098\u0099\7u\2\2\u0099"+
		"\u009a\7v\2\2\u009a\u009b\7t\2\2\u009b\u009c\7k\2\2\u009c\u009d\7p\2\2"+
		"\u009d\u009e\7i\2\2\u009e\36\3\2\2\2\u009f\u00a3\7%\2\2\u00a0\u00a2\n"+
		"\5\2\2\u00a1\u00a0\3\2\2\2\u00a2\u00a5\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3"+
		"\u00a4\3\2\2\2\u00a4\u00a6\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a6\u00a7\b\20"+
		"\2\2\u00a7 \3\2\2\2\u00a8\u00a9\7h\2\2\u00a9\u00aa\7q\2\2\u00aa\u00ab"+
		"\7t\2\2\u00ab\"\3\2\2\2\u00ac\u00ad\7k\2\2\u00ad\u00ae\7p\2\2\u00ae$\3"+
		"\2\2\2\u00af\u00b0\7y\2\2\u00b0\u00b1\7j\2\2\u00b1\u00b2\7k\2\2\u00b2"+
		"\u00b3\7n\2\2\u00b3\u00b4\7g\2\2\u00b4&\3\2\2\2\u00b5\u00b6\7k\2\2\u00b6"+
		"\u00b7\7h\2\2\u00b7(\3\2\2\2\u00b8\u00b9\7g\2\2\u00b9\u00ba\7n\2\2\u00ba"+
		"\u00bb\7u\2\2\u00bb\u00bc\7g\2\2\u00bc*\3\2\2\2\u00bd\u00be\7g\2\2\u00be"+
		"\u00bf\7n\2\2\u00bf\u00c0\7k\2\2\u00c0\u00c1\7h\2\2\u00c1,\3\2\2\2\u00c2"+
		"\u00c3\7,\2\2\u00c3.\3\2\2\2\u00c4\u00c5\7-\2\2\u00c5\60\3\2\2\2\u00c6"+
		"\u00c7\7/\2\2\u00c7\62\3\2\2\2\u00c8\u00c9\7\61\2\2\u00c9\64\3\2\2\2\u00ca"+
		"\u00cb\7B\2\2\u00cb\u00cc\7/\2\2\u00cc\66\3\2\2\2\u00cd\u00ce\7?\2\2\u00ce"+
		"8\3\2\2\2\u00cf\u00d0\7?\2\2\u00d0\u00d1\7?\2\2\u00d1:\3\2\2\2\u00d2\u00d3"+
		"\7#\2\2\u00d3\u00d4\7?\2\2\u00d4<\3\2\2\2\u00d5\u00d6\7>\2\2\u00d6\u00d7"+
		"\7?\2\2\u00d7>\3\2\2\2\u00d8\u00d9\7@\2\2\u00d9\u00da\7?\2\2\u00da@\3"+
		"\2\2\2\u00db\u00dc\7@\2\2\u00dcB\3\2\2\2\u00dd\u00de\7>\2\2\u00deD\3\2"+
		"\2\2\u00df\u00e0\7c\2\2\u00e0\u00e1\7p\2\2\u00e1\u00e2\7f\2\2\u00e2F\3"+
		"\2\2\2\u00e3\u00e4\7q\2\2\u00e4\u00e5\7t\2\2\u00e5H\3\2\2\2\u00e6\u00e7"+
		"\7p\2\2\u00e7\u00e8\7q\2\2\u00e8\u00e9\7v\2\2\u00e9J\3\2\2\2\u00ea\u00eb"+
		"\7V\2\2\u00eb\u00ec\7t\2\2\u00ec\u00ed\7w\2\2\u00ed\u00ee\7g\2\2\u00ee"+
		"L\3\2\2\2\u00ef\u00f0\7H\2\2\u00f0\u00f1\7c\2\2\u00f1\u00f2\7n\2\2\u00f2"+
		"\u00f3\7u\2\2\u00f3\u00f4\7g\2\2\u00f4N\3\2\2\2\u00f5\u00f6\7f\2\2\u00f6"+
		"\u00f7\7g\2\2\u00f7\u00f8\7h\2\2\u00f8P\3\2\2\2\u00f9\u00fa\7t\2\2\u00fa"+
		"\u00fb\7g\2\2\u00fb\u00fc\7v\2\2\u00fcR\3\2\2\2\u00fd\u00fe\7t\2\2\u00fe"+
		"\u00ff\7g\2\2\u00ff\u0100\7v\2\2\u0100\u0101\7w\2\2\u0101\u0102\7t\2\2"+
		"\u0102\u0103\7p\2\2\u0103T\3\2\2\2\u0104\u0105\7.\2\2\u0105V\3\2\2\2\u0106"+
		"\u0107\7\60\2\2\u0107X\3\2\2\2\u0108\u0109\7\13\2\2\u0109Z\3\2\2\2\u010a"+
		"\u010c\t\6\2\2\u010b\u010a\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u010b\3\2"+
		"\2\2\u010d\u010e\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u0110\b.\2\2\u0110"+
		"\\\3\2\2\2\u0111\u0115\t\7\2\2\u0112\u0114\t\b\2\2\u0113\u0112\3\2\2\2"+
		"\u0114\u0117\3\2\2\2\u0115\u0113\3\2\2\2\u0115\u0116\3\2\2\2\u0116^\3"+
		"\2\2\2\u0117\u0115\3\2\2\2\u0118\u0119\13\2\2\2\u0119`\3\2\2\2\n\2bwz"+
		"\u0084\u00a3\u010d\u0115\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}