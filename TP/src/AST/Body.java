package AST;

import java.util.ArrayList;
import java.util.List;

public class Body extends AST{

	private List<Definition> definitions = new ArrayList<Definition>();
	private Expression expr;

	public Body(List<Definition> definitions, Expression exp) {
		this.definitions = definitions;
		this.expr = exp;
	}

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

	public String gen() {
		StringBuilder generation = new StringBuilder();
		this.definitions.stream().forEach(def -> generation.append(def.gen(definitions)));
		generation.append("return " + this.expr.gen(definitions) + ";\n");

		return generation.toString();
	}

	public String genMain() {
		StringBuilder generation = new StringBuilder("\nint main() {\n");
		this.definitions.stream().forEach(def -> generation.append(def.gen(definitions)));
		generation.append("\nreturn printf(\"%i\\n\", " + this.expr.gen(definitions) + ");\n}\n");

		return generation.toString();
	}
}
