package ExceptionHandling;
public class TestDataException extends RuntimeException {

	// Create public constructor of the particular class
	public TestDataException(String mesg) {
		super(mesg);
		// call the parent class constructor RunTimeException
	}
}
