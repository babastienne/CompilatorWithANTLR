package AST;

import error.ProgramError;

import java.util.List;

public class Definition extends AST {

	private Variableid name;
	private Expression value;
	
	public Definition(Variableid name , Expression value) {
		this.name = name;
		this.value = value;
	}

	public Expression getExpression() {
	    return this.value;
    }

    public Variableid getVariableid() {
		return this.name;
	}

	@Override
	public String toString() {
		return "Definition(" + this.name + "," + this.value + ")";
	}

	public String gen(List<Definition> definitions) {
		String type = (this.value.getType(definitions) == Type.LITTERAL) ? "int" : "boolean";
		return type + " " + this.name.gen() + " = " + this.value.gen(definitions) + ";\n";
	}

	@Override
	public String gen() {
		return null;
	}
}