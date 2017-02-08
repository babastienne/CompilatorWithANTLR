package parser.ast;

public abstract class Expression extends AST {

	public abstract int eval(State<Integer> stateVar) throws ProgramError;

}
