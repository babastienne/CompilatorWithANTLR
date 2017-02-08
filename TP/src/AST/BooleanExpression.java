package AST;

import error.ProgramError;

import java.util.List;

/**
 * Created by bpotiron on 06/02/2017.
 */
public class BooleanExpression extends Expression{

    private Boolean value;

    public BooleanExpression(Boolean value) {
        this.value = value;
    }

    public Boolean getValue() {
        return this.value;
    }

    @Override
    public String gen(List<Definition> definitions) {
        return Boolean.toString(this.value);
    }

    @Override
    public String toString() {
        return "BooleanExpression(" + this.value + ")";
    }

    @Override
    public Type getType(List<Definition> definitions) throws ProgramError {
        return Type.BOOLEAN;
    }

    @Override
    public String gen() {
        return null;
    }
}
