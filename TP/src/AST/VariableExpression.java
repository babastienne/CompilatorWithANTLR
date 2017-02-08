package AST;

import error.ProgramError;

import java.util.List;

public class VariableExpression extends Expression {
	private Variableid name;

	public VariableExpression(Variableid value) {
		this.name = value;
	}

	@Override
	public String gen() {
		return null;
	}

	public String gen(List<Definition> definitions) {
		return this.name.gen();
	}

	@Override
	public String toString() {
		return "VariableExpression(" + this.name.toString() + ")";
	}

	@Override
	public Type getType(List<Definition> definitions) throws ProgramError {
		for(Definition def : definitions)
			if(def.getVariableid().toString().equals(this.name.toString()))
				return def.getExpression().getType(definitions);
		return null;
	}
}
