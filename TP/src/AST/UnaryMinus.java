package AST;

import error.GenerationError;
import error.ProgramError;

import java.util.List;

public class UnaryMinus extends Expression {
	private Expression expr;
	private Op op;
	
	public UnaryMinus(Op op, Expression expr) {
		this.expr = expr;
		this.op = op;
	}

	@Override
	public String toString() {
		return "UnaryMinus(" + this.op.toString()  + ", " + this.expr + ")";
	}

	@Override
	public String gen() {
		return null;
	}

	public String gen(List<Definition> definitions) {
	    if(this.expr.getType(definitions) == Type.BOOLEAN && this.op.equals(Op.EX))
			return "!(" + expr.gen(definitions) + ")";
        else if(this.expr.getType(definitions) == Type.LITTERAL && this.op.equals(Op.MINUS))
			return "-(" + expr.gen(definitions) + ")";
        else
			throw new GenerationError("Cas d'opération unaire non reconnu");
	}

	@Override
	public Type getType(List<Definition> definitions) throws ProgramError {
		return this.expr.getType(definitions);
	}
}
