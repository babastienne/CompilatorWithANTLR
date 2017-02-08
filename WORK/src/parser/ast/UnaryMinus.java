package parser.ast;

public class UnaryMinus extends Expression {
	private Expression expr;
	
	public UnaryMinus(Expression expr) {
		this.expr = expr;
	}
	
	public String toString() {
		return "UnaryMinus(-, " + this.expr + ")";
	}

	@Override
	public int eval(State<Integer> stateVar) throws ProgramError {
		return this.expr.eval(stateVar) * -1;
	}
}
