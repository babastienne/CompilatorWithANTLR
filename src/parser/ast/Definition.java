package parser.ast;

public class Definition extends AST {

	private Variable name;
	private Expression value;
	
	public Definition(Variable name , Expression value) {
		this.name = name;
		this.value = value;
	}

	@Override
	public String toString() {
		return "Definition(" + this.name + "," + this.value + ")";
	}

	public int eval(State<Integer> stateVar) throws ProgramError {
		if (!stateVar.containsKey(this.name.getName()))
			stateVar.bind(this.name.getName(), this.value.eval(stateVar));
		else
			throw new ProgramError("Variable already exist in the state");
		return this.value.eval(stateVar);
	}
}