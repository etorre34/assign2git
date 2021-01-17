package src.com.csc205.demos.module2;

public class CustomException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	CustomException () {
		super();
	}
	
	public CustomException(String message) {
		super(message);
	}
	
	public CustomException(String message, Throwable t) {
		super (message, t);
	}
	
	public CustomException(Throwable t) {
		super(t);
	}

}
