package parser.ast;

import java.util.ArrayList;
import java.util.List;

public class Body extends AST{

	private List<Definition> definitions = new ArrayList<Definition>();
	private Expression expr;
	private State<Integer> stateVar = new State<Integer>();

	@Override
	public String toString() {
		StringBuilder stringB = new StringBuilder();
		for(Definition definition : definitions)
			stringB.append(definition.toString() + ", ");

		if(this.expr == null) {
			stringB.delete(stringB.length()-2, stringB.length());
			return "Body(" + stringB + ")";
		}
		return "Body(" + stringB + expr + ")";
	}

	public Expression getExpression() {
		return expr;
	}

	public List<Definition> getDefinitions() {
		return definitions;
	}

	public int eval() throws ProgramError {
		for(Definition d : definitions) {
			d.eval(stateVar);
		}
		if(this.expr != null)
			return expr.eval(stateVar);
		else
			throw new ProgramError("No expression to evaluate. File is maybe empty.");
	}
}
