// Generated from src\main\java\antlr\PaPy.g4 by ANTLR 4.9.2
 package antlr;
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
		RULE_arithmeticExpression = 4, RULE_logicalExpression = 5, RULE_comparisonExpression = 6, 
		RULE_variableDeclaration = 7, RULE_loopStatement = 8, RULE_forStatement = 9, 
		RULE_range = 10, RULE_whileStatement = 11, RULE_ifStatement = 12, RULE_elifStatement = 13, 
		RULE_elseStatement = 14, RULE_block = 15, RULE_functionDeclaration = 16, 
		RULE_functionDeclarationArgument = 17, RULE_returnBlock = 18, RULE_funcCall = 19, 
		RULE_argList = 20, RULE_value = 21, RULE_number = 22, RULE_booleanValue = 23, 
		RULE_type = 24;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "section", "statement", "expression", "arithmeticExpression", 
			"logicalExpression", "comparisonExpression", "variableDeclaration", "loopStatement", 
			"forStatement", "range", "whileStatement", "ifStatement", "elifStatement", 
			"elseStatement", "block", "functionDeclaration", "functionDeclarationArgument", 
			"returnBlock", "funcCall", "argList", "value", "number", "booleanValue", 
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
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NL) | (1L << LPAR) | (1L << INT) | (1L << FLOAT) | (1L << STRING) | (1L << INT_TYPE) | (1L << FLOAT_TYPE) | (1L << BOOL_TYPE) | (1L << STRING_TYPE) | (1L << FOR) | (1L << WHILE) | (1L << IF) | (1L << NOT) | (1L << TRUE) | (1L << FALSE) | (1L << DEF) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(50);
				section();
				}
				}
				setState(55);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(56);
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
			setState(61);
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
				setState(58);
				statement();
				}
				break;
			case DEF:
				enterOuterAlt(_localctx, 2);
				{
				setState(59);
				functionDeclaration();
				}
				break;
			case NL:
				enterOuterAlt(_localctx, 3);
				{
				setState(60);
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
			setState(68);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(63);
				expression();
				}
				break;
			case 2:
				{
				setState(64);
				variableDeclaration();
				}
				break;
			case 3:
				{
				setState(65);
				loopStatement();
				}
				break;
			case 4:
				{
				setState(66);
				funcCall();
				}
				break;
			case 5:
				{
				setState(67);
				ifStatement();
				}
				break;
			}
			setState(70);
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
			setState(75);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(72);
				arithmeticExpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(73);
				logicalExpression(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(74);
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
		public ArithmeticExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmeticExpression; }
	 
		public ArithmeticExpressionContext() { }
		public void copyFrom(ArithmeticExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DivisionContext extends ArithmeticExpressionContext {
		public List<ArithmeticExpressionContext> arithmeticExpression() {
			return getRuleContexts(ArithmeticExpressionContext.class);
		}
		public ArithmeticExpressionContext arithmeticExpression(int i) {
			return getRuleContext(ArithmeticExpressionContext.class,i);
		}
		public TerminalNode DIV() { return getToken(PaPyParser.DIV, 0); }
		public DivisionContext(ArithmeticExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PaPyVisitor ) return ((PaPyVisitor<? extends T>)visitor).visitDivision(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArithmeticParenthesesContext extends ArithmeticExpressionContext {
		public TerminalNode LPAR() { return getToken(PaPyParser.LPAR, 0); }
		public ArithmeticExpressionContext arithmeticExpression() {
			return getRuleContext(ArithmeticExpressionContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(PaPyParser.RPAR, 0); }
		public ArithmeticParenthesesContext(ArithmeticExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PaPyVisitor ) return ((PaPyVisitor<? extends T>)visitor).visitArithmeticParentheses(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AirthmeticValueContext extends ArithmeticExpressionContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public AirthmeticValueContext(ArithmeticExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PaPyVisitor ) return ((PaPyVisitor<? extends T>)visitor).visitAirthmeticValue(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubtractionContext extends ArithmeticExpressionContext {
		public List<ArithmeticExpressionContext> arithmeticExpression() {
			return getRuleContexts(ArithmeticExpressionContext.class);
		}
		public ArithmeticExpressionContext arithmeticExpression(int i) {
			return getRuleContext(ArithmeticExpressionContext.class,i);
		}
		public TerminalNode SUB() { return getToken(PaPyParser.SUB, 0); }
		public SubtractionContext(ArithmeticExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PaPyVisitor ) return ((PaPyVisitor<? extends T>)visitor).visitSubtraction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultiplicationContext extends ArithmeticExpressionContext {
		public List<ArithmeticExpressionContext> arithmeticExpression() {
			return getRuleContexts(ArithmeticExpressionContext.class);
		}
		public ArithmeticExpressionContext arithmeticExpression(int i) {
			return getRuleContext(ArithmeticExpressionContext.class,i);
		}
		public TerminalNode MUL() { return getToken(PaPyParser.MUL, 0); }
		public MultiplicationContext(ArithmeticExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PaPyVisitor ) return ((PaPyVisitor<? extends T>)visitor).visitMultiplication(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AdditionContext extends ArithmeticExpressionContext {
		public List<ArithmeticExpressionContext> arithmeticExpression() {
			return getRuleContexts(ArithmeticExpressionContext.class);
		}
		public ArithmeticExpressionContext arithmeticExpression(int i) {
			return getRuleContext(ArithmeticExpressionContext.class,i);
		}
		public TerminalNode ADD() { return getToken(PaPyParser.ADD, 0); }
		public AdditionContext(ArithmeticExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PaPyVisitor ) return ((PaPyVisitor<? extends T>)visitor).visitAddition(this);
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
			setState(83);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAR:
				{
				_localctx = new ArithmeticParenthesesContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(78);
				match(LPAR);
				setState(79);
				arithmeticExpression(0);
				setState(80);
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
				_localctx = new AirthmeticValueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(82);
				value();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
					setState(97);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicationContext(new ArithmeticExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_arithmeticExpression);
						setState(85);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(86);
						match(MUL);
						setState(87);
						arithmeticExpression(6);
						}
						break;
					case 2:
						{
						_localctx = new DivisionContext(new ArithmeticExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_arithmeticExpression);
						setState(88);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(89);
						match(DIV);
						setState(90);
						arithmeticExpression(5);
						}
						break;
					case 3:
						{
						_localctx = new AdditionContext(new ArithmeticExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_arithmeticExpression);
						setState(91);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(92);
						match(ADD);
						setState(93);
						arithmeticExpression(4);
						}
						break;
					case 4:
						{
						_localctx = new SubtractionContext(new ArithmeticExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_arithmeticExpression);
						setState(94);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(95);
						match(SUB);
						setState(96);
						arithmeticExpression(3);
						}
						break;
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
		public LogicalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalExpression; }
	 
		public LogicalExpressionContext() { }
		public void copyFrom(LogicalExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LogicalNotContext extends LogicalExpressionContext {
		public TerminalNode NOT() { return getToken(PaPyParser.NOT, 0); }
		public LogicalExpressionContext logicalExpression() {
			return getRuleContext(LogicalExpressionContext.class,0);
		}
		public LogicalNotContext(LogicalExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PaPyVisitor ) return ((PaPyVisitor<? extends T>)visitor).visitLogicalNot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicalParenthesesContext extends LogicalExpressionContext {
		public TerminalNode LPAR() { return getToken(PaPyParser.LPAR, 0); }
		public LogicalExpressionContext logicalExpression() {
			return getRuleContext(LogicalExpressionContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(PaPyParser.RPAR, 0); }
		public LogicalParenthesesContext(LogicalExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PaPyVisitor ) return ((PaPyVisitor<? extends T>)visitor).visitLogicalParentheses(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicalValueContext extends LogicalExpressionContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public LogicalValueContext(LogicalExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PaPyVisitor ) return ((PaPyVisitor<? extends T>)visitor).visitLogicalValue(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicalComparisonContext extends LogicalExpressionContext {
		public ComparisonExpressionContext comparisonExpression() {
			return getRuleContext(ComparisonExpressionContext.class,0);
		}
		public LogicalComparisonContext(LogicalExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PaPyVisitor ) return ((PaPyVisitor<? extends T>)visitor).visitLogicalComparison(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicalAndContext extends LogicalExpressionContext {
		public List<LogicalExpressionContext> logicalExpression() {
			return getRuleContexts(LogicalExpressionContext.class);
		}
		public LogicalExpressionContext logicalExpression(int i) {
			return getRuleContext(LogicalExpressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(PaPyParser.AND, 0); }
		public LogicalAndContext(LogicalExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PaPyVisitor ) return ((PaPyVisitor<? extends T>)visitor).visitLogicalAnd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicalOrContext extends LogicalExpressionContext {
		public List<LogicalExpressionContext> logicalExpression() {
			return getRuleContexts(LogicalExpressionContext.class);
		}
		public LogicalExpressionContext logicalExpression(int i) {
			return getRuleContext(LogicalExpressionContext.class,i);
		}
		public TerminalNode OR() { return getToken(PaPyParser.OR, 0); }
		public LogicalOrContext(LogicalExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PaPyVisitor ) return ((PaPyVisitor<? extends T>)visitor).visitLogicalOr(this);
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
			setState(111);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				_localctx = new LogicalParenthesesContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(103);
				match(LPAR);
				setState(104);
				logicalExpression(0);
				setState(105);
				match(RPAR);
				}
				break;
			case 2:
				{
				_localctx = new LogicalNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(107);
				match(NOT);
				setState(108);
				logicalExpression(5);
				}
				break;
			case 3:
				{
				_localctx = new LogicalComparisonContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(109);
				comparisonExpression();
				}
				break;
			case 4:
				{
				_localctx = new LogicalValueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(110);
				value();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(121);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(119);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new LogicalAndContext(new LogicalExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_logicalExpression);
						setState(113);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(114);
						match(AND);
						setState(115);
						logicalExpression(5);
						}
						break;
					case 2:
						{
						_localctx = new LogicalOrContext(new LogicalExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_logicalExpression);
						setState(116);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(117);
						match(OR);
						setState(118);
						logicalExpression(4);
						}
						break;
					}
					} 
				}
				setState(123);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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

	public static class ComparisonExpressionContext extends ParserRuleContext {
		public List<ArithmeticExpressionContext> arithmeticExpression() {
			return getRuleContexts(ArithmeticExpressionContext.class);
		}
		public ArithmeticExpressionContext arithmeticExpression(int i) {
			return getRuleContext(ArithmeticExpressionContext.class,i);
		}
		public TerminalNode EQ() { return getToken(PaPyParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(PaPyParser.NEQ, 0); }
		public TerminalNode GTE() { return getToken(PaPyParser.GTE, 0); }
		public TerminalNode LTE() { return getToken(PaPyParser.LTE, 0); }
		public TerminalNode GT() { return getToken(PaPyParser.GT, 0); }
		public TerminalNode LT() { return getToken(PaPyParser.LT, 0); }
		public ComparisonExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PaPyVisitor ) return ((PaPyVisitor<? extends T>)visitor).visitComparisonExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonExpressionContext comparisonExpression() throws RecognitionException {
		ComparisonExpressionContext _localctx = new ComparisonExpressionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_comparisonExpression);
		try {
			setState(148);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(124);
				arithmeticExpression(0);
				setState(125);
				match(EQ);
				setState(126);
				arithmeticExpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(128);
				arithmeticExpression(0);
				setState(129);
				match(NEQ);
				setState(130);
				arithmeticExpression(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(132);
				arithmeticExpression(0);
				setState(133);
				match(GTE);
				setState(134);
				arithmeticExpression(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(136);
				arithmeticExpression(0);
				setState(137);
				match(LTE);
				setState(138);
				arithmeticExpression(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(140);
				arithmeticExpression(0);
				setState(141);
				match(GT);
				setState(142);
				arithmeticExpression(0);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(144);
				arithmeticExpression(0);
				setState(145);
				match(LT);
				setState(146);
				arithmeticExpression(0);
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
		enterRule(_localctx, 14, RULE_variableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			type();
			setState(151);
			match(IDENTIFIER);
			setState(152);
			match(ASSIGN);
			setState(153);
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
		enterRule(_localctx, 16, RULE_loopStatement);
		try {
			setState(157);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(155);
				forStatement();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(156);
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
		enterRule(_localctx, 18, RULE_forStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(FOR);
			setState(160);
			match(IDENTIFIER);
			setState(161);
			match(IN);
			setState(162);
			range();
			setState(163);
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
		enterRule(_localctx, 20, RULE_range);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			match(LPAR);
			setState(166);
			match(INT);
			setState(167);
			match(DOT);
			setState(168);
			match(DOT);
			setState(169);
			match(INT);
			setState(170);
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
		enterRule(_localctx, 22, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			match(WHILE);
			setState(173);
			match(LPAR);
			setState(174);
			logicalExpression(0);
			setState(175);
			match(RPAR);
			setState(176);
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
		enterRule(_localctx, 24, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			match(IF);
			setState(179);
			match(LPAR);
			setState(180);
			expression();
			setState(181);
			match(RPAR);
			setState(182);
			block();
			setState(188);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(183);
				match(NL);
				setState(186);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ELIF:
					{
					setState(184);
					elifStatement();
					}
					break;
				case ELSE:
					{
					setState(185);
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
		enterRule(_localctx, 26, RULE_elifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			match(ELIF);
			setState(191);
			match(LPAR);
			setState(192);
			expression();
			setState(193);
			match(RPAR);
			setState(194);
			block();
			setState(200);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(195);
				match(NL);
				setState(198);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ELIF:
					{
					setState(196);
					elifStatement();
					}
					break;
				case ELSE:
					{
					setState(197);
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
		enterRule(_localctx, 28, RULE_elseStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			match(ELSE);
			setState(203);
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
		enterRule(_localctx, 30, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NL) {
				{
				setState(205);
				match(NL);
				}
			}

			setState(208);
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
					setState(209);
					statement();
					}
					break;
				case NL:
					{
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
		public TerminalNode RET() { return getToken(PaPyParser.RET, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ReturnBlockContext returnBlock() {
			return getRuleContext(ReturnBlockContext.class,0);
		}
		public List<FunctionDeclarationArgumentContext> functionDeclarationArgument() {
			return getRuleContexts(FunctionDeclarationArgumentContext.class);
		}
		public FunctionDeclarationArgumentContext functionDeclarationArgument(int i) {
			return getRuleContext(FunctionDeclarationArgumentContext.class,i);
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
		enterRule(_localctx, 32, RULE_functionDeclaration);
		int _la;
		try {
			setState(251);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
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
				setState(232);
				match(RET);
				setState(233);
				type();
				setState(234);
				returnBlock();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(236);
				match(DEF);
				setState(237);
				match(IDENTIFIER);
				setState(238);
				match(LPAR);
				setState(247);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT_TYPE) | (1L << FLOAT_TYPE) | (1L << BOOL_TYPE) | (1L << STRING_TYPE))) != 0)) {
					{
					setState(239);
					functionDeclarationArgument();
					setState(244);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(240);
						match(COMMA);
						setState(241);
						functionDeclarationArgument();
						}
						}
						setState(246);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(249);
				match(RPAR);
				setState(250);
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
		enterRule(_localctx, 34, RULE_functionDeclarationArgument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			type();
			setState(254);
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

	public static class ReturnBlockContext extends ParserRuleContext {
		public TerminalNode LBR() { return getToken(PaPyParser.LBR, 0); }
		public TerminalNode RBR() { return getToken(PaPyParser.RBR, 0); }
		public TerminalNode RETURN() { return getToken(PaPyParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
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
		enterRule(_localctx, 36, RULE_returnBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NL) {
				{
				setState(256);
				match(NL);
				}
			}

			setState(259);
			match(LBR);
			setState(264);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NL) | (1L << LPAR) | (1L << INT) | (1L << FLOAT) | (1L << STRING) | (1L << INT_TYPE) | (1L << FLOAT_TYPE) | (1L << BOOL_TYPE) | (1L << STRING_TYPE) | (1L << FOR) | (1L << WHILE) | (1L << IF) | (1L << NOT) | (1L << TRUE) | (1L << FALSE) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(262);
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
					setState(260);
					statement();
					}
					break;
				case NL:
					{
					setState(261);
					match(NL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(266);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			{
			setState(267);
			match(RETURN);
			setState(268);
			expression();
			setState(270);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NL) {
				{
				setState(269);
				match(NL);
				}
			}

			}
			setState(272);
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
		enterRule(_localctx, 38, RULE_funcCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			match(IDENTIFIER);
			setState(275);
			match(LPAR);
			setState(277);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << STRING) | (1L << TRUE) | (1L << FALSE) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(276);
				argList();
				}
			}

			setState(279);
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
		enterRule(_localctx, 40, RULE_argList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			value();
			setState(286);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(282);
				match(COMMA);
				setState(283);
				value();
				}
				}
				setState(288);
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
		public BooleanValueContext booleanValue() {
			return getRuleContext(BooleanValueContext.class,0);
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
		enterRule(_localctx, 42, RULE_value);
		try {
			setState(294);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(289);
				number();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(290);
				funcCall();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(291);
				match(IDENTIFIER);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(292);
				booleanValue();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(293);
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
		enterRule(_localctx, 44, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
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

	public static class BooleanValueContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(PaPyParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(PaPyParser.FALSE, 0); }
		public BooleanValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanValue; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PaPyVisitor ) return ((PaPyVisitor<? extends T>)visitor).visitBooleanValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanValueContext booleanValue() throws RecognitionException {
		BooleanValueContext _localctx = new BooleanValueContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_booleanValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
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
		enterRule(_localctx, 48, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
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
			return precpred(_ctx, 4);
		case 5:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\60\u0131\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\3\2\7\2\66\n\2\f\2\16\29\13\2\3\2\3\2\3\3\3\3\3\3\5\3@\n\3"+
		"\3\4\3\4\3\4\3\4\3\4\5\4G\n\4\3\4\3\4\3\5\3\5\3\5\5\5N\n\5\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\5\6V\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\7\6d\n\6\f\6\16\6g\13\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7r\n\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\7\7z\n\7\f\7\16\7}\13\7\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\5\b\u0097\n\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\5\n\u00a0\n\n\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00bd\n\16\5\16\u00bf"+
		"\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00c9\n\17\5\17\u00cb"+
		"\n\17\3\20\3\20\3\20\3\21\5\21\u00d1\n\21\3\21\3\21\3\21\7\21\u00d6\n"+
		"\21\f\21\16\21\u00d9\13\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\7\22"+
		"\u00e3\n\22\f\22\16\22\u00e6\13\22\5\22\u00e8\n\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u00f5\n\22\f\22\16\22\u00f8\13"+
		"\22\5\22\u00fa\n\22\3\22\3\22\5\22\u00fe\n\22\3\23\3\23\3\23\3\24\5\24"+
		"\u0104\n\24\3\24\3\24\3\24\7\24\u0109\n\24\f\24\16\24\u010c\13\24\3\24"+
		"\3\24\3\24\5\24\u0111\n\24\3\24\3\24\3\25\3\25\3\25\5\25\u0118\n\25\3"+
		"\25\3\25\3\26\3\26\3\26\7\26\u011f\n\26\f\26\16\26\u0122\13\26\3\27\3"+
		"\27\3\27\3\27\3\27\5\27\u0129\n\27\3\30\3\30\3\31\3\31\3\32\3\32\3\32"+
		"\2\4\n\f\33\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\2\5"+
		"\3\2\n\13\3\2\'(\3\2\r\20\2\u0146\2\67\3\2\2\2\4?\3\2\2\2\6F\3\2\2\2\b"+
		"M\3\2\2\2\nU\3\2\2\2\fq\3\2\2\2\16\u0096\3\2\2\2\20\u0098\3\2\2\2\22\u009f"+
		"\3\2\2\2\24\u00a1\3\2\2\2\26\u00a7\3\2\2\2\30\u00ae\3\2\2\2\32\u00b4\3"+
		"\2\2\2\34\u00c0\3\2\2\2\36\u00cc\3\2\2\2 \u00d0\3\2\2\2\"\u00fd\3\2\2"+
		"\2$\u00ff\3\2\2\2&\u0103\3\2\2\2(\u0114\3\2\2\2*\u011b\3\2\2\2,\u0128"+
		"\3\2\2\2.\u012a\3\2\2\2\60\u012c\3\2\2\2\62\u012e\3\2\2\2\64\66\5\4\3"+
		"\2\65\64\3\2\2\2\669\3\2\2\2\67\65\3\2\2\2\678\3\2\2\28:\3\2\2\29\67\3"+
		"\2\2\2:;\7\2\2\3;\3\3\2\2\2<@\5\6\4\2=@\5\"\22\2>@\7\3\2\2?<\3\2\2\2?"+
		"=\3\2\2\2?>\3\2\2\2@\5\3\2\2\2AG\5\b\5\2BG\5\20\t\2CG\5\22\n\2DG\5(\25"+
		"\2EG\5\32\16\2FA\3\2\2\2FB\3\2\2\2FC\3\2\2\2FD\3\2\2\2FE\3\2\2\2GH\3\2"+
		"\2\2HI\7\3\2\2I\7\3\2\2\2JN\5\n\6\2KN\5\f\7\2LN\5,\27\2MJ\3\2\2\2MK\3"+
		"\2\2\2ML\3\2\2\2N\t\3\2\2\2OP\b\6\1\2PQ\7\6\2\2QR\5\n\6\2RS\7\7\2\2SV"+
		"\3\2\2\2TV\5,\27\2UO\3\2\2\2UT\3\2\2\2Ve\3\2\2\2WX\f\7\2\2XY\7\30\2\2"+
		"Yd\5\n\6\bZ[\f\6\2\2[\\\7\33\2\2\\d\5\n\6\7]^\f\5\2\2^_\7\31\2\2_d\5\n"+
		"\6\6`a\f\4\2\2ab\7\32\2\2bd\5\n\6\5cW\3\2\2\2cZ\3\2\2\2c]\3\2\2\2c`\3"+
		"\2\2\2dg\3\2\2\2ec\3\2\2\2ef\3\2\2\2f\13\3\2\2\2ge\3\2\2\2hi\b\7\1\2i"+
		"j\7\6\2\2jk\5\f\7\2kl\7\7\2\2lr\3\2\2\2mn\7&\2\2nr\5\f\7\7or\5\16\b\2"+
		"pr\5,\27\2qh\3\2\2\2qm\3\2\2\2qo\3\2\2\2qp\3\2\2\2r{\3\2\2\2st\f\6\2\2"+
		"tu\7$\2\2uz\5\f\7\7vw\f\5\2\2wx\7%\2\2xz\5\f\7\6ys\3\2\2\2yv\3\2\2\2z"+
		"}\3\2\2\2{y\3\2\2\2{|\3\2\2\2|\r\3\2\2\2}{\3\2\2\2~\177\5\n\6\2\177\u0080"+
		"\7\36\2\2\u0080\u0081\5\n\6\2\u0081\u0097\3\2\2\2\u0082\u0083\5\n\6\2"+
		"\u0083\u0084\7\37\2\2\u0084\u0085\5\n\6\2\u0085\u0097\3\2\2\2\u0086\u0087"+
		"\5\n\6\2\u0087\u0088\7!\2\2\u0088\u0089\5\n\6\2\u0089\u0097\3\2\2\2\u008a"+
		"\u008b\5\n\6\2\u008b\u008c\7 \2\2\u008c\u008d\5\n\6\2\u008d\u0097\3\2"+
		"\2\2\u008e\u008f\5\n\6\2\u008f\u0090\7\"\2\2\u0090\u0091\5\n\6\2\u0091"+
		"\u0097\3\2\2\2\u0092\u0093\5\n\6\2\u0093\u0094\7#\2\2\u0094\u0095\5\n"+
		"\6\2\u0095\u0097\3\2\2\2\u0096~\3\2\2\2\u0096\u0082\3\2\2\2\u0096\u0086"+
		"\3\2\2\2\u0096\u008a\3\2\2\2\u0096\u008e\3\2\2\2\u0096\u0092\3\2\2\2\u0097"+
		"\17\3\2\2\2\u0098\u0099\5\62\32\2\u0099\u009a\7\60\2\2\u009a\u009b\7\35"+
		"\2\2\u009b\u009c\5\b\5\2\u009c\21\3\2\2\2\u009d\u00a0\5\24\13\2\u009e"+
		"\u00a0\5\30\r\2\u009f\u009d\3\2\2\2\u009f\u009e\3\2\2\2\u00a0\23\3\2\2"+
		"\2\u00a1\u00a2\7\22\2\2\u00a2\u00a3\7\60\2\2\u00a3\u00a4\7\23\2\2\u00a4"+
		"\u00a5\5\26\f\2\u00a5\u00a6\5 \21\2\u00a6\25\3\2\2\2\u00a7\u00a8\7\6\2"+
		"\2\u00a8\u00a9\7\n\2\2\u00a9\u00aa\7-\2\2\u00aa\u00ab\7-\2\2\u00ab\u00ac"+
		"\7\n\2\2\u00ac\u00ad\7\7\2\2\u00ad\27\3\2\2\2\u00ae\u00af\7\24\2\2\u00af"+
		"\u00b0\7\6\2\2\u00b0\u00b1\5\f\7\2\u00b1\u00b2\7\7\2\2\u00b2\u00b3\5 "+
		"\21\2\u00b3\31\3\2\2\2\u00b4\u00b5\7\25\2\2\u00b5\u00b6\7\6\2\2\u00b6"+
		"\u00b7\5\b\5\2\u00b7\u00b8\7\7\2\2\u00b8\u00be\5 \21\2\u00b9\u00bc\7\3"+
		"\2\2\u00ba\u00bd\5\34\17\2\u00bb\u00bd\5\36\20\2\u00bc\u00ba\3\2\2\2\u00bc"+
		"\u00bb\3\2\2\2\u00bd\u00bf\3\2\2\2\u00be\u00b9\3\2\2\2\u00be\u00bf\3\2"+
		"\2\2\u00bf\33\3\2\2\2\u00c0\u00c1\7\27\2\2\u00c1\u00c2\7\6\2\2\u00c2\u00c3"+
		"\5\b\5\2\u00c3\u00c4\7\7\2\2\u00c4\u00ca\5 \21\2\u00c5\u00c8\7\3\2\2\u00c6"+
		"\u00c9\5\34\17\2\u00c7\u00c9\5\36\20\2\u00c8\u00c6\3\2\2\2\u00c8\u00c7"+
		"\3\2\2\2\u00c9\u00cb\3\2\2\2\u00ca\u00c5\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb"+
		"\35\3\2\2\2\u00cc\u00cd\7\26\2\2\u00cd\u00ce\5 \21\2\u00ce\37\3\2\2\2"+
		"\u00cf\u00d1\7\3\2\2\u00d0\u00cf\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d2"+
		"\3\2\2\2\u00d2\u00d7\7\4\2\2\u00d3\u00d6\5\6\4\2\u00d4\u00d6\7\3\2\2\u00d5"+
		"\u00d3\3\2\2\2\u00d5\u00d4\3\2\2\2\u00d6\u00d9\3\2\2\2\u00d7\u00d5\3\2"+
		"\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00da\3\2\2\2\u00d9\u00d7\3\2\2\2\u00da"+
		"\u00db\7\5\2\2\u00db!\3\2\2\2\u00dc\u00dd\7)\2\2\u00dd\u00de\7\60\2\2"+
		"\u00de\u00e7\7\6\2\2\u00df\u00e4\5$\23\2\u00e0\u00e1\7,\2\2\u00e1\u00e3"+
		"\5$\23\2\u00e2\u00e0\3\2\2\2\u00e3\u00e6\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4"+
		"\u00e5\3\2\2\2\u00e5\u00e8\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e7\u00df\3\2"+
		"\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00ea\7\7\2\2\u00ea"+
		"\u00eb\7*\2\2\u00eb\u00ec\5\62\32\2\u00ec\u00ed\5&\24\2\u00ed\u00fe\3"+
		"\2\2\2\u00ee\u00ef\7)\2\2\u00ef\u00f0\7\60\2\2\u00f0\u00f9\7\6\2\2\u00f1"+
		"\u00f6\5$\23\2\u00f2\u00f3\7,\2\2\u00f3\u00f5\5$\23\2\u00f4\u00f2\3\2"+
		"\2\2\u00f5\u00f8\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7"+
		"\u00fa\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f9\u00f1\3\2\2\2\u00f9\u00fa\3\2"+
		"\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fc\7\7\2\2\u00fc\u00fe\5 \21\2\u00fd"+
		"\u00dc\3\2\2\2\u00fd\u00ee\3\2\2\2\u00fe#\3\2\2\2\u00ff\u0100\5\62\32"+
		"\2\u0100\u0101\7\60\2\2\u0101%\3\2\2\2\u0102\u0104\7\3\2\2\u0103\u0102"+
		"\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u010a\7\4\2\2\u0106"+
		"\u0109\5\6\4\2\u0107\u0109\7\3\2\2\u0108\u0106\3\2\2\2\u0108\u0107\3\2"+
		"\2\2\u0109\u010c\3\2\2\2\u010a\u0108\3\2\2\2\u010a\u010b\3\2\2\2\u010b"+
		"\u010d\3\2\2\2\u010c\u010a\3\2\2\2\u010d\u010e\7+\2\2\u010e\u0110\5\b"+
		"\5\2\u010f\u0111\7\3\2\2\u0110\u010f\3\2\2\2\u0110\u0111\3\2\2\2\u0111"+
		"\u0112\3\2\2\2\u0112\u0113\7\5\2\2\u0113\'\3\2\2\2\u0114\u0115\7\60\2"+
		"\2\u0115\u0117\7\6\2\2\u0116\u0118\5*\26\2\u0117\u0116\3\2\2\2\u0117\u0118"+
		"\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u011a\7\7\2\2\u011a)\3\2\2\2\u011b"+
		"\u0120\5,\27\2\u011c\u011d\7,\2\2\u011d\u011f\5,\27\2\u011e\u011c\3\2"+
		"\2\2\u011f\u0122\3\2\2\2\u0120\u011e\3\2\2\2\u0120\u0121\3\2\2\2\u0121"+
		"+\3\2\2\2\u0122\u0120\3\2\2\2\u0123\u0129\5.\30\2\u0124\u0129\5(\25\2"+
		"\u0125\u0129\7\60\2\2\u0126\u0129\5\60\31\2\u0127\u0129\7\f\2\2\u0128"+
		"\u0123\3\2\2\2\u0128\u0124\3\2\2\2\u0128\u0125\3\2\2\2\u0128\u0126\3\2"+
		"\2\2\u0128\u0127\3\2\2\2\u0129-\3\2\2\2\u012a\u012b\t\2\2\2\u012b/\3\2"+
		"\2\2\u012c\u012d\t\3\2\2\u012d\61\3\2\2\2\u012e\u012f\t\4\2\2\u012f\63"+
		"\3\2\2\2!\67?FMUceqy{\u0096\u009f\u00bc\u00be\u00c8\u00ca\u00d0\u00d5"+
		"\u00d7\u00e4\u00e7\u00f6\u00f9\u00fd\u0103\u0108\u010a\u0110\u0117\u0120"+
		"\u0128";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}