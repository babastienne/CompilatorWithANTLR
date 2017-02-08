// Generated from D:/e-cosi/perso/Documents/FIL/UV Languages de programmation/structure et execution des langages de programmation/Compilateur/WORK/src/parser\Calc.g4 by ANTLR 4.6
package parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CalcParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CalcVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CalcParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(CalcParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalcParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(CalcParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalcParser#head}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHead(CalcParser.HeadContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalcParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(CalcParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalcParser#definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinition(CalcParser.DefinitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Literal}
	 * labeled alternative in {@link CalcParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(CalcParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link CalcParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(CalcParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MinusExpression}
	 * labeled alternative in {@link CalcParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinusExpression(CalcParser.MinusExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BinaryExpression}
	 * labeled alternative in {@link CalcParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryExpression(CalcParser.BinaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConditionalExpression}
	 * labeled alternative in {@link CalcParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalExpression(CalcParser.ConditionalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionCall}
	 * labeled alternative in {@link CalcParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(CalcParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalcParser#tail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTail(CalcParser.TailContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalcParser#variableId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableId(CalcParser.VariableIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalcParser#functionId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionId(CalcParser.FunctionIdContext ctx);
}