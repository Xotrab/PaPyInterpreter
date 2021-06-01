// Generated from PaPy.g4 by ANTLR 4.9.2
package antlr;// Generated from PaPy.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PaPyParser extends Parser {
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
		COMMA=42, DOT=43, TAB=44, SPACES=45, IDENTIFIER=46;
	public static final int
		RULE_program = 0, RULE_section = 1, RULE_statement = 2, RULE_expression = 3, 
		RULE_arithmeticExpression = 4, RULE_logicalExpression = 5, RULE_logicalAnd = 6, 
		RULE_logicalTerm = 7, RULE_logicalResult = 8, RULE_variableDeclaration = 9, 
		RULE_loopStatement = 10, RULE_forStatement = 11, RULE_range = 12, RULE_whileStatement = 13, 
		RULE_ifStatement = 14, RULE_elifStatement = 15, RULE_elseStatement = 16, 
		RULE_block = 17, RULE_functionDeclaration = 18, RULE_functionDeclarationArgument = 19, 
		RULE_functionBlock = 20, RULE_funcCall = 21, RULE_argList = 22, RULE_value = 23, 
		RULE_number = 24, RULE_logicalValue = 25, RULE_type = 26;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "section", "statement", "expression", "arithmeticExpression", 
			"logicalExpression", "logicalAnd", "logicalTerm", "logicalResult", "variableDeclaration", 
			"loopStatement", "forStatement", "range", "whileStatement", "ifStatement", 
			"elifStatement", "elseStatement", "block", "functionDeclaration", "functionDeclarationArgument", 
			"functionBlock", "funcCall", "argList", "value", "number", "logicalValue", 
			"type"
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
			"TAB", "SPACES", "IDENTIFIER"
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

	@Override
	public String getGrammarFileName() { return "PaPy.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PaPyParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(PaPyParser.EOF, 0); }
		public List<SectionContext> section() {
			return getRuleContexts(SectionContext.class);
		}
		public SectionContext section(int i) {
			return getRuleContext(SectionContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PaPyVisitor ) return ((PaPyVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NL) | (1L << LPAR) | (1L << INT) | (1L << FLOAT) | (1L << STRING) | (1L << INT_TYPE) | (1L << FLOAT_TYPE) | (1L << BOOL_TYPE) | (1L << STRING_TYPE) | (1L << FOR) | (1L << WHILE) | (1L << IF) | (1L << NOT) | (1L << TRUE) | (1L << FALSE) | (1L << DEF) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(54);
				section();
				}
				}
				setState(59);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(60);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SectionContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public TerminalNode NL() { return getToken(PaPyParser.NL, 0); }
		public SectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_section; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PaPyVisitor ) return ((PaPyVisitor<? extends T>)visitor).visitSection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SectionContext section() throws RecognitionException {
		SectionContext _localctx = new SectionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_section);
		try {
			setState(65);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAR:
			case INT:
			case FLOAT:
			case STRING:
			case INT_TYPE:
			case FLOAT_TYPE:
			case BOOL_TYPE:
			case STRING_TYPE:
			case FOR:
			case WHILE:
			case IF:
			case NOT:
			case TRUE:
			case FALSE:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(62);
				statement();
				}
				break;
			case DEF:
				enterOuterAlt(_localctx, 2);
				{
				setState(63);
				functionDeclaration();
				}
				break;
			case NL:
				enterOuterAlt(_localctx, 3);
				{
				setState(64);
				match(NL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public TerminalNode NL() { return getToken(PaPyParser.NL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public LoopStatementContext loopStatement() {
			return getRuleContext(LoopStatementContext.class,0);
		}
		public FuncCallContext funcCall() {
			return getRuleContext(FuncCallContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PaPyVisitor ) return ((PaPyVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(67);
				expression();
				}
				break;
			case 2:
				{
				setState(68);
				variableDeclaration();
				}
				break;
			case 3:
				{
				setState(69);
				loopStatement();
				}
				break;
			case 4:
				{
				setState(70);
				funcCall();
				}
				break;
			case 5:
				{
				setState(71);
				ifStatement();
				}
				break;
			}
			setState(74);
			match(NL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public ArithmeticExpressionContext arithmeticExpression() {
			return getRuleContext(ArithmeticExpressionContext.class,0);
		}
		public LogicalExpressionContext logicalExpression() {
			return getRuleContext(LogicalExpressionContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PaPyVisitor ) return ((PaPyVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_expression);
		try {
			setState(79);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(76);
				arithmeticExpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(77);
				logicalExpression(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(78);
				value();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArithmeticExpressionContext extends ParserRuleContext {
		public TerminalNode LPAR() { return getToken(PaPyParser.LPAR, 0); }
		public List<ArithmeticExpressionContext> arithmeticExpression() {
			return getRuleContexts(ArithmeticExpressionContext.class);
		}
		public ArithmeticExpressionContext arithmeticExpression(int i) {
			return getRuleContext(ArithmeticExpressionContext.class,i);
		}
		public TerminalNode RPAR() { return getToken(PaPyParser.RPAR, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode MUL() { return getToken(PaPyParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(PaPyParser.DIV, 0); }
		public TerminalNode ADD() { return getToken(PaPyParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(PaPyParser.SUB, 0); }
		public ArithmeticExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmeticExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PaPyVisitor ) return ((PaPyVisitor<? extends T>)visitor).visitArithmeticExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArithmeticExpressionContext arithmeticExpression() throws RecognitionException {
		return arithmeticExpression(0);
	}

	private ArithmeticExpressionContext arithmeticExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ArithmeticExpressionContext _localctx = new ArithmeticExpressionContext(_ctx, _parentState);
		ArithmeticExpressionContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_arithmeticExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAR:
				{
				setState(82);
				match(LPAR);
				setState(83);
				arithmeticExpression(0);
				setState(84);
				match(RPAR);
				}
				break;
			case INT:
			case FLOAT:
			case STRING:
			case TRUE:
			case FALSE:
			case IDENTIFIER:
				{
				setState(86);
				value();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(103);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(101);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new ArithmeticExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithmeticExpression);
						setState(89);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(90);
						match(MUL);
						setState(91);
						arithmeticExpression(6);
						}
						break;
					case 2:
						{
						_localctx = new ArithmeticExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithmeticExpression);
						setState(92);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(93);
						match(DIV);
						setState(94);
						arithmeticExpression(5);
						}
						break;
					case 3:
						{
						_localctx = new ArithmeticExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithmeticExpression);
						setState(95);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(96);
						match(ADD);
						setState(97);
						arithmeticExpression(4);
						}
						break;
					case 4:
						{
						_localctx = new ArithmeticExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithmeticExpression);
						setState(98);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(99);
						match(SUB);
						setState(100);
						arithmeticExpression(3);
						}
						break;
					}
					} 
				}
				setState(105);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class LogicalExpressionContext extends ParserRuleContext {
		public LogicalAndContext logicalAnd() {
			return getRuleContext(LogicalAndContext.class,0);
		}
		public List<LogicalExpressionContext> logicalExpression() {
			return getRuleContexts(LogicalExpressionContext.class);
		}
		public LogicalExpressionContext logicalExpression(int i) {
			return getRuleContext(LogicalExpressionContext.class,i);
		}
		public TerminalNode OR() { return getToken(PaPyParser.OR, 0); }
		public LogicalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PaPyVisitor ) return ((PaPyVisitor<? extends T>)visitor).visitLogicalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalExpressionContext logicalExpression() throws RecognitionException {
		return logicalExpression(0);
	}

	private LogicalExpressionContext logicalExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LogicalExpressionContext _localctx = new LogicalExpressionContext(_ctx, _parentState);
		LogicalExpressionContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_logicalExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(107);
			logicalAnd(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(114);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LogicalExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_logicalExpression);
					setState(109);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(110);
					match(OR);
					setState(111);
					logicalExpression(2);
					}
					} 
				}
				setState(116);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class LogicalAndContext extends ParserRuleContext {
		public LogicalTermContext logicalTerm() {
			return getRuleContext(LogicalTermContext.class,0);
		}
		public List<LogicalAndContext> logicalAnd() {
			return getRuleContexts(LogicalAndContext.class);
		}
		public LogicalAndContext logicalAnd(int i) {
			return getRuleContext(LogicalAndContext.class,i);
		}
		public TerminalNode AND() { return getToken(PaPyParser.AND, 0); }
		public LogicalAndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalAnd; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PaPyVisitor ) return ((PaPyVisitor<? extends T>)visitor).visitLogicalAnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalAndContext logicalAnd() throws RecognitionException {
		return logicalAnd(0);
	}

	private LogicalAndContext logicalAnd(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LogicalAndContext _localctx = new LogicalAndContext(_ctx, _parentState);
		LogicalAndContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_logicalAnd, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(118);
			logicalTerm();
			}
			_ctx.stop = _input.LT(-1);
			setState(125);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LogicalAndContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_logicalAnd);
					setState(120);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(121);
					match(AND);
					setState(122);
					logicalAnd(2);
					}
					} 
				}
				setState(127);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class LogicalTermContext extends ParserRuleContext {
		public LogicalResultContext logicalResult() {
			return getRuleContext(LogicalResultContext.class,0);
		}
		public TerminalNode NOT() { return getToken(PaPyParser.NOT, 0); }
		public LogicalTermContext logicalTerm() {
			return getRuleContext(LogicalTermContext.class,0);
		}
		public LogicalTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalTerm; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PaPyVisitor ) return ((PaPyVisitor<? extends T>)visitor).visitLogicalTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalTermContext logicalTerm() throws RecognitionException {
		LogicalTermContext _localctx = new LogicalTermContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_logicalTerm);
		try {
			setState(131);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAR:
			case INT:
			case FLOAT:
			case STRING:
			case TRUE:
			case FALSE:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(128);
				logicalResult(0);
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(129);
				match(NOT);
				setState(130);
				logicalTerm();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LogicalResultContext extends ParserRuleContext {
		public TerminalNode LPAR() { return getToken(PaPyParser.LPAR, 0); }
		public LogicalExpressionContext logicalExpression() {
			return getRuleContext(LogicalExpressionContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(PaPyParser.RPAR, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public List<LogicalResultContext> logicalResult() {
			return getRuleContexts(LogicalResultContext.class);
		}
		public LogicalResultContext logicalResult(int i) {
			return getRuleContext(LogicalResultContext.class,i);
		}
		public TerminalNode EQ() { return getToken(PaPyParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(PaPyParser.NEQ, 0); }
		public TerminalNode GTE() { return getToken(PaPyParser.GTE, 0); }
		public TerminalNode LTE() { return getToken(PaPyParser.LTE, 0); }
		public TerminalNode GT() { return getToken(PaPyParser.GT, 0); }
		public TerminalNode LT() { return getToken(PaPyParser.LT, 0); }
		public LogicalResultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalResult; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PaPyVisitor ) return ((PaPyVisitor<? extends T>)visitor).visitLogicalResult(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalResultContext logicalResult() throws RecognitionException {
		return logicalResult(0);
	}

	private LogicalResultContext logicalResult(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LogicalResultContext _localctx = new LogicalResultContext(_ctx, _parentState);
		LogicalResultContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_logicalResult, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAR:
				{
				setState(134);
				match(LPAR);
				setState(135);
				logicalExpression(0);
				setState(136);
				match(RPAR);
				}
				break;
			case INT:
			case FLOAT:
			case STRING:
			case TRUE:
			case FALSE:
			case IDENTIFIER:
				{
				setState(138);
				value();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(146);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LogicalResultContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_logicalResult);
					setState(141);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(142);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << NEQ) | (1L << LTE) | (1L << GTE) | (1L << GT) | (1L << LT))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(143);
					logicalResult(2);
					}
					} 
				}
				setState(148);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class VariableDeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(PaPyParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGN() { return getToken(PaPyParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PaPyVisitor ) return ((PaPyVisitor<? extends T>)visitor).visitVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_variableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			type();
			setState(150);
			match(IDENTIFIER);
			setState(151);
			match(ASSIGN);
			setState(152);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LoopStatementContext extends ParserRuleContext {
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public LoopStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PaPyVisitor ) return ((PaPyVisitor<? extends T>)visitor).visitLoopStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopStatementContext loopStatement() throws RecognitionException {
		LoopStatementContext _localctx = new LoopStatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_loopStatement);
		try {
			setState(156);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(154);
				forStatement();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(155);
				whileStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForStatementContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(PaPyParser.FOR, 0); }
		public TerminalNode IDENTIFIER() { return getToken(PaPyParser.IDENTIFIER, 0); }
		public TerminalNode IN() { return getToken(PaPyParser.IN, 0); }
		public RangeContext range() {
			return getRuleContext(RangeContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PaPyVisitor ) return ((PaPyVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_forStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(FOR);
			setState(159);
			match(IDENTIFIER);
			setState(160);
			match(IN);
			setState(161);
			range();
			setState(162);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RangeContext extends ParserRuleContext {
		public TerminalNode LPAR() { return getToken(PaPyParser.LPAR, 0); }
		public List<TerminalNode> INT() { return getTokens(PaPyParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(PaPyParser.INT, i);
		}
		public List<TerminalNode> DOT() { return getTokens(PaPyParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(PaPyParser.DOT, i);
		}
		public TerminalNode RPAR() { return getToken(PaPyParser.RPAR, 0); }
		public RangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_range; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PaPyVisitor ) return ((PaPyVisitor<? extends T>)visitor).visitRange(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RangeContext range() throws RecognitionException {
		RangeContext _localctx = new RangeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_range);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(LPAR);
			setState(165);
			match(INT);
			setState(166);
			match(DOT);
			setState(167);
			match(DOT);
			setState(168);
			match(INT);
			setState(169);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileStatementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(PaPyParser.WHILE, 0); }
		public TerminalNode LPAR() { return getToken(PaPyParser.LPAR, 0); }
		public LogicalExpressionContext logicalExpression() {
			return getRuleContext(LogicalExpressionContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(PaPyParser.RPAR, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PaPyVisitor ) return ((PaPyVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(WHILE);
			setState(172);
			match(LPAR);
			setState(173);
			logicalExpression(0);
			setState(174);
			match(RPAR);
			setState(175);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(PaPyParser.IF, 0); }
		public TerminalNode LPAR() { return getToken(PaPyParser.LPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(PaPyParser.RPAR, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode NL() { return getToken(PaPyParser.NL, 0); }
		public ElifStatementContext elifStatement() {
			return getRuleContext(ElifStatementContext.class,0);
		}
		public ElseStatementContext elseStatement() {
			return getRuleContext(ElseStatementContext.class,0);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PaPyVisitor ) return ((PaPyVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			match(IF);
			setState(178);
			match(LPAR);
			setState(179);
			expression();
			setState(180);
			match(RPAR);
			setState(181);
			block();
			setState(187);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(182);
				match(NL);
				setState(185);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ELIF:
					{
					setState(183);
					elifStatement();
					}
					break;
				case ELSE:
					{
					setState(184);
					elseStatement();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElifStatementContext extends ParserRuleContext {
		public TerminalNode ELIF() { return getToken(PaPyParser.ELIF, 0); }
		public TerminalNode LPAR() { return getToken(PaPyParser.LPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(PaPyParser.RPAR, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode NL() { return getToken(PaPyParser.NL, 0); }
		public ElifStatementContext elifStatement() {
			return getRuleContext(ElifStatementContext.class,0);
		}
		public ElseStatementContext elseStatement() {
			return getRuleContext(ElseStatementContext.class,0);
		}
		public ElifStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elifStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PaPyVisitor ) return ((PaPyVisitor<? extends T>)visitor).visitElifStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElifStatementContext elifStatement() throws RecognitionException {
		ElifStatementContext _localctx = new ElifStatementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_elifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			match(ELIF);
			setState(190);
			match(LPAR);
			setState(191);
			expression();
			setState(192);
			match(RPAR);
			setState(193);
			block();
			setState(199);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(194);
				match(NL);
				setState(197);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ELIF:
					{
					setState(195);
					elifStatement();
					}
					break;
				case ELSE:
					{
					setState(196);
					elseStatement();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElseStatementContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(PaPyParser.ELSE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ElseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PaPyVisitor ) return ((PaPyVisitor<? extends T>)visitor).visitElseStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseStatementContext elseStatement() throws RecognitionException {
		ElseStatementContext _localctx = new ElseStatementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_elseStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			match(ELSE);
			setState(202);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LBR() { return getToken(PaPyParser.LBR, 0); }
		public TerminalNode RBR() { return getToken(PaPyParser.RBR, 0); }
		public List<TerminalNode> NL() { return getTokens(PaPyParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(PaPyParser.NL, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PaPyVisitor ) return ((PaPyVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NL) {
				{
				setState(204);
				match(NL);
				}
			}

			setState(207);
			match(LBR);
			setState(213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NL) | (1L << LPAR) | (1L << INT) | (1L << FLOAT) | (1L << STRING) | (1L << INT_TYPE) | (1L << FLOAT_TYPE) | (1L << BOOL_TYPE) | (1L << STRING_TYPE) | (1L << FOR) | (1L << WHILE) | (1L << IF) | (1L << NOT) | (1L << TRUE) | (1L << FALSE) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(211);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LPAR:
				case INT:
				case FLOAT:
				case STRING:
				case INT_TYPE:
				case FLOAT_TYPE:
				case BOOL_TYPE:
				case STRING_TYPE:
				case FOR:
				case WHILE:
				case IF:
				case NOT:
				case TRUE:
				case FALSE:
				case IDENTIFIER:
					{
					setState(208);
					statement();
					}
					break;
				case NL:
					{
					setState(209);
					match(NL);
					setState(210);
					match(NL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(215);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(216);
			match(RBR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionDeclarationContext extends ParserRuleContext {
		public TerminalNode DEF() { return getToken(PaPyParser.DEF, 0); }
		public TerminalNode IDENTIFIER() { return getToken(PaPyParser.IDENTIFIER, 0); }
		public TerminalNode LPAR() { return getToken(PaPyParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(PaPyParser.RPAR, 0); }
		public FunctionBlockContext functionBlock() {
			return getRuleContext(FunctionBlockContext.class,0);
		}
		public List<FunctionDeclarationArgumentContext> functionDeclarationArgument() {
			return getRuleContexts(FunctionDeclarationArgumentContext.class);
		}
		public FunctionDeclarationArgumentContext functionDeclarationArgument(int i) {
			return getRuleContext(FunctionDeclarationArgumentContext.class,i);
		}
		public TerminalNode RET() { return getToken(PaPyParser.RET, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(PaPyParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PaPyParser.COMMA, i);
		}
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PaPyVisitor ) return ((PaPyVisitor<? extends T>)visitor).visitFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			match(DEF);
			setState(219);
			match(IDENTIFIER);
			setState(220);
			match(LPAR);
			setState(229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT_TYPE) | (1L << FLOAT_TYPE) | (1L << BOOL_TYPE) | (1L << STRING_TYPE))) != 0)) {
				{
				setState(221);
				functionDeclarationArgument();
				setState(226);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(222);
					match(COMMA);
					setState(223);
					functionDeclarationArgument();
					}
					}
					setState(228);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(231);
			match(RPAR);
			setState(234);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RET) {
				{
				setState(232);
				match(RET);
				setState(233);
				type();
				}
			}

			setState(236);
			functionBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionDeclarationArgumentContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(PaPyParser.IDENTIFIER, 0); }
		public FunctionDeclarationArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclarationArgument; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PaPyVisitor ) return ((PaPyVisitor<? extends T>)visitor).visitFunctionDeclarationArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclarationArgumentContext functionDeclarationArgument() throws RecognitionException {
		FunctionDeclarationArgumentContext _localctx = new FunctionDeclarationArgumentContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_functionDeclarationArgument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			type();
			setState(239);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionBlockContext extends ParserRuleContext {
		public TerminalNode LBR() { return getToken(PaPyParser.LBR, 0); }
		public TerminalNode RBR() { return getToken(PaPyParser.RBR, 0); }
		public List<TerminalNode> NL() { return getTokens(PaPyParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(PaPyParser.NL, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode RETURN() { return getToken(PaPyParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FunctionBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionBlock; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PaPyVisitor ) return ((PaPyVisitor<? extends T>)visitor).visitFunctionBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionBlockContext functionBlock() throws RecognitionException {
		FunctionBlockContext _localctx = new FunctionBlockContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_functionBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NL) {
				{
				setState(241);
				match(NL);
				}
			}

			setState(244);
			match(LBR);
			setState(249);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NL) | (1L << LPAR) | (1L << INT) | (1L << FLOAT) | (1L << STRING) | (1L << INT_TYPE) | (1L << FLOAT_TYPE) | (1L << BOOL_TYPE) | (1L << STRING_TYPE) | (1L << FOR) | (1L << WHILE) | (1L << IF) | (1L << NOT) | (1L << TRUE) | (1L << FALSE) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(247);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LPAR:
				case INT:
				case FLOAT:
				case STRING:
				case INT_TYPE:
				case FLOAT_TYPE:
				case BOOL_TYPE:
				case STRING_TYPE:
				case FOR:
				case WHILE:
				case IF:
				case NOT:
				case TRUE:
				case FALSE:
				case IDENTIFIER:
					{
					setState(245);
					statement();
					}
					break;
				case NL:
					{
					setState(246);
					match(NL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(251);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(254);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(252);
				match(RETURN);
				setState(253);
				expression();
				}
			}

			setState(256);
			match(RBR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncCallContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(PaPyParser.IDENTIFIER, 0); }
		public TerminalNode LPAR() { return getToken(PaPyParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(PaPyParser.RPAR, 0); }
		public ArgListContext argList() {
			return getRuleContext(ArgListContext.class,0);
		}
		public FuncCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcCall; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PaPyVisitor ) return ((PaPyVisitor<? extends T>)visitor).visitFuncCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncCallContext funcCall() throws RecognitionException {
		FuncCallContext _localctx = new FuncCallContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_funcCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			match(IDENTIFIER);
			setState(259);
			match(LPAR);
			setState(261);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << STRING) | (1L << TRUE) | (1L << FALSE) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(260);
				argList();
				}
			}

			setState(263);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgListContext extends ParserRuleContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PaPyParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PaPyParser.COMMA, i);
		}
		public ArgListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PaPyVisitor ) return ((PaPyVisitor<? extends T>)visitor).visitArgList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgListContext argList() throws RecognitionException {
		ArgListContext _localctx = new ArgListContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_argList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			value();
			setState(270);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(266);
				match(COMMA);
				setState(267);
				value();
				}
				}
				setState(272);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public FuncCallContext funcCall() {
			return getRuleContext(FuncCallContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(PaPyParser.IDENTIFIER, 0); }
		public LogicalValueContext logicalValue() {
			return getRuleContext(LogicalValueContext.class,0);
		}
		public TerminalNode STRING() { return getToken(PaPyParser.STRING, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PaPyVisitor ) return ((PaPyVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_value);
		try {
			setState(278);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(273);
				number();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(274);
				funcCall();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(275);
				match(IDENTIFIER);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(276);
				logicalValue();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(277);
				match(STRING);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumberContext extends ParserRuleContext {
		public TerminalNode FLOAT() { return getToken(PaPyParser.FLOAT, 0); }
		public TerminalNode INT() { return getToken(PaPyParser.INT, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PaPyVisitor ) return ((PaPyVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==FLOAT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LogicalValueContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(PaPyParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(PaPyParser.FALSE, 0); }
		public LogicalValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalValue; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PaPyVisitor ) return ((PaPyVisitor<? extends T>)visitor).visitLogicalValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalValueContext logicalValue() throws RecognitionException {
		LogicalValueContext _localctx = new LogicalValueContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_logicalValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode INT_TYPE() { return getToken(PaPyParser.INT_TYPE, 0); }
		public TerminalNode FLOAT_TYPE() { return getToken(PaPyParser.FLOAT_TYPE, 0); }
		public TerminalNode BOOL_TYPE() { return getToken(PaPyParser.BOOL_TYPE, 0); }
		public TerminalNode STRING_TYPE() { return getToken(PaPyParser.STRING_TYPE, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PaPyVisitor ) return ((PaPyVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT_TYPE) | (1L << FLOAT_TYPE) | (1L << BOOL_TYPE) | (1L << STRING_TYPE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 4:
			return arithmeticExpression_sempred((ArithmeticExpressionContext)_localctx, predIndex);
		case 5:
			return logicalExpression_sempred((LogicalExpressionContext)_localctx, predIndex);
		case 6:
			return logicalAnd_sempred((LogicalAndContext)_localctx, predIndex);
		case 8:
			return logicalResult_sempred((LogicalResultContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean arithmeticExpression_sempred(ArithmeticExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		case 2:
			return precpred(_ctx, 3);
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean logicalExpression_sempred(LogicalExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean logicalAnd_sempred(LogicalAndContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean logicalResult_sempred(LogicalResultContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\60\u0121\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\3\2\7\2:\n\2\f\2\16\2=\13\2\3\2\3\2\3\3"+
		"\3\3\3\3\5\3D\n\3\3\4\3\4\3\4\3\4\3\4\5\4K\n\4\3\4\3\4\3\5\3\5\3\5\5\5"+
		"R\n\5\3\6\3\6\3\6\3\6\3\6\3\6\5\6Z\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\7\6h\n\6\f\6\16\6k\13\6\3\7\3\7\3\7\3\7\3\7\3\7\7\7s"+
		"\n\7\f\7\16\7v\13\7\3\b\3\b\3\b\3\b\3\b\3\b\7\b~\n\b\f\b\16\b\u0081\13"+
		"\b\3\t\3\t\3\t\5\t\u0086\n\t\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u008e\n\n\3\n"+
		"\3\n\3\n\7\n\u0093\n\n\f\n\16\n\u0096\13\n\3\13\3\13\3\13\3\13\3\13\3"+
		"\f\3\f\5\f\u009f\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\5\20\u00bc\n\20\5\20\u00be\n\20\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\5\21\u00c8\n\21\5\21\u00ca\n\21\3\22\3\22\3\22\3\23\5\23"+
		"\u00d0\n\23\3\23\3\23\3\23\3\23\7\23\u00d6\n\23\f\23\16\23\u00d9\13\23"+
		"\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u00e3\n\24\f\24\16\24\u00e6"+
		"\13\24\5\24\u00e8\n\24\3\24\3\24\3\24\5\24\u00ed\n\24\3\24\3\24\3\25\3"+
		"\25\3\25\3\26\5\26\u00f5\n\26\3\26\3\26\3\26\7\26\u00fa\n\26\f\26\16\26"+
		"\u00fd\13\26\3\26\3\26\5\26\u0101\n\26\3\26\3\26\3\27\3\27\3\27\5\27\u0108"+
		"\n\27\3\27\3\27\3\30\3\30\3\30\7\30\u010f\n\30\f\30\16\30\u0112\13\30"+
		"\3\31\3\31\3\31\3\31\3\31\5\31\u0119\n\31\3\32\3\32\3\33\3\33\3\34\3\34"+
		"\3\34\2\6\n\f\16\22\35\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,"+
		".\60\62\64\66\2\6\3\2\36#\3\2\n\13\3\2\'(\3\2\r\20\2\u012d\2;\3\2\2\2"+
		"\4C\3\2\2\2\6J\3\2\2\2\bQ\3\2\2\2\nY\3\2\2\2\fl\3\2\2\2\16w\3\2\2\2\20"+
		"\u0085\3\2\2\2\22\u008d\3\2\2\2\24\u0097\3\2\2\2\26\u009e\3\2\2\2\30\u00a0"+
		"\3\2\2\2\32\u00a6\3\2\2\2\34\u00ad\3\2\2\2\36\u00b3\3\2\2\2 \u00bf\3\2"+
		"\2\2\"\u00cb\3\2\2\2$\u00cf\3\2\2\2&\u00dc\3\2\2\2(\u00f0\3\2\2\2*\u00f4"+
		"\3\2\2\2,\u0104\3\2\2\2.\u010b\3\2\2\2\60\u0118\3\2\2\2\62\u011a\3\2\2"+
		"\2\64\u011c\3\2\2\2\66\u011e\3\2\2\28:\5\4\3\298\3\2\2\2:=\3\2\2\2;9\3"+
		"\2\2\2;<\3\2\2\2<>\3\2\2\2=;\3\2\2\2>?\7\2\2\3?\3\3\2\2\2@D\5\6\4\2AD"+
		"\5&\24\2BD\7\3\2\2C@\3\2\2\2CA\3\2\2\2CB\3\2\2\2D\5\3\2\2\2EK\5\b\5\2"+
		"FK\5\24\13\2GK\5\26\f\2HK\5,\27\2IK\5\36\20\2JE\3\2\2\2JF\3\2\2\2JG\3"+
		"\2\2\2JH\3\2\2\2JI\3\2\2\2KL\3\2\2\2LM\7\3\2\2M\7\3\2\2\2NR\5\n\6\2OR"+
		"\5\f\7\2PR\5\60\31\2QN\3\2\2\2QO\3\2\2\2QP\3\2\2\2R\t\3\2\2\2ST\b\6\1"+
		"\2TU\7\6\2\2UV\5\n\6\2VW\7\7\2\2WZ\3\2\2\2XZ\5\60\31\2YS\3\2\2\2YX\3\2"+
		"\2\2Zi\3\2\2\2[\\\f\7\2\2\\]\7\30\2\2]h\5\n\6\b^_\f\6\2\2_`\7\33\2\2`"+
		"h\5\n\6\7ab\f\5\2\2bc\7\31\2\2ch\5\n\6\6de\f\4\2\2ef\7\32\2\2fh\5\n\6"+
		"\5g[\3\2\2\2g^\3\2\2\2ga\3\2\2\2gd\3\2\2\2hk\3\2\2\2ig\3\2\2\2ij\3\2\2"+
		"\2j\13\3\2\2\2ki\3\2\2\2lm\b\7\1\2mn\5\16\b\2nt\3\2\2\2op\f\3\2\2pq\7"+
		"%\2\2qs\5\f\7\4ro\3\2\2\2sv\3\2\2\2tr\3\2\2\2tu\3\2\2\2u\r\3\2\2\2vt\3"+
		"\2\2\2wx\b\b\1\2xy\5\20\t\2y\177\3\2\2\2z{\f\3\2\2{|\7$\2\2|~\5\16\b\4"+
		"}z\3\2\2\2~\u0081\3\2\2\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080\17\3\2"+
		"\2\2\u0081\177\3\2\2\2\u0082\u0086\5\22\n\2\u0083\u0084\7&\2\2\u0084\u0086"+
		"\5\20\t\2\u0085\u0082\3\2\2\2\u0085\u0083\3\2\2\2\u0086\21\3\2\2\2\u0087"+
		"\u0088\b\n\1\2\u0088\u0089\7\6\2\2\u0089\u008a\5\f\7\2\u008a\u008b\7\7"+
		"\2\2\u008b\u008e\3\2\2\2\u008c\u008e\5\60\31\2\u008d\u0087\3\2\2\2\u008d"+
		"\u008c\3\2\2\2\u008e\u0094\3\2\2\2\u008f\u0090\f\3\2\2\u0090\u0091\t\2"+
		"\2\2\u0091\u0093\5\22\n\4\u0092\u008f\3\2\2\2\u0093\u0096\3\2\2\2\u0094"+
		"\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\23\3\2\2\2\u0096\u0094\3\2\2"+
		"\2\u0097\u0098\5\66\34\2\u0098\u0099\7\60\2\2\u0099\u009a\7\35\2\2\u009a"+
		"\u009b\5\b\5\2\u009b\25\3\2\2\2\u009c\u009f\5\30\r\2\u009d\u009f\5\34"+
		"\17\2\u009e\u009c\3\2\2\2\u009e\u009d\3\2\2\2\u009f\27\3\2\2\2\u00a0\u00a1"+
		"\7\22\2\2\u00a1\u00a2\7\60\2\2\u00a2\u00a3\7\23\2\2\u00a3\u00a4\5\32\16"+
		"\2\u00a4\u00a5\5$\23\2\u00a5\31\3\2\2\2\u00a6\u00a7\7\6\2\2\u00a7\u00a8"+
		"\7\n\2\2\u00a8\u00a9\7-\2\2\u00a9\u00aa\7-\2\2\u00aa\u00ab\7\n\2\2\u00ab"+
		"\u00ac\7\7\2\2\u00ac\33\3\2\2\2\u00ad\u00ae\7\24\2\2\u00ae\u00af\7\6\2"+
		"\2\u00af\u00b0\5\f\7\2\u00b0\u00b1\7\7\2\2\u00b1\u00b2\5$\23\2\u00b2\35"+
		"\3\2\2\2\u00b3\u00b4\7\25\2\2\u00b4\u00b5\7\6\2\2\u00b5\u00b6\5\b\5\2"+
		"\u00b6\u00b7\7\7\2\2\u00b7\u00bd\5$\23\2\u00b8\u00bb\7\3\2\2\u00b9\u00bc"+
		"\5 \21\2\u00ba\u00bc\5\"\22\2\u00bb\u00b9\3\2\2\2\u00bb\u00ba\3\2\2\2"+
		"\u00bc\u00be\3\2\2\2\u00bd\u00b8\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\37"+
		"\3\2\2\2\u00bf\u00c0\7\27\2\2\u00c0\u00c1\7\6\2\2\u00c1\u00c2\5\b\5\2"+
		"\u00c2\u00c3\7\7\2\2\u00c3\u00c9\5$\23\2\u00c4\u00c7\7\3\2\2\u00c5\u00c8"+
		"\5 \21\2\u00c6\u00c8\5\"\22\2\u00c7\u00c5\3\2\2\2\u00c7\u00c6\3\2\2\2"+
		"\u00c8\u00ca\3\2\2\2\u00c9\u00c4\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca!\3"+
		"\2\2\2\u00cb\u00cc\7\26\2\2\u00cc\u00cd\5$\23\2\u00cd#\3\2\2\2\u00ce\u00d0"+
		"\7\3\2\2\u00cf\u00ce\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1"+
		"\u00d7\7\4\2\2\u00d2\u00d6\5\6\4\2\u00d3\u00d4\7\3\2\2\u00d4\u00d6\7\3"+
		"\2\2\u00d5\u00d2\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d6\u00d9\3\2\2\2\u00d7"+
		"\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00da\3\2\2\2\u00d9\u00d7\3\2"+
		"\2\2\u00da\u00db\7\5\2\2\u00db%\3\2\2\2\u00dc\u00dd\7)\2\2\u00dd\u00de"+
		"\7\60\2\2\u00de\u00e7\7\6\2\2\u00df\u00e4\5(\25\2\u00e0\u00e1\7,\2\2\u00e1"+
		"\u00e3\5(\25\2\u00e2\u00e0\3\2\2\2\u00e3\u00e6\3\2\2\2\u00e4\u00e2\3\2"+
		"\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e8\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e7"+
		"\u00df\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00ec\7\7"+
		"\2\2\u00ea\u00eb\7*\2\2\u00eb\u00ed\5\66\34\2\u00ec\u00ea\3\2\2\2\u00ec"+
		"\u00ed\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00ef\5*\26\2\u00ef\'\3\2\2\2"+
		"\u00f0\u00f1\5\66\34\2\u00f1\u00f2\7\60\2\2\u00f2)\3\2\2\2\u00f3\u00f5"+
		"\7\3\2\2\u00f4\u00f3\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6"+
		"\u00fb\7\4\2\2\u00f7\u00fa\5\6\4\2\u00f8\u00fa\7\3\2\2\u00f9\u00f7\3\2"+
		"\2\2\u00f9\u00f8\3\2\2\2\u00fa\u00fd\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fb"+
		"\u00fc\3\2\2\2\u00fc\u0100\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fe\u00ff\7+"+
		"\2\2\u00ff\u0101\5\b\5\2\u0100\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101"+
		"\u0102\3\2\2\2\u0102\u0103\7\5\2\2\u0103+\3\2\2\2\u0104\u0105\7\60\2\2"+
		"\u0105\u0107\7\6\2\2\u0106\u0108\5.\30\2\u0107\u0106\3\2\2\2\u0107\u0108"+
		"\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u010a\7\7\2\2\u010a-\3\2\2\2\u010b"+
		"\u0110\5\60\31\2\u010c\u010d\7,\2\2\u010d\u010f\5\60\31\2\u010e\u010c"+
		"\3\2\2\2\u010f\u0112\3\2\2\2\u0110\u010e\3\2\2\2\u0110\u0111\3\2\2\2\u0111"+
		"/\3\2\2\2\u0112\u0110\3\2\2\2\u0113\u0119\5\62\32\2\u0114\u0119\5,\27"+
		"\2\u0115\u0119\7\60\2\2\u0116\u0119\5\64\33\2\u0117\u0119\7\f\2\2\u0118"+
		"\u0113\3\2\2\2\u0118\u0114\3\2\2\2\u0118\u0115\3\2\2\2\u0118\u0116\3\2"+
		"\2\2\u0118\u0117\3\2\2\2\u0119\61\3\2\2\2\u011a\u011b\t\3\2\2\u011b\63"+
		"\3\2\2\2\u011c\u011d\t\4\2\2\u011d\65\3\2\2\2\u011e\u011f\t\5\2\2\u011f"+
		"\67\3\2\2\2 ;CJQYgit\177\u0085\u008d\u0094\u009e\u00bb\u00bd\u00c7\u00c9"+
		"\u00cf\u00d5\u00d7\u00e4\u00e7\u00ec\u00f4\u00f9\u00fb\u0100\u0107\u0110"+
		"\u0118";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}