package parser.ast;

@SuppressWarnings("serial")
public class SynctaticError extends Exception {
	public SynctaticError(String description){
		super("Syntatic Error : " + description);
	}
	
	public SynctaticError(){
		super("Syntatic Error : ");
	}

}
