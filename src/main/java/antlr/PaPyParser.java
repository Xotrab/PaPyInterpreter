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
		NL=1, EMPTY_LINE=2, LBR=3, RBR=4, LPAR=5, RPAR=6, LSQBR=7, RSQBR=8, INT=9, 
		FLOAT=10, STRING=11, INT_TYPE=12, FLOAT_TYPE=13, BOOL_TYPE=14, STRING_TYPE=15, 
		COMMENT=16, FOR=17, IN=18, WHILE=19, IF=20, ELSE=21, ELIF=22, MUL=23, 
		ADD=24, SUB=25, DIV=26, REMOVE_AT=27, ASSIGN=28, EQ=29, NEQ=30, LTE=31, 
		GTE=32, GT=33, LT=34, AND=35, OR=36, NOT=37, TRUE=38, FALSE=39, DEF=40, 
		RET=41, RETURN=42, COMMA=43, DOT=44, TAB=45, SPACES=46, IDENTIFIER=47;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_expression = 2, RULE_arithmeticExpression = 3, 
		RULE_term = 4, RULE_logicalExpression = 5, RULE_logicalAnd = 6, RULE_logicalTerm = 7, 
		RULE_logicalResult = 8, RULE_variableDeclaration = 9, RULE_loopStatement = 10, 
		RULE_forStatement = 11, RULE_range = 12, RULE_whileStatement = 13, RULE_ifStatement = 14, 
		RULE_elifStatement = 15, RULE_elseStatement = 16, RULE_block = 17, RULE_functionDeclaration = 18, 
		RULE_returnBlock = 19, RULE_funcCall = 20, RULE_argList = 21, RULE_value = 22, 
		RULE_number = 23, RULE_logicalValue = 24, RULE_type = 25;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "expression", "arithmeticExpression", "term", 
			"logicalExpression", "logicalAnd", "logicalTerm", "logicalResult", "variableDeclaration", 
			"loopStatement", "forStatement", "range", "whileStatement", "ifStatement", 
			"elifStatement", "elseStatement", "block", "functionDeclaration", "returnBlock", 
			"funcCall", "argList", "value", "number", "logicalValue", "type"
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
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> NL() { return getTokens(PaPyParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(PaPyParser.NL, i);
		}
		public List<FunctionDeclarationContext> functionDeclaration() {
			return getRuleContexts(FunctionDeclarationContext.class);
		}
		public FunctionDeclarationContext functionDeclaration(int i) {
			return getRuleContext(FunctionDeclarationContext.class,i);
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
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(55);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
					case 1:
						{
						setState(52);
						statement();
						}
						break;
					case 2:
						{
						setState(53);
						match(NL);
						}
						break;
					case 3:
						{
						setState(54);
						functionDeclaration();
						}
						break;
					}
					} 
				}
				setState(59);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
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
		enterRule(_localctx, 2, RULE_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(62);
				expression();
				}
				break;
			case 2:
				{
				setState(63);
				variableDeclaration();
				}
				break;
			case 3:
				{
				setState(64);
				loopStatement();
				}
				break;
			case 4:
				{
				setState(65);
				funcCall();
				}
				break;
			case 5:
				{
				setState(66);
				ifStatement();
				}
				break;
			}
			setState(69);
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
		enterRule(_localctx, 4, RULE_expression);
		try {
			setState(73);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(71);
				arithmeticExpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(72);
				logicalExpression(0);
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
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public List<ArithmeticExpressionContext> arithmeticExpression() {
			return getRuleContexts(ArithmeticExpressionContext.class);
		}
		public ArithmeticExpressionContext arithmeticExpression(int i) {
			return getRuleContext(ArithmeticExpressionContext.class,i);
		}
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
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_arithmeticExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(76);
			term(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(83);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ArithmeticExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_arithmeticExpression);
					setState(78);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(79);
					_la = _input.LA(1);
					if ( !(_la==ADD || _la==SUB) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(80);
					arithmeticExpression(2);
					}
					} 
				}
				setState(85);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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

	public static class TermContext extends ParserRuleContext {
		public TerminalNode LPAR() { return getToken(PaPyParser.LPAR, 0); }
		public ArithmeticExpressionContext arithmeticExpression() {
			return getRuleContext(ArithmeticExpressionContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(PaPyParser.RPAR, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public TerminalNode MUL() { return getToken(PaPyParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(PaPyParser.DIV, 0); }
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PaPyVisitor ) return ((PaPyVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		return term(0);
	}

	private TermContext term(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TermContext _localctx = new TermContext(_ctx, _parentState);
		TermContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_term, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				}
				break;
			case 2:
				{
				setState(87);
				match(LPAR);
				setState(88);
				arithmeticExpression(0);
				setState(89);
				match(RPAR);
				}
				break;
			case 3:
				{
				setState(91);
				value();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(99);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TermContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_term);
					setState(94);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(95);
					_la = _input.LA(1);
					if ( !(_la==MUL || _la==DIV) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(96);
					term(2);
					}
					} 
				}
				setState(101);
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
			setState(103);
			logicalAnd(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(110);
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
					setState(105);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(106);
					match(OR);
					setState(107);
					logicalExpression(2);
					}
					} 
				}
				setState(112);
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
			setState(114);
			logicalTerm();
			}
			_ctx.stop = _input.LT(-1);
			setState(121);
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
					setState(116);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(117);
					match(AND);
					setState(118);
					logicalAnd(2);
					}
					} 
				}
				setState(123);
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
			setState(127);
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
				setState(124);
				logicalResult(0);
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(125);
				match(NOT);
				setState(126);
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
			setState(135);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAR:
				{
				setState(130);
				match(LPAR);
				setState(131);
				logicalExpression(0);
				setState(132);
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
				setState(134);
				value();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(142);
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
					setState(137);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(138);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << NEQ) | (1L << LTE) | (1L << GTE) | (1L << GT) | (1L << LT))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(139);
					logicalResult(2);
					}
					} 
				}
				setState(144);
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
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ArithmeticExpressionContext arithmeticExpression() {
			return getRuleContext(ArithmeticExpressionContext.class,0);
		}
		public LogicalExpressionContext logicalExpression() {
			return getRuleContext(LogicalExpressionContext.class,0);
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
			setState(145);
			type();
			setState(146);
			match(IDENTIFIER);
			setState(147);
			match(ASSIGN);
			setState(151);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(148);
				value();
				}
				break;
			case 2:
				{
				setState(149);
				arithmeticExpression(0);
				}
				break;
			case 3:
				{
				setState(150);
				logicalExpression(0);
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
			setState(155);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(153);
				forStatement();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(154);
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
			setState(157);
			match(FOR);
			setState(158);
			match(IDENTIFIER);
			setState(159);
			match(IN);
			setState(160);
			range();
			setState(161);
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
			setState(163);
			match(LPAR);
			setState(164);
			match(INT);
			setState(165);
			match(DOT);
			setState(166);
			match(DOT);
			setState(167);
			match(INT);
			setState(168);
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
			setState(170);
			match(WHILE);
			setState(171);
			match(LPAR);
			setState(172);
			logicalExpression(0);
			setState(173);
			match(RPAR);
			setState(174);
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
		public TerminalNode EMPTY_LINE() { return getToken(PaPyParser.EMPTY_LINE, 0); }
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
			setState(176);
			match(IF);
			setState(177);
			match(LPAR);
			setState(178);
			expression();
			setState(179);
			match(RPAR);
			setState(180);
			block();
			setState(184);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EMPTY_LINE:
				{
				setState(181);
				match(EMPTY_LINE);
				}
				break;
			case ELIF:
				{
				setState(182);
				elifStatement();
				}
				break;
			case ELSE:
				{
				setState(183);
				elseStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
		public TerminalNode EMPTY_LINE() { return getToken(PaPyParser.EMPTY_LINE, 0); }
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
			setState(186);
			match(ELIF);
			setState(187);
			match(LPAR);
			setState(188);
			expression();
			setState(189);
			match(RPAR);
			setState(190);
			block();
			setState(194);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EMPTY_LINE:
				{
				setState(191);
				match(EMPTY_LINE);
				}
				break;
			case ELIF:
				{
				setState(192);
				elifStatement();
				}
				break;
			case ELSE:
				{
				setState(193);
				elseStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
		public TerminalNode EMPTY_LINE() { return getToken(PaPyParser.EMPTY_LINE, 0); }
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
			setState(196);
			match(ELSE);
			setState(197);
			block();
			setState(198);
			match(EMPTY_LINE);
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
		public TerminalNode NL() { return getToken(PaPyParser.NL, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> EMPTY_LINE() { return getTokens(PaPyParser.EMPTY_LINE); }
		public TerminalNode EMPTY_LINE(int i) {
			return getToken(PaPyParser.EMPTY_LINE, i);
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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NL) {
				{
				setState(200);
				match(NL);
				}
			}

			setState(203);
			match(LBR);
			setState(208);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(206);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
					case 1:
						{
						setState(204);
						statement();
						}
						break;
					case 2:
						{
						setState(205);
						match(EMPTY_LINE);
						}
						break;
					}
					} 
				}
				setState(210);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			setState(211);
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
		public List<TerminalNode> IDENTIFIER() { return getTokens(PaPyParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(PaPyParser.IDENTIFIER, i);
		}
		public TerminalNode LPAR() { return getToken(PaPyParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(PaPyParser.RPAR, 0); }
		public TerminalNode RET() { return getToken(PaPyParser.RET, 0); }
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public ReturnBlockContext returnBlock() {
			return getRuleContext(ReturnBlockContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(PaPyParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PaPyParser.COMMA, i);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
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
			setState(252);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(213);
				match(DEF);
				setState(214);
				match(IDENTIFIER);
				setState(215);
				match(LPAR);
				setState(227);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT_TYPE) | (1L << FLOAT_TYPE) | (1L << BOOL_TYPE) | (1L << STRING_TYPE))) != 0)) {
					{
					setState(216);
					type();
					setState(217);
					match(IDENTIFIER);
					setState(224);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(218);
						match(COMMA);
						setState(219);
						type();
						setState(220);
						match(IDENTIFIER);
						}
						}
						setState(226);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(229);
				match(RPAR);
				setState(230);
				match(RET);
				setState(231);
				type();
				setState(232);
				returnBlock();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(234);
				match(DEF);
				setState(235);
				match(IDENTIFIER);
				setState(236);
				match(LPAR);
				setState(248);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT_TYPE) | (1L << FLOAT_TYPE) | (1L << BOOL_TYPE) | (1L << STRING_TYPE))) != 0)) {
					{
					setState(237);
					type();
					setState(238);
					match(IDENTIFIER);
					setState(245);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(239);
						match(COMMA);
						setState(240);
						type();
						setState(241);
						match(IDENTIFIER);
						}
						}
						setState(247);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(250);
				match(RPAR);
				setState(251);
				block();
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

	public static class ReturnBlockContext extends ParserRuleContext {
		public TerminalNode LBR() { return getToken(PaPyParser.LBR, 0); }
		public TerminalNode RETURN() { return getToken(PaPyParser.RETURN, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(PaPyParser.IDENTIFIER, 0); }
		public TerminalNode NL() { return getToken(PaPyParser.NL, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> EMPTY_LINE() { return getTokens(PaPyParser.EMPTY_LINE); }
		public TerminalNode EMPTY_LINE(int i) {
			return getToken(PaPyParser.EMPTY_LINE, i);
		}
		public ReturnBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnBlock; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PaPyVisitor ) return ((PaPyVisitor<? extends T>)visitor).visitReturnBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnBlockContext returnBlock() throws RecognitionException {
		ReturnBlockContext _localctx = new ReturnBlockContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_returnBlock);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NL) {
				{
				setState(254);
				match(NL);
				}
			}

			setState(257);
			match(LBR);
			setState(262);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(260);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
					case 1:
						{
						setState(258);
						statement();
						}
						break;
					case 2:
						{
						setState(259);
						match(EMPTY_LINE);
						}
						break;
					}
					} 
				}
				setState(264);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			}
			setState(265);
			match(RETURN);
			setState(269);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(266);
				value();
				}
				break;
			case 2:
				{
				setState(267);
				expression();
				}
				break;
			case 3:
				{
				setState(268);
				match(IDENTIFIER);
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
		enterRule(_localctx, 40, RULE_funcCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			match(IDENTIFIER);
			setState(272);
			match(LPAR);
			setState(274);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << STRING) | (1L << TRUE) | (1L << FALSE) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(273);
				argList();
				}
			}

			setState(276);
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
		enterRule(_localctx, 42, RULE_argList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			value();
			setState(283);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(279);
				match(COMMA);
				setState(280);
				value();
				}
				}
				setState(285);
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
		enterRule(_localctx, 44, RULE_value);
		try {
			setState(291);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(286);
				number();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(287);
				funcCall();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(288);
				match(IDENTIFIER);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(289);
				logicalValue();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(290);
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
		enterRule(_localctx, 46, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
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
		enterRule(_localctx, 48, RULE_logicalValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
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
		enterRule(_localctx, 50, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
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
		case 3:
			return arithmeticExpression_sempred((ArithmeticExpressionContext)_localctx, predIndex);
		case 4:
			return term_sempred((TermContext)_localctx, predIndex);
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
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean term_sempred(TermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean logicalExpression_sempred(LogicalExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean logicalAnd_sempred(LogicalAndContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean logicalResult_sempred(LogicalResultContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\61\u012e\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\3\2\3\2\3\2\7\2:\n\2\f\2\16\2=\13\2\3\2\3\2\3\3\3"+
		"\3\3\3\3\3\3\3\5\3F\n\3\3\3\3\3\3\4\3\4\5\4L\n\4\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\7\5T\n\5\f\5\16\5W\13\5\3\6\3\6\3\6\3\6\3\6\3\6\5\6_\n\6\3\6\3\6\3"+
		"\6\7\6d\n\6\f\6\16\6g\13\6\3\7\3\7\3\7\3\7\3\7\3\7\7\7o\n\7\f\7\16\7r"+
		"\13\7\3\b\3\b\3\b\3\b\3\b\3\b\7\bz\n\b\f\b\16\b}\13\b\3\t\3\t\3\t\5\t"+
		"\u0082\n\t\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u008a\n\n\3\n\3\n\3\n\7\n\u008f"+
		"\n\n\f\n\16\n\u0092\13\n\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u009a\n\13"+
		"\3\f\3\f\5\f\u009e\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\5\20\u00bb\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21"+
		"\u00c5\n\21\3\22\3\22\3\22\3\22\3\23\5\23\u00cc\n\23\3\23\3\23\3\23\7"+
		"\23\u00d1\n\23\f\23\16\23\u00d4\13\23\3\23\3\23\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\7\24\u00e1\n\24\f\24\16\24\u00e4\13\24\5\24\u00e6"+
		"\n\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\7\24\u00f6\n\24\f\24\16\24\u00f9\13\24\5\24\u00fb\n\24\3\24\3\24"+
		"\5\24\u00ff\n\24\3\25\5\25\u0102\n\25\3\25\3\25\3\25\7\25\u0107\n\25\f"+
		"\25\16\25\u010a\13\25\3\25\3\25\3\25\3\25\5\25\u0110\n\25\3\26\3\26\3"+
		"\26\5\26\u0115\n\26\3\26\3\26\3\27\3\27\3\27\7\27\u011c\n\27\f\27\16\27"+
		"\u011f\13\27\3\30\3\30\3\30\3\30\3\30\5\30\u0126\n\30\3\31\3\31\3\32\3"+
		"\32\3\33\3\33\3\33\2\7\b\n\f\16\22\34\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*,.\60\62\64\2\b\3\2\32\33\4\2\31\31\34\34\3\2\37$\3\2\13"+
		"\f\3\2()\3\2\16\21\2\u013e\2;\3\2\2\2\4E\3\2\2\2\6K\3\2\2\2\bM\3\2\2\2"+
		"\n^\3\2\2\2\fh\3\2\2\2\16s\3\2\2\2\20\u0081\3\2\2\2\22\u0089\3\2\2\2\24"+
		"\u0093\3\2\2\2\26\u009d\3\2\2\2\30\u009f\3\2\2\2\32\u00a5\3\2\2\2\34\u00ac"+
		"\3\2\2\2\36\u00b2\3\2\2\2 \u00bc\3\2\2\2\"\u00c6\3\2\2\2$\u00cb\3\2\2"+
		"\2&\u00fe\3\2\2\2(\u0101\3\2\2\2*\u0111\3\2\2\2,\u0118\3\2\2\2.\u0125"+
		"\3\2\2\2\60\u0127\3\2\2\2\62\u0129\3\2\2\2\64\u012b\3\2\2\2\66:\5\4\3"+
		"\2\67:\7\3\2\28:\5&\24\29\66\3\2\2\29\67\3\2\2\298\3\2\2\2:=\3\2\2\2;"+
		"9\3\2\2\2;<\3\2\2\2<>\3\2\2\2=;\3\2\2\2>?\7\2\2\3?\3\3\2\2\2@F\5\6\4\2"+
		"AF\5\24\13\2BF\5\26\f\2CF\5*\26\2DF\5\36\20\2E@\3\2\2\2EA\3\2\2\2EB\3"+
		"\2\2\2EC\3\2\2\2ED\3\2\2\2FG\3\2\2\2GH\7\3\2\2H\5\3\2\2\2IL\5\b\5\2JL"+
		"\5\f\7\2KI\3\2\2\2KJ\3\2\2\2L\7\3\2\2\2MN\b\5\1\2NO\5\n\6\2OU\3\2\2\2"+
		"PQ\f\3\2\2QR\t\2\2\2RT\5\b\5\4SP\3\2\2\2TW\3\2\2\2US\3\2\2\2UV\3\2\2\2"+
		"V\t\3\2\2\2WU\3\2\2\2X_\b\6\1\2YZ\7\7\2\2Z[\5\b\5\2[\\\7\b\2\2\\_\3\2"+
		"\2\2]_\5.\30\2^X\3\2\2\2^Y\3\2\2\2^]\3\2\2\2_e\3\2\2\2`a\f\3\2\2ab\t\3"+
		"\2\2bd\5\n\6\4c`\3\2\2\2dg\3\2\2\2ec\3\2\2\2ef\3\2\2\2f\13\3\2\2\2ge\3"+
		"\2\2\2hi\b\7\1\2ij\5\16\b\2jp\3\2\2\2kl\f\3\2\2lm\7&\2\2mo\5\f\7\4nk\3"+
		"\2\2\2or\3\2\2\2pn\3\2\2\2pq\3\2\2\2q\r\3\2\2\2rp\3\2\2\2st\b\b\1\2tu"+
		"\5\20\t\2u{\3\2\2\2vw\f\3\2\2wx\7%\2\2xz\5\16\b\4yv\3\2\2\2z}\3\2\2\2"+
		"{y\3\2\2\2{|\3\2\2\2|\17\3\2\2\2}{\3\2\2\2~\u0082\5\22\n\2\177\u0080\7"+
		"\'\2\2\u0080\u0082\5\20\t\2\u0081~\3\2\2\2\u0081\177\3\2\2\2\u0082\21"+
		"\3\2\2\2\u0083\u0084\b\n\1\2\u0084\u0085\7\7\2\2\u0085\u0086\5\f\7\2\u0086"+
		"\u0087\7\b\2\2\u0087\u008a\3\2\2\2\u0088\u008a\5.\30\2\u0089\u0083\3\2"+
		"\2\2\u0089\u0088\3\2\2\2\u008a\u0090\3\2\2\2\u008b\u008c\f\3\2\2\u008c"+
		"\u008d\t\4\2\2\u008d\u008f\5\22\n\4\u008e\u008b\3\2\2\2\u008f\u0092\3"+
		"\2\2\2\u0090\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091\23\3\2\2\2\u0092"+
		"\u0090\3\2\2\2\u0093\u0094\5\64\33\2\u0094\u0095\7\61\2\2\u0095\u0099"+
		"\7\36\2\2\u0096\u009a\5.\30\2\u0097\u009a\5\b\5\2\u0098\u009a\5\f\7\2"+
		"\u0099\u0096\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u0098\3\2\2\2\u009a\25"+
		"\3\2\2\2\u009b\u009e\5\30\r\2\u009c\u009e\5\34\17\2\u009d\u009b\3\2\2"+
		"\2\u009d\u009c\3\2\2\2\u009e\27\3\2\2\2\u009f\u00a0\7\23\2\2\u00a0\u00a1"+
		"\7\61\2\2\u00a1\u00a2\7\24\2\2\u00a2\u00a3\5\32\16\2\u00a3\u00a4\5$\23"+
		"\2\u00a4\31\3\2\2\2\u00a5\u00a6\7\7\2\2\u00a6\u00a7\7\13\2\2\u00a7\u00a8"+
		"\7.\2\2\u00a8\u00a9\7.\2\2\u00a9\u00aa\7\13\2\2\u00aa\u00ab\7\b\2\2\u00ab"+
		"\33\3\2\2\2\u00ac\u00ad\7\25\2\2\u00ad\u00ae\7\7\2\2\u00ae\u00af\5\f\7"+
		"\2\u00af\u00b0\7\b\2\2\u00b0\u00b1\5$\23\2\u00b1\35\3\2\2\2\u00b2\u00b3"+
		"\7\26\2\2\u00b3\u00b4\7\7\2\2\u00b4\u00b5\5\6\4\2\u00b5\u00b6\7\b\2\2"+
		"\u00b6\u00ba\5$\23\2\u00b7\u00bb\7\4\2\2\u00b8\u00bb\5 \21\2\u00b9\u00bb"+
		"\5\"\22\2\u00ba\u00b7\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00b9\3\2\2\2"+
		"\u00bb\37\3\2\2\2\u00bc\u00bd\7\30\2\2\u00bd\u00be\7\7\2\2\u00be\u00bf"+
		"\5\6\4\2\u00bf\u00c0\7\b\2\2\u00c0\u00c4\5$\23\2\u00c1\u00c5\7\4\2\2\u00c2"+
		"\u00c5\5 \21\2\u00c3\u00c5\5\"\22\2\u00c4\u00c1\3\2\2\2\u00c4\u00c2\3"+
		"\2\2\2\u00c4\u00c3\3\2\2\2\u00c5!\3\2\2\2\u00c6\u00c7\7\27\2\2\u00c7\u00c8"+
		"\5$\23\2\u00c8\u00c9\7\4\2\2\u00c9#\3\2\2\2\u00ca\u00cc\7\3\2\2\u00cb"+
		"\u00ca\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00d2\7\5"+
		"\2\2\u00ce\u00d1\5\4\3\2\u00cf\u00d1\7\4\2\2\u00d0\u00ce\3\2\2\2\u00d0"+
		"\u00cf\3\2\2\2\u00d1\u00d4\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d3\3\2"+
		"\2\2\u00d3\u00d5\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d5\u00d6\7\6\2\2\u00d6"+
		"%\3\2\2\2\u00d7\u00d8\7*\2\2\u00d8\u00d9\7\61\2\2\u00d9\u00e5\7\7\2\2"+
		"\u00da\u00db\5\64\33\2\u00db\u00e2\7\61\2\2\u00dc\u00dd\7-\2\2\u00dd\u00de"+
		"\5\64\33\2\u00de\u00df\7\61\2\2\u00df\u00e1\3\2\2\2\u00e0\u00dc\3\2\2"+
		"\2\u00e1\u00e4\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e6"+
		"\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e5\u00da\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6"+
		"\u00e7\3\2\2\2\u00e7\u00e8\7\b\2\2\u00e8\u00e9\7+\2\2\u00e9\u00ea\5\64"+
		"\33\2\u00ea\u00eb\5(\25\2\u00eb\u00ff\3\2\2\2\u00ec\u00ed\7*\2\2\u00ed"+
		"\u00ee\7\61\2\2\u00ee\u00fa\7\7\2\2\u00ef\u00f0\5\64\33\2\u00f0\u00f7"+
		"\7\61\2\2\u00f1\u00f2\7-\2\2\u00f2\u00f3\5\64\33\2\u00f3\u00f4\7\61\2"+
		"\2\u00f4\u00f6\3\2\2\2\u00f5\u00f1\3\2\2\2\u00f6\u00f9\3\2\2\2\u00f7\u00f5"+
		"\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00fb\3\2\2\2\u00f9\u00f7\3\2\2\2\u00fa"+
		"\u00ef\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fd\7\b"+
		"\2\2\u00fd\u00ff\5$\23\2\u00fe\u00d7\3\2\2\2\u00fe\u00ec\3\2\2\2\u00ff"+
		"\'\3\2\2\2\u0100\u0102\7\3\2\2\u0101\u0100\3\2\2\2\u0101\u0102\3\2\2\2"+
		"\u0102\u0103\3\2\2\2\u0103\u0108\7\5\2\2\u0104\u0107\5\4\3\2\u0105\u0107"+
		"\7\4\2\2\u0106\u0104\3\2\2\2\u0106\u0105\3\2\2\2\u0107\u010a\3\2\2\2\u0108"+
		"\u0106\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u010b\3\2\2\2\u010a\u0108\3\2"+
		"\2\2\u010b\u010f\7,\2\2\u010c\u0110\5.\30\2\u010d\u0110\5\6\4\2\u010e"+
		"\u0110\7\61\2\2\u010f\u010c\3\2\2\2\u010f\u010d\3\2\2\2\u010f\u010e\3"+
		"\2\2\2\u0110)\3\2\2\2\u0111\u0112\7\61\2\2\u0112\u0114\7\7\2\2\u0113\u0115"+
		"\5,\27\2\u0114\u0113\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0116\3\2\2\2\u0116"+
		"\u0117\7\b\2\2\u0117+\3\2\2\2\u0118\u011d\5.\30\2\u0119\u011a\7-\2\2\u011a"+
		"\u011c\5.\30\2\u011b\u0119\3\2\2\2\u011c\u011f\3\2\2\2\u011d\u011b\3\2"+
		"\2\2\u011d\u011e\3\2\2\2\u011e-\3\2\2\2\u011f\u011d\3\2\2\2\u0120\u0126"+
		"\5\60\31\2\u0121\u0126\5*\26\2\u0122\u0126\7\61\2\2\u0123\u0126\5\62\32"+
		"\2\u0124\u0126\7\r\2\2\u0125\u0120\3\2\2\2\u0125\u0121\3\2\2\2\u0125\u0122"+
		"\3\2\2\2\u0125\u0123\3\2\2\2\u0125\u0124\3\2\2\2\u0126/\3\2\2\2\u0127"+
		"\u0128\t\5\2\2\u0128\61\3\2\2\2\u0129\u012a\t\6\2\2\u012a\63\3\2\2\2\u012b"+
		"\u012c\t\7\2\2\u012c\65\3\2\2\2!9;EKU^ep{\u0081\u0089\u0090\u0099\u009d"+
		"\u00ba\u00c4\u00cb\u00d0\u00d2\u00e2\u00e5\u00f7\u00fa\u00fe\u0101\u0106"+
		"\u0108\u010f\u0114\u011d\u0125";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}