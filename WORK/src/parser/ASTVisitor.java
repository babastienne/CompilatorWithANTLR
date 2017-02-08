package parser;

import parser.ast.*;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by bpotiron on 21/01/2017.
 */
public class ASTVisitor extends CalcBaseVisitor<AST> {

    @Override
    public AST visitVariable(CalcParser.VariableContext ctx) {
        return new Variable(ctx.getText());
    }

    @Override
    public AST visitLiteral(CalcParser.LiteralContext ctx) {
        return new Litteral(Integer.parseInt(ctx.getText()));
    }

    @Override
    public AST visitMinusExpression(CalcParser.MinusExpressionContext ctx) {
        Expression expr1 = (Expression) visit(ctx.expression());
        if(ctx.tail().expression() != null) {
            Expression expr2 = (Expression)visit(ctx.tail().expression());
            return new BinaryExpression(Op.parseOP("-"),expr1, expr2);
        }
        else
            return new UnaryMinus(expr1);
    }

    @Override
    public AST visitBinaryExpression(CalcParser.BinaryExpressionContext ctx) {
        Expression expr1 = (Expression)visit(ctx.expression(0));
        Expression expr2 = (Expression)visit(ctx.expression(1));

        return new BinaryExpression((Op.parseOP(ctx.OP().getText())), expr1, expr2);
    }

    @Override
    public AST visitConditionalExpression(CalcParser.ConditionalExpressionContext ctx) {
        Expression expr1 = (Expression)visit(ctx.expression(0));
        Expression expr2 = (Expression)visit(ctx.expression(1));
        Expression expr3 = (Expression)visit(ctx.expression(2));

        return new ConditionalExpression(expr1, expr2, expr3);
    }

    @Override
    public AST visitFunctionCall(CalcParser.FunctionCallContext ctx) {
        return super.visitFunctionCall(ctx);
    }

    @Override
    public AST visitProgram(CalcParser.ProgramContext ctx) {
        return super.visitProgram(ctx);
    }

    @Override
    public AST visitFunction(CalcParser.FunctionContext ctx) {
        return super.visitFunction(ctx);
    }

    @Override
    public AST visitHead(CalcParser.HeadContext ctx) {
        return super.visitHead(ctx);
    }

    @Override
    public AST visitBody(CalcParser.BodyContext ctx) {
        List<CalcParser.DefinitionContext> definitions = ctx.definition();
        Expression expr = (Expression)visit(ctx.expression());

        ArrayList<Definition> definition = new ArrayList<>();
        for(CalcParser.DefinitionContext def : definitions) {
            definition.add((Definition)visit(def));
        }

//        return new Body();
        return super.visitBody(ctx);
    }

    @Override
    public AST visitDefinition(CalcParser.DefinitionContext ctx) {
        Variable var = (Variable)visit(ctx.variableId());
        Expression expr = (Expression)visit(ctx.expression());

        return new Definition(var, expr);
//        return super.visitDefinition(ctx);
    }

    @Override
    public AST visitTail(CalcParser.TailContext ctx) {
        return super.visitTail(ctx);
    }

    @Override
    public AST visitVariableId(CalcParser.VariableIdContext ctx) {
        return super.visitVariableId(ctx);
    }

    @Override
    public AST visitFunctionId(CalcParser.FunctionIdContext ctx) {
        return super.visitFunctionId(ctx);
    }
}
