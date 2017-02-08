package AST;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by bpotiron on 06/02/2017.
 */
public class Head extends AST {
    private Functionid functionName;
    private List<Variableid> variableids;

    public Head(Functionid functionName, List<Variableid> variableids) {
        this.functionName = functionName;
        this.variableids = variableids;
    }

    @Override
    public String gen() {
        StringBuilder generation = new StringBuilder();
        generation.append(this.functionName.gen() + "(");
        this.variableids.stream().forEach(var -> generation.append(var.gen() + ", "));
        generation.delete(generation.length()-2, generation.length());
        generation.append(")");
        return generation.toString();
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("Head(");
        result.append(functionName.toString() + "(");
        variableids.stream().forEach(variable -> result.append(variable.toString() + ", "));
        result.delete(result.length()-2, result.length());
        result.append("))");

        return result.toString();
    }
}
