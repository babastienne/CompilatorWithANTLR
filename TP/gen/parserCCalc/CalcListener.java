// Generated from D:/e-cosi/perso/Documents/FIL/UV Languages de programmation/structure et execution des langages de programmation/Compilateur/TP/src/parserCCalc\Calc.g4 by ANTLR 4.6
package parserCCalc;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CalcParser}.
 */
public interface CalcListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CalcParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(CalcParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(CalcParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(CalcParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(CalcParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcParser#head}.
	 * @param ctx the parse tree
	 */
	void enterHead(CalcParser.HeadContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#head}.
	 * @param ctx the parse tree
	 */
	void exitHead(CalcParser.HeadContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(CalcParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(CalcParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcParser#definition}.
	 * @param ctx the parse tree
	 */
	void enterDefinition(CalcParser.DefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#definition}.
	 * @param ctx the parse tree
	 */
	void exitDefinition(CalcParser.DefinitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BooleanExpression}
	 * labeled alternative in {@link CalcParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBooleanExpression(CalcParser.BooleanExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BooleanExpression}
	 * labeled alternative in {@link CalcParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBooleanExpression(CalcParser.BooleanExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BinaryExpression}
	 * labeled alternative in {@link CalcParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBinaryExpression(CalcParser.BinaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BinaryExpression}
	 * labeled alternative in {@link CalcParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBinaryExpression(CalcParser.BinaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParenthesisExpression}
	 * labeled alternative in {@link CalcParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParenthesisExpression(CalcParser.ParenthesisExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenthesisExpression}
	 * labeled alternative in {@link CalcParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParenthesisExpression(CalcParser.ParenthesisExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LiteralExpression}
	 * labeled alternative in {@link CalcParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLiteralExpression(CalcParser.LiteralExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LiteralExpression}
	 * labeled alternative in {@link CalcParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLiteralExpression(CalcParser.LiteralExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConditionalExpression}
	 * labeled alternative in {@link CalcParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalExpression(CalcParser.ConditionalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConditionalExpression}
	 * labeled alternative in {@link CalcParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalExpression(CalcParser.ConditionalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VariableExpression}
	 * labeled alternative in {@link CalcParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterVariableExpression(CalcParser.VariableExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariableExpression}
	 * labeled alternative in {@link CalcParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitVariableExpression(CalcParser.VariableExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnaryExpression}
	 * labeled alternative in {@link CalcParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(CalcParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnaryExpression}
	 * labeled alternative in {@link CalcParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(CalcParser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionCallExpression}
	 * labeled alternative in {@link CalcParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallExpression(CalcParser.FunctionCallExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionCallExpression}
	 * labeled alternative in {@link CalcParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallExpression(CalcParser.FunctionCallExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcParser#variableid}.
	 * @param ctx the parse tree
	 */
	void enterVariableid(CalcParser.VariableidContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#variableid}.
	 * @param ctx the parse tree
	 */
	void exitVariableid(CalcParser.VariableidContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcParser#functionid}.
	 * @param ctx the parse tree
	 */
	void enterFunctionid(CalcParser.FunctionidContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#functionid}.
	 * @param ctx the parse tree
	 */
	void exitFunctionid(CalcParser.FunctionidContext ctx);
}