package error;

public class ProgramError extends RuntimeException {
	public ProgramError(String msg) {
		super("Error during the execution of the program : " + msg);
	}
}
