package javasessions;

public class SwichCaseConcept {

	public static void main(String[] args) {

		String browser = "Firefox ";

		switch (browser.toLowerCase().trim()) {
		case "chrome":
			System.out.println("launch chrome");
			double version = 1.31;
			if (version == 1.31) {
				System.out.println("1.31 chrome");
			}
			break;
		case "firefox":
			System.out.println("launch firefox");
			break;
		case "edge":
			System.out.println("launch edge");
			break;
		case "safari":
			System.out.println("launch safari");
			break;
		default:
			System.out.println("invalid browser...please pass the right browser name..");
			break;
		}

	}

}