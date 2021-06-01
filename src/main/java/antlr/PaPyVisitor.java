package antlr;// Generated from PaPy.g4 by ANTLR 4.9.2
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
	 * Visit a parse tree produced by {@link PaPyParser#arithmeticExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticExpression(PaPyParser.ArithmeticExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PaPyParser#logicalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalExpression(PaPyParser.LogicalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PaPyParser#logicalAnd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalAnd(PaPyParser.LogicalAndContext ctx);
	/**
	 * Visit a parse tree produced by {@link PaPyParser#logicalTerm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalTerm(PaPyParser.LogicalTermContext ctx);
	/**
	 * Visit a parse tree produced by {@link PaPyParser#logicalResult}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalResult(PaPyParser.LogicalResultContext ctx);
	/**
	 * Visit a parse tree produced by {@link PaPyParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(PaPyParser.VariableDeclarationContext ctx);
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
	 * Visit a parse tree produced by {@link PaPyParser#functionBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionBlock(PaPyParser.FunctionBlockContext ctx);
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
	 * Visit a parse tree produced by {@link PaPyParser#logicalValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalValue(PaPyParser.LogicalValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link PaPyParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(PaPyParser.TypeContext ctx);
}