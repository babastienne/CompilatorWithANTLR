package AST;

import error.ProgramError;

import java.util.List;

/**
 * Created by bpotiron on 06/02/2017.
 */
public class FunctionCall extends Expression {
    private Functionid functionName;
    private List<Expression> parametersExpressions;

    public FunctionCall(Functionid functionName, List<Expression> parameters) {
        this.functionName = functionName;
        this.parametersExpressions = parameters;
    }

    @Override
    public String gen() {
        return null;
    }

    public String gen(List<Definition> definitions) {
        StringBuilder generation = new StringBuilder(this.functionName.gen() + "(");
        this.parametersExpressions.stream().forEach(param -> generation.append(param.gen(definitions) + ", "));
        generation.delete(generation.length()-2, generation.length());
        generation.append(")");
        return generation.toString();
    }

    @Override
    public String toString() {
        return "FunctionCall(" + this.functionName + ", " + this.parametersExpressions + ")";
    }

    @Override
    public Type getType(List<Definition> definitions) throws ProgramError {
        return null; //TODO
    }
}
