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
		COMMA=42, DOT=43, TAB=44, SPACES=45, IDENTIFIER=46, ERROR=47;
	public static final int
		RULE_program = 0, RULE_section = 1, RULE_statement = 2, RULE_expression = 3, 
		RULE_arithmeticExpression = 4, RULE_logicalExpression = 5, RULE_comparisonExpression = 6, 
		RULE_variableDeclaration = 7, RULE_variableReassignment = 8, RULE_loopStatement = 9, 
		RULE_forStatement = 10, RULE_range = 11, RULE_whileStatement = 12, RULE_ifStatement = 13, 
		RULE_elifStatement = 14, RULE_elseStatement = 15, RULE_block = 16, RULE_functionDeclaration = 17, 
		RULE_functionDeclarationArgument = 18, RULE_returnBlock = 19, RULE_returnExpression = 20, 
		RULE_funcCall = 21, RULE_argList = 22, RULE_value = 23, RULE_number = 24, 
		RULE_booleanValue = 25, RULE_type = 26;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "section", "statement", "expression", "arithmeticExpression", 
			"logicalExpression", "comparisonExpression", "variableDeclaration", "variableReassignment", 
			"loopStatement", "forStatement", "range", "whileStatement", "ifStatement", 
			"elifStatement", "elseStatement", "block", "functionDeclaration", "functionDeclarationArgument", 
			"returnBlock", "returnExpression", "funcCall", "argList", "value", "number", 
			"booleanValue", "type"
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
		public VariableReassignmentContext variableReassignment() {
			return getRuleContext(VariableReassignmentContext.class,0);
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
			setState(73);
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
				variableReassignment();
				}
				break;
			case 4:
				{
				setState(70);
				loopStatement();
				}
				break;
			case 5:
				{
				setState(71);
				funcCall();
				}
				break;
			case 6:
				{
				setState(72);
				ifStatement();
				}
				break;
			}
			setState(75);
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
			setState(80);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(77);
				arithmeticExpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(78);
				logicalExpression(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(79);
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
			setState(88);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAR:
				{
				_localctx = new ArithmeticParenthesesContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(83);
				match(LPAR);
				setState(84);
				arithmeticExpression(0);
				setState(85);
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
				setState(87);
				value();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(104);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(102);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicationContext(new ArithmeticExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_arithmeticExpression);
						setState(90);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(91);
						match(MUL);
						setState(92);
						arithmeticExpression(6);
						}
						break;
					case 2:
						{
						_localctx = new DivisionContext(new ArithmeticExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_arithmeticExpression);
						setState(93);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(94);
						match(DIV);
						setState(95);
						arithmeticExpression(5);
						}
						break;
					case 3:
						{
						_localctx = new AdditionContext(new ArithmeticExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_arithmeticExpression);
						setState(96);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(97);
						match(ADD);
						setState(98);
						arithmeticExpression(4);
						}
						break;
					case 4:
						{
						_localctx = new SubtractionContext(new ArithmeticExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_arithmeticExpression);
						setState(99);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(100);
						match(SUB);
						setState(101);
						arithmeticExpression(3);
						}
						break;
					}
					} 
				}
				setState(106);
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
			setState(116);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				_localctx = new LogicalParenthesesContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(108);
				match(LPAR);
				setState(109);
				logicalExpression(0);
				setState(110);
				match(RPAR);
				}
				break;
			case 2:
				{
				_localctx = new LogicalNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(112);
				match(NOT);
				setState(113);
				logicalExpression(5);
				}
				break;
			case 3:
				{
				_localctx = new LogicalComparisonContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(114);
				comparisonExpression();
				}
				break;
			case 4:
				{
				_localctx = new LogicalValueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(115);
				value();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(126);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(124);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new LogicalAndContext(new LogicalExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_logicalExpression);
						setState(118);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(119);
						match(AND);
						setState(120);
						logicalExpression(5);
						}
						break;
					case 2:
						{
						_localctx = new LogicalOrContext(new LogicalExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_logicalExpression);
						setState(121);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(122);
						match(OR);
						setState(123);
						logicalExpression(4);
						}
						break;
					}
					} 
				}
				setState(128);
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
			setState(153);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(129);
				arithmeticExpression(0);
				setState(130);
				match(EQ);
				setState(131);
				arithmeticExpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(133);
				arithmeticExpression(0);
				setState(134);
				match(NEQ);
				setState(135);
				arithmeticExpression(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(137);
				arithmeticExpression(0);
				setState(138);
				match(GTE);
				setState(139);
				arithmeticExpression(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(141);
				arithmeticExpression(0);
				setState(142);
				match(LTE);
				setState(143);
				arithmeticExpression(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(145);
				arithmeticExpression(0);
				setState(146);
				match(GT);
				setState(147);
				arithmeticExpression(0);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(149);
				arithmeticExpression(0);
				setState(150);
				match(LT);
				setState(151);
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
			setState(155);
			type();
			setState(156);
			match(IDENTIFIER);
			setState(157);
			match(ASSIGN);
			setState(158);
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

	public static class VariableReassignmentContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(PaPyParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGN() { return getToken(PaPyParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableReassignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableReassignment; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PaPyVisitor ) return ((PaPyVisitor<? extends T>)visitor).visitVariableReassignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableReassignmentContext variableReassignment() throws RecognitionException {
		VariableReassignmentContext _localctx = new VariableReassignmentContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_variableReassignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(IDENTIFIER);
			setState(161);
			match(ASSIGN);
			setState(162);
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
		enterRule(_localctx, 18, RULE_loopStatement);
		try {
			setState(166);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(164);
				forStatement();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(165);
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
		enterRule(_localctx, 20, RULE_forStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(FOR);
			setState(169);
			match(IDENTIFIER);
			setState(170);
			match(IN);
			setState(171);
			range();
			setState(172);
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
		enterRule(_localctx, 22, RULE_range);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(LPAR);
			setState(175);
			match(INT);
			setState(176);
			match(DOT);
			setState(177);
			match(DOT);
			setState(178);
			match(INT);
			setState(179);
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
		enterRule(_localctx, 24, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			match(WHILE);
			setState(182);
			match(LPAR);
			setState(183);
			logicalExpression(0);
			setState(184);
			match(RPAR);
			setState(185);
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
		enterRule(_localctx, 26, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			match(IF);
			setState(188);
			match(LPAR);
			setState(189);
			expression();
			setState(190);
			match(RPAR);
			setState(191);
			block();
			setState(197);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(192);
				match(NL);
				setState(195);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ELIF:
					{
					setState(193);
					elifStatement();
					}
					break;
				case ELSE:
					{
					setState(194);
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
		enterRule(_localctx, 28, RULE_elifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			match(ELIF);
			setState(200);
			match(LPAR);
			setState(201);
			expression();
			setState(202);
			match(RPAR);
			setState(203);
			block();
			setState(209);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(204);
				match(NL);
				setState(207);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ELIF:
					{
					setState(205);
					elifStatement();
					}
					break;
				case ELSE:
					{
					setState(206);
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
		enterRule(_localctx, 30, RULE_elseStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			match(ELSE);
			setState(212);
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
		enterRule(_localctx, 32, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NL) {
				{
				setState(214);
				match(NL);
				}
			}

			setState(217);
			match(LBR);
			setState(222);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NL) | (1L << LPAR) | (1L << INT) | (1L << FLOAT) | (1L << STRING) | (1L << INT_TYPE) | (1L << FLOAT_TYPE) | (1L << BOOL_TYPE) | (1L << STRING_TYPE) | (1L << FOR) | (1L << WHILE) | (1L << IF) | (1L << NOT) | (1L << TRUE) | (1L << FALSE) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(220);
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
					setState(218);
					statement();
					}
					break;
				case NL:
					{
					setState(219);
					match(NL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(224);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(225);
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
		enterRule(_localctx, 34, RULE_functionDeclaration);
		int _la;
		try {
			setState(260);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(227);
				match(DEF);
				setState(228);
				match(IDENTIFIER);
				setState(229);
				match(LPAR);
				setState(238);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT_TYPE) | (1L << FLOAT_TYPE) | (1L << BOOL_TYPE) | (1L << STRING_TYPE))) != 0)) {
					{
					setState(230);
					functionDeclarationArgument();
					setState(235);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(231);
						match(COMMA);
						setState(232);
						functionDeclarationArgument();
						}
						}
						setState(237);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(240);
				match(RPAR);
				setState(241);
				match(RET);
				setState(242);
				type();
				setState(243);
				returnBlock();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(245);
				match(DEF);
				setState(246);
				match(IDENTIFIER);
				setState(247);
				match(LPAR);
				setState(256);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT_TYPE) | (1L << FLOAT_TYPE) | (1L << BOOL_TYPE) | (1L << STRING_TYPE))) != 0)) {
					{
					setState(248);
					functionDeclarationArgument();
					setState(253);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(249);
						match(COMMA);
						setState(250);
						functionDeclarationArgument();
						}
						}
						setState(255);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(258);
				match(RPAR);
				setState(259);
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
		enterRule(_localctx, 36, RULE_functionDeclarationArgument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			type();
			setState(263);
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
		public ReturnExpressionContext returnExpression() {
			return getRuleContext(ReturnExpressionContext.class,0);
		}
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
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NL) {
				{
				setState(265);
				match(NL);
				}
			}

			setState(268);
			match(LBR);
			setState(273);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NL) | (1L << LPAR) | (1L << INT) | (1L << FLOAT) | (1L << STRING) | (1L << INT_TYPE) | (1L << FLOAT_TYPE) | (1L << BOOL_TYPE) | (1L << STRING_TYPE) | (1L << FOR) | (1L << WHILE) | (1L << IF) | (1L << NOT) | (1L << TRUE) | (1L << FALSE) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(271);
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
					setState(269);
					statement();
					}
					break;
				case NL:
					{
					setState(270);
					match(NL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(275);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(276);
			returnExpression();
			setState(277);
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

	public static class ReturnExpressionContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(PaPyParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode NL() { return getToken(PaPyParser.NL, 0); }
		public ReturnExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PaPyVisitor ) return ((PaPyVisitor<? extends T>)visitor).visitReturnExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnExpressionContext returnExpression() throws RecognitionException {
		ReturnExpressionContext _localctx = new ReturnExpressionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_returnExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			match(RETURN);
			setState(280);
			expression();
			setState(282);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NL) {
				{
				setState(281);
				match(NL);
				}
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
		enterRule(_localctx, 42, RULE_funcCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			match(IDENTIFIER);
			setState(285);
			match(LPAR);
			setState(287);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << STRING) | (1L << TRUE) | (1L << FALSE) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(286);
				argList();
				}
			}

			setState(289);
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
			setState(291);
			value();
			setState(296);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(292);
				match(COMMA);
				setState(293);
				value();
				}
				}
				setState(298);
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
		enterRule(_localctx, 46, RULE_value);
		try {
			setState(304);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(299);
				number();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(300);
				funcCall();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(301);
				match(IDENTIFIER);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(302);
				booleanValue();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(303);
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
			setState(306);
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
		enterRule(_localctx, 50, RULE_booleanValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
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
			setState(310);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\61\u013b\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\3\2\7\2:\n\2\f\2\16\2=\13\2\3\2\3\2\3\3"+
		"\3\3\3\3\5\3D\n\3\3\4\3\4\3\4\3\4\3\4\3\4\5\4L\n\4\3\4\3\4\3\5\3\5\3\5"+
		"\5\5S\n\5\3\6\3\6\3\6\3\6\3\6\3\6\5\6[\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\7\6i\n\6\f\6\16\6l\13\6\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\5\7w\n\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\177\n\7\f\7\16\7\u0082"+
		"\13\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u009c\n\b\3\t\3\t\3\t\3\t\3\t\3\n"+
		"\3\n\3\n\3\n\3\13\3\13\5\13\u00a9\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\5\17\u00c6\n\17\5\17\u00c8\n\17\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\5\20\u00d2\n\20\5\20\u00d4\n\20\3\21\3\21\3\21"+
		"\3\22\5\22\u00da\n\22\3\22\3\22\3\22\7\22\u00df\n\22\f\22\16\22\u00e2"+
		"\13\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u00ec\n\23\f\23\16"+
		"\23\u00ef\13\23\5\23\u00f1\n\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\7\23\u00fe\n\23\f\23\16\23\u0101\13\23\5\23\u0103\n\23"+
		"\3\23\3\23\5\23\u0107\n\23\3\24\3\24\3\24\3\25\5\25\u010d\n\25\3\25\3"+
		"\25\3\25\7\25\u0112\n\25\f\25\16\25\u0115\13\25\3\25\3\25\3\25\3\26\3"+
		"\26\3\26\5\26\u011d\n\26\3\27\3\27\3\27\5\27\u0122\n\27\3\27\3\27\3\30"+
		"\3\30\3\30\7\30\u0129\n\30\f\30\16\30\u012c\13\30\3\31\3\31\3\31\3\31"+
		"\3\31\5\31\u0133\n\31\3\32\3\32\3\33\3\33\3\34\3\34\3\34\2\4\n\f\35\2"+
		"\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\66\2\5\3\2\n\13"+
		"\3\2\'(\3\2\r\20\2\u014f\2;\3\2\2\2\4C\3\2\2\2\6K\3\2\2\2\bR\3\2\2\2\n"+
		"Z\3\2\2\2\fv\3\2\2\2\16\u009b\3\2\2\2\20\u009d\3\2\2\2\22\u00a2\3\2\2"+
		"\2\24\u00a8\3\2\2\2\26\u00aa\3\2\2\2\30\u00b0\3\2\2\2\32\u00b7\3\2\2\2"+
		"\34\u00bd\3\2\2\2\36\u00c9\3\2\2\2 \u00d5\3\2\2\2\"\u00d9\3\2\2\2$\u0106"+
		"\3\2\2\2&\u0108\3\2\2\2(\u010c\3\2\2\2*\u0119\3\2\2\2,\u011e\3\2\2\2."+
		"\u0125\3\2\2\2\60\u0132\3\2\2\2\62\u0134\3\2\2\2\64\u0136\3\2\2\2\66\u0138"+
		"\3\2\2\28:\5\4\3\298\3\2\2\2:=\3\2\2\2;9\3\2\2\2;<\3\2\2\2<>\3\2\2\2="+
		";\3\2\2\2>?\7\2\2\3?\3\3\2\2\2@D\5\6\4\2AD\5$\23\2BD\7\3\2\2C@\3\2\2\2"+
		"CA\3\2\2\2CB\3\2\2\2D\5\3\2\2\2EL\5\b\5\2FL\5\20\t\2GL\5\22\n\2HL\5\24"+
		"\13\2IL\5,\27\2JL\5\34\17\2KE\3\2\2\2KF\3\2\2\2KG\3\2\2\2KH\3\2\2\2KI"+
		"\3\2\2\2KJ\3\2\2\2LM\3\2\2\2MN\7\3\2\2N\7\3\2\2\2OS\5\n\6\2PS\5\f\7\2"+
		"QS\5\60\31\2RO\3\2\2\2RP\3\2\2\2RQ\3\2\2\2S\t\3\2\2\2TU\b\6\1\2UV\7\6"+
		"\2\2VW\5\n\6\2WX\7\7\2\2X[\3\2\2\2Y[\5\60\31\2ZT\3\2\2\2ZY\3\2\2\2[j\3"+
		"\2\2\2\\]\f\7\2\2]^\7\30\2\2^i\5\n\6\b_`\f\6\2\2`a\7\33\2\2ai\5\n\6\7"+
		"bc\f\5\2\2cd\7\31\2\2di\5\n\6\6ef\f\4\2\2fg\7\32\2\2gi\5\n\6\5h\\\3\2"+
		"\2\2h_\3\2\2\2hb\3\2\2\2he\3\2\2\2il\3\2\2\2jh\3\2\2\2jk\3\2\2\2k\13\3"+
		"\2\2\2lj\3\2\2\2mn\b\7\1\2no\7\6\2\2op\5\f\7\2pq\7\7\2\2qw\3\2\2\2rs\7"+
		"&\2\2sw\5\f\7\7tw\5\16\b\2uw\5\60\31\2vm\3\2\2\2vr\3\2\2\2vt\3\2\2\2v"+
		"u\3\2\2\2w\u0080\3\2\2\2xy\f\6\2\2yz\7$\2\2z\177\5\f\7\7{|\f\5\2\2|}\7"+
		"%\2\2}\177\5\f\7\6~x\3\2\2\2~{\3\2\2\2\177\u0082\3\2\2\2\u0080~\3\2\2"+
		"\2\u0080\u0081\3\2\2\2\u0081\r\3\2\2\2\u0082\u0080\3\2\2\2\u0083\u0084"+
		"\5\n\6\2\u0084\u0085\7\36\2\2\u0085\u0086\5\n\6\2\u0086\u009c\3\2\2\2"+
		"\u0087\u0088\5\n\6\2\u0088\u0089\7\37\2\2\u0089\u008a\5\n\6\2\u008a\u009c"+
		"\3\2\2\2\u008b\u008c\5\n\6\2\u008c\u008d\7!\2\2\u008d\u008e\5\n\6\2\u008e"+
		"\u009c\3\2\2\2\u008f\u0090\5\n\6\2\u0090\u0091\7 \2\2\u0091\u0092\5\n"+
		"\6\2\u0092\u009c\3\2\2\2\u0093\u0094\5\n\6\2\u0094\u0095\7\"\2\2\u0095"+
		"\u0096\5\n\6\2\u0096\u009c\3\2\2\2\u0097\u0098\5\n\6\2\u0098\u0099\7#"+
		"\2\2\u0099\u009a\5\n\6\2\u009a\u009c\3\2\2\2\u009b\u0083\3\2\2\2\u009b"+
		"\u0087\3\2\2\2\u009b\u008b\3\2\2\2\u009b\u008f\3\2\2\2\u009b\u0093\3\2"+
		"\2\2\u009b\u0097\3\2\2\2\u009c\17\3\2\2\2\u009d\u009e\5\66\34\2\u009e"+
		"\u009f\7\60\2\2\u009f\u00a0\7\35\2\2\u00a0\u00a1\5\b\5\2\u00a1\21\3\2"+
		"\2\2\u00a2\u00a3\7\60\2\2\u00a3\u00a4\7\35\2\2\u00a4\u00a5\5\b\5\2\u00a5"+
		"\23\3\2\2\2\u00a6\u00a9\5\26\f\2\u00a7\u00a9\5\32\16\2\u00a8\u00a6\3\2"+
		"\2\2\u00a8\u00a7\3\2\2\2\u00a9\25\3\2\2\2\u00aa\u00ab\7\22\2\2\u00ab\u00ac"+
		"\7\60\2\2\u00ac\u00ad\7\23\2\2\u00ad\u00ae\5\30\r\2\u00ae\u00af\5\"\22"+
		"\2\u00af\27\3\2\2\2\u00b0\u00b1\7\6\2\2\u00b1\u00b2\7\n\2\2\u00b2\u00b3"+
		"\7-\2\2\u00b3\u00b4\7-\2\2\u00b4\u00b5\7\n\2\2\u00b5\u00b6\7\7\2\2\u00b6"+
		"\31\3\2\2\2\u00b7\u00b8\7\24\2\2\u00b8\u00b9\7\6\2\2\u00b9\u00ba\5\f\7"+
		"\2\u00ba\u00bb\7\7\2\2\u00bb\u00bc\5\"\22\2\u00bc\33\3\2\2\2\u00bd\u00be"+
		"\7\25\2\2\u00be\u00bf\7\6\2\2\u00bf\u00c0\5\b\5\2\u00c0\u00c1\7\7\2\2"+
		"\u00c1\u00c7\5\"\22\2\u00c2\u00c5\7\3\2\2\u00c3\u00c6\5\36\20\2\u00c4"+
		"\u00c6\5 \21\2\u00c5\u00c3\3\2\2\2\u00c5\u00c4\3\2\2\2\u00c6\u00c8\3\2"+
		"\2\2\u00c7\u00c2\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\35\3\2\2\2\u00c9\u00ca"+
		"\7\27\2\2\u00ca\u00cb\7\6\2\2\u00cb\u00cc\5\b\5\2\u00cc\u00cd\7\7\2\2"+
		"\u00cd\u00d3\5\"\22\2\u00ce\u00d1\7\3\2\2\u00cf\u00d2\5\36\20\2\u00d0"+
		"\u00d2\5 \21\2\u00d1\u00cf\3\2\2\2\u00d1\u00d0\3\2\2\2\u00d2\u00d4\3\2"+
		"\2\2\u00d3\u00ce\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\37\3\2\2\2\u00d5\u00d6"+
		"\7\26\2\2\u00d6\u00d7\5\"\22\2\u00d7!\3\2\2\2\u00d8\u00da\7\3\2\2\u00d9"+
		"\u00d8\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00e0\7\4"+
		"\2\2\u00dc\u00df\5\6\4\2\u00dd\u00df\7\3\2\2\u00de\u00dc\3\2\2\2\u00de"+
		"\u00dd\3\2\2\2\u00df\u00e2\3\2\2\2\u00e0\u00de\3\2\2\2\u00e0\u00e1\3\2"+
		"\2\2\u00e1\u00e3\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e3\u00e4\7\5\2\2\u00e4"+
		"#\3\2\2\2\u00e5\u00e6\7)\2\2\u00e6\u00e7\7\60\2\2\u00e7\u00f0\7\6\2\2"+
		"\u00e8\u00ed\5&\24\2\u00e9\u00ea\7,\2\2\u00ea\u00ec\5&\24\2\u00eb\u00e9"+
		"\3\2\2\2\u00ec\u00ef\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee"+
		"\u00f1\3\2\2\2\u00ef\u00ed\3\2\2\2\u00f0\u00e8\3\2\2\2\u00f0\u00f1\3\2"+
		"\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f3\7\7\2\2\u00f3\u00f4\7*\2\2\u00f4"+
		"\u00f5\5\66\34\2\u00f5\u00f6\5(\25\2\u00f6\u0107\3\2\2\2\u00f7\u00f8\7"+
		")\2\2\u00f8\u00f9\7\60\2\2\u00f9\u0102\7\6\2\2\u00fa\u00ff\5&\24\2\u00fb"+
		"\u00fc\7,\2\2\u00fc\u00fe\5&\24\2\u00fd\u00fb\3\2\2\2\u00fe\u0101\3\2"+
		"\2\2\u00ff\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0103\3\2\2\2\u0101"+
		"\u00ff\3\2\2\2\u0102\u00fa\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0104\3\2"+
		"\2\2\u0104\u0105\7\7\2\2\u0105\u0107\5\"\22\2\u0106\u00e5\3\2\2\2\u0106"+
		"\u00f7\3\2\2\2\u0107%\3\2\2\2\u0108\u0109\5\66\34\2\u0109\u010a\7\60\2"+
		"\2\u010a\'\3\2\2\2\u010b\u010d\7\3\2\2\u010c\u010b\3\2\2\2\u010c\u010d"+
		"\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u0113\7\4\2\2\u010f\u0112\5\6\4\2\u0110"+
		"\u0112\7\3\2\2\u0111\u010f\3\2\2\2\u0111\u0110\3\2\2\2\u0112\u0115\3\2"+
		"\2\2\u0113\u0111\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0116\3\2\2\2\u0115"+
		"\u0113\3\2\2\2\u0116\u0117\5*\26\2\u0117\u0118\7\5\2\2\u0118)\3\2\2\2"+
		"\u0119\u011a\7+\2\2\u011a\u011c\5\b\5\2\u011b\u011d\7\3\2\2\u011c\u011b"+
		"\3\2\2\2\u011c\u011d\3\2\2\2\u011d+\3\2\2\2\u011e\u011f\7\60\2\2\u011f"+
		"\u0121\7\6\2\2\u0120\u0122\5.\30\2\u0121\u0120\3\2\2\2\u0121\u0122\3\2"+
		"\2\2\u0122\u0123\3\2\2\2\u0123\u0124\7\7\2\2\u0124-\3\2\2\2\u0125\u012a"+
		"\5\60\31\2\u0126\u0127\7,\2\2\u0127\u0129\5\60\31\2\u0128\u0126\3\2\2"+
		"\2\u0129\u012c\3\2\2\2\u012a\u0128\3\2\2\2\u012a\u012b\3\2\2\2\u012b/"+
		"\3\2\2\2\u012c\u012a\3\2\2\2\u012d\u0133\5\62\32\2\u012e\u0133\5,\27\2"+
		"\u012f\u0133\7\60\2\2\u0130\u0133\5\64\33\2\u0131\u0133\7\f\2\2\u0132"+
		"\u012d\3\2\2\2\u0132\u012e\3\2\2\2\u0132\u012f\3\2\2\2\u0132\u0130\3\2"+
		"\2\2\u0132\u0131\3\2\2\2\u0133\61\3\2\2\2\u0134\u0135\t\2\2\2\u0135\63"+
		"\3\2\2\2\u0136\u0137\t\3\2\2\u0137\65\3\2\2\2\u0138\u0139\t\4\2\2\u0139"+
		"\67\3\2\2\2!;CKRZhjv~\u0080\u009b\u00a8\u00c5\u00c7\u00d1\u00d3\u00d9"+
		"\u00de\u00e0\u00ed\u00f0\u00ff\u0102\u0106\u010c\u0111\u0113\u011c\u0121"+
		"\u012a\u0132";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}