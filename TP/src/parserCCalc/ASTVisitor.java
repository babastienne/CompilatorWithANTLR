package parserCCalc;

import AST.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bpotiron on 06/02/2017.
 */
public class ASTVisitor extends CalcBaseVisitor<AST> {

    @Override
    public AST visitProgram(CalcParser.ProgramContext ctx) {
        Body bbody = (Body)visit(ctx.body());
        List<Function> functions = new ArrayList<Function>();
            ctx.function().stream().forEach(function -> functions.add((Function)visit(function)));

        return new Program(functions, bbody);
    }

    @Override
    public AST visitFunction(CalcParser.FunctionContext ctx) {
        Head head = (Head)visit(ctx.head());
        Body body = (Body)visit(ctx.body());

        return new Function(head, body);
    }

    @Override
    public AST visitHead(CalcParser.HeadContext ctx) {
        Functionid function = (Functionid)visit(ctx.functionid());
        List<Variableid> vars = new ArrayList<Variableid>();
            ctx.variableid().stream().forEach(var -> vars.add((Variableid)visit(var)));

        return new Head(function, vars);
    }

    @Override
    public AST visitBody(CalcParser.BodyContext ctx) {
        Expression expr = (Expression)visit(ctx.expression());
        List<Definition> defs = new ArrayList<Definition>();
        ctx.definition().stream().forEach(def -> defs.add((Definition)visit(def)));

        return new Body(defs, expr);
    }

    @Override
    public AST visitDefinition(CalcParser.DefinitionContext ctx) {
        Variableid variableName = (Variableid)visit(ctx.variableid());
        Expression exp = (Expression)visit(ctx.expression());

        return new Definition(variableName, exp);
    }

    @Override
    public AST visitBooleanExpression(CalcParser.BooleanExpressionContext ctx) {
        return new BooleanExpression(Boolean.parseBoolean(ctx.getText()));
    }

    @Override
    public AST visitVariableExpression(CalcParser.VariableExpressionContext ctx) {
        return new VariableExpression((Variableid)visit(ctx.variableid()));
    }

    @Override
    public AST visitBinaryExpression(CalcParser.BinaryExpressionContext ctx) {
        Expression exp1 = (Expression)visit(ctx.expression(0));
        Expression exp2 = (Expression)visit(ctx.expression(1));
        Op operator = Op.parseOP(ctx.getChild(1).getText());

        return new BinaryExpression(operator, exp1, exp2);
    }

    @Override
    public AST visitParenthesisExpression(CalcParser.ParenthesisExpressionContext ctx) {
        return new ParenthesisExpression((Expression)visit(ctx.expression()));
    }

    @Override
    public AST visitLiteralExpression(CalcParser.LiteralExpressionContext ctx) {
        return new LitteralExpression(Integer.parseInt(ctx.getText()));
    }

    @Override
    public AST visitConditionalExpression(CalcParser.ConditionalExpressionContext ctx) {
        Expression exp1 = (Expression)visit(ctx.expression(0));
        Expression exp2 = (Expression)visit(ctx.expression(1));
        Expression exp3 = (Expression)visit(ctx.expression(2));

        return new ConditionalExpression(exp1, exp2, exp3);
    }

    @Override
    public AST visitUnaryExpression(CalcParser.UnaryExpressionContext ctx) {
        Op operator = Op.parseOP(ctx.getChild(0).getText());
        Expression exp = (Expression)visit(ctx.expression());

        return new UnaryMinus(operator, exp);
    }

    @Override
    public AST visitFunctionCallExpression(CalcParser.FunctionCallExpressionContext ctx) {
        Functionid functionName = (Functionid)visit(ctx.functionid());
        List<Expression> parametersFunction = new ArrayList<Expression>();
            ctx.expression().stream().forEach(expression -> parametersFunction.add((Expression)visit(expression)));

        return new FunctionCall(functionName, parametersFunction);
    }

    @Override
    public AST visitVariableid(CalcParser.VariableidContext ctx) {
        return new Variableid(ctx.getText());
    }

    @Override
    public AST visitFunctionid(CalcParser.FunctionidContext ctx) {
        return new Functionid(ctx.getText());
    }
}
