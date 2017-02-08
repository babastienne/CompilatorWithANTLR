// Generated from D:/e-cosi/perso/Documents/FIL/UV Languages de programmation/structure et execution des langages de programmation/Compilateur/TP/src/parser\Calc.g4 by ANTLR 4.6
package parserCCalc;
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
	 * Visit a parse tree produced by the {@code BooleanExpression}
	 * labeled alternative in {@link CalcParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanExpression(CalcParser.BooleanExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BinaryExpression}
	 * labeled alternative in {@link CalcParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryExpression(CalcParser.BinaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParenthesisExpression}
	 * labeled alternative in {@link CalcParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesisExpression(CalcParser.ParenthesisExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LiteralExpression}
	 * labeled alternative in {@link CalcParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralExpression(CalcParser.LiteralExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConditionalExpression}
	 * labeled alternative in {@link CalcParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalExpression(CalcParser.ConditionalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VariableExpression}
	 * labeled alternative in {@link CalcParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableExpression(CalcParser.VariableExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnaryExpression}
	 * labeled alternative in {@link CalcParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression(CalcParser.UnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionCallExpression}
	 * labeled alternative in {@link CalcParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallExpression(CalcParser.FunctionCallExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalcParser#variableid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableid(CalcParser.VariableidContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalcParser#functionid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionid(CalcParser.FunctionidContext ctx);
}