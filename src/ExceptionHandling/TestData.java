package ExceptionHandling;

public class TestData {

	public static void launchBrowser(String browserName) {
		System.out.println("launching browser");
		// chrome//firefox//edge
		switch (browserName.trim().toLowerCase()) {
		case "chrome":
			System.out.println("launch chrome");
			break;
		case "edge":
			System.out.println("launch edge");
			break;
		case "firefox":
			System.out.println("launch firefox");
			break;
		default:
			System.out.println("......wrong browser...");
			// create the object for the browserException class with new Keyword
			throw new BrowserException("INVALID Browser");
		// break; throw and break cannot be together

		}
	}

	public void readExcelData() {
		String data = null;
		if (data == null) {
			throw new TestDataException("data is not available");
		}
	}

	public static void main(String[] args) {
		TestData.launchBrowser("naveen");
		System.out.println("enter the url");
	}

}
