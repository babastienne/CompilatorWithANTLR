package AST;

import java.util.List;

/**
 * Created by bpotiron on 06/02/2017.
 */
public class Program extends AST {
    private List<Function> functions;
    private Body body;

    public Program(List<Function> functions, Body body) {
        this.functions = functions;
        this.body = body;
    }

    @Override
    public String gen() {
        StringBuilder generation = new StringBuilder();
        generation.append("#include <stdio.h> \n#include <stdlib.h> \n#include <stdbool.h> \n \n");
        functions.stream().forEach(function -> generation.append(function.gen()));
        generation.append(body.genMain());

        return generation.toString();
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("Program(");
        functions.stream().forEach(function -> result.append("Function(" + function.toString() + ", "));
        result.append(body.toString() + ")");
        return result.toString();
    }
}
