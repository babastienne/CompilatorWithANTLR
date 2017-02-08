package AST;

import error.GenerationError;
import error.ProgramError;

import java.util.List;

public abstract class Expression extends AST {

	public abstract String gen(List<Definition> definitions) throws GenerationError;

	public abstract Type getType(List<Definition> definitions) throws ProgramError;
}
