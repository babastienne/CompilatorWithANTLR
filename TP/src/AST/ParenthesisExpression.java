package AST;

import error.ProgramError;

import java.util.List;

/**
 * Created by bpotiron on 06/02/2017.
 */
public class ParenthesisExpression extends Expression {

    private Expression expression;

    public ParenthesisExpression(Expression expression) {
        this.expression = expression;
    }

    @Override
    public String gen() {
        return null;
    }

    public String gen(List<Definition> definitions) {
        return "(" + this.expression.gen(definitions) + ")";
    }

    @Override
    public String toString() {
        return "(" + this.expression.toString() + ")";
    }

    @Override
    public Type getType(List<Definition> definitions) throws ProgramError {
        return this.expression.getType(definitions);
    }
}
