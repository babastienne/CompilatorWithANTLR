package AST;

import error.ProgramError;

import java.util.List;

public class ConditionalExpression extends Expression {
	private Expression expr1, expr2, expr3;
	
	public ConditionalExpression(Expression expr1, Expression expr2, Expression expr3) {
		this.expr1 = expr1;
		this.expr2 = expr2;
		this.expr3 = expr3;
	}
	
	public String toString() {
		return "ConditionalExpression(" + this.expr1 + ", " + this.expr2 + ", " + this.expr3 + ")";
	}

	public String gen(List<Definition> definitions) {
		return this.expr1.gen(definitions) + " ? " + this.expr2.gen(definitions) + " : " + this.expr3.gen(definitions);
	}

	@Override
	public Type getType(List<Definition> definitions) throws ProgramError {
		if(this.expr1.getType(definitions) == this.expr2.getType(definitions) && this.expr2.getType(definitions) == this.expr3.getType(definitions)) {
			return this.expr1.getType(definitions);
		} else {
			throw new ProgramError("Les trois opérande de la structure conditionnelle n'ont pas le même type.");
		}
	}

	public String gen() {
		return null;
	}
}
