package ExceptionHandling;

public class BrowserException extends RuntimeException {

	// Create public constructor of the particular class
	public BrowserException(String mesg) {
		super(mesg);
		// call the parent class constructor RunTimeException
	}
}