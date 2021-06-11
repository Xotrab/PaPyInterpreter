// Generated from src\main\java\antlr\PaPy.g4 by ANTLR 4.9.2
 package antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PaPyParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PaPyVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PaPyParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(PaPyParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link PaPyParser#section}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSection(PaPyParser.SectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PaPyParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(PaPyParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PaPyParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(PaPyParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code division}
	 * labeled alternative in {@link PaPyParser#arithmeticExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivision(PaPyParser.DivisionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arithmeticParentheses}
	 * labeled alternative in {@link PaPyParser#arithmeticExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticParentheses(PaPyParser.ArithmeticParenthesesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code airthmeticValue}
	 * labeled alternative in {@link PaPyParser#arithmeticExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAirthmeticValue(PaPyParser.AirthmeticValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code subtraction}
	 * labeled alternative in {@link PaPyParser#arithmeticExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubtraction(PaPyParser.SubtractionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multiplication}
	 * labeled alternative in {@link PaPyParser#arithmeticExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplication(PaPyParser.MultiplicationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addition}
	 * labeled alternative in {@link PaPyParser#arithmeticExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddition(PaPyParser.AdditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logicalNot}
	 * labeled alternative in {@link PaPyParser#logicalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalNot(PaPyParser.LogicalNotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logicalParentheses}
	 * labeled alternative in {@link PaPyParser#logicalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalParentheses(PaPyParser.LogicalParenthesesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logicalValue}
	 * labeled alternative in {@link PaPyParser#logicalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalValue(PaPyParser.LogicalValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logicalComparison}
	 * labeled alternative in {@link PaPyParser#logicalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalComparison(PaPyParser.LogicalComparisonContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logicalAnd}
	 * labeled alternative in {@link PaPyParser#logicalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalAnd(PaPyParser.LogicalAndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logicalOr}
	 * labeled alternative in {@link PaPyParser#logicalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalOr(PaPyParser.LogicalOrContext ctx);
	/**
	 * Visit a parse tree produced by {@link PaPyParser#comparisonExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonExpression(PaPyParser.ComparisonExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PaPyParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(PaPyParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PaPyParser#variableReassignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableReassignment(PaPyParser.VariableReassignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link PaPyParser#loopStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopStatement(PaPyParser.LoopStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PaPyParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(PaPyParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PaPyParser#range}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRange(PaPyParser.RangeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PaPyParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(PaPyParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PaPyParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(PaPyParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PaPyParser#elifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElifStatement(PaPyParser.ElifStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PaPyParser#elseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseStatement(PaPyParser.ElseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PaPyParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(PaPyParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link PaPyParser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclaration(PaPyParser.FunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PaPyParser#functionDeclarationArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclarationArgument(PaPyParser.FunctionDeclarationArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link PaPyParser#returnBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnBlock(PaPyParser.ReturnBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link PaPyParser#returnExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnExpression(PaPyParser.ReturnExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PaPyParser#funcCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncCall(PaPyParser.FuncCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link PaPyParser#argList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgList(PaPyParser.ArgListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PaPyParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(PaPyParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link PaPyParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(PaPyParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link PaPyParser#booleanValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanValue(PaPyParser.BooleanValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link PaPyParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(PaPyParser.TypeContext ctx);
}