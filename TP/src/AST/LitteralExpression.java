package AST;

import error.ProgramError;

import java.util.List;

public class LitteralExpression extends Expression {
	int value;

	public LitteralExpression(int value) {
		this.value = value;
	}

	public String toString() {
		return "LitteralExpression(" + this.value + ")";
	}

	public String gen(List<Definition> definitions) {
        return String.valueOf(value);
    }

	@Override
	public Type getType(List<Definition> definitions) throws ProgramError {
		return Type.LITTERAL;
	}

	@Override
	public String gen() {
		return null;
	}
}
