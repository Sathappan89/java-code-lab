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
		
		
		
		System.out.println("--------------------------------");
		
		int marks = 90;
		
		switch (marks) {
		case 90:
			System.out.println("90");
			break;
		default:
			System.out.println("invalid marks");
			break;
		}
		
		
		System.out.println("--------------------------------");
		
		byte number = 10;
		switch (10) {
		case 10:
			System.out.println("10");
			break;
		default:
				System.out.println("invalid marks");
			break;
		}
		
		System.out.println("--------------------------------");
		
		char alpha = 'a';
		
		switch (alpha) {
		case 'a':
			System.out.println(alpha + " is a vowel");
			break;
		case 'e':
			System.out.println(alpha + " is a vowel");
			break;
		case 'i':
			System.out.println(alpha + " is a vowel");
			break;
		case 'o':
			System.out.println(alpha + " is a vowel");
			break;
		case 'u':
			System.out.println(alpha + " is a vowel");
			break;
		default:
			System.out.println(alpha + " is a consonant");
			break;
		}
		
		System.out.println("--------------------------------");
		
		/*Java is case sensitive*/
		
		char alphatest = 'A';
		
		switch (alphatest) {
		case 'A':
			System.out.println(alpha + " is a vowel");
			break;
		case 'E':
			System.out.println(alpha + " is a vowel");
			break;
		case 'I':
			System.out.println(alpha + " is a vowel");
			break;
		case 'O':
			System.out.println(alpha + " is a vowel");
			break;
		case 'U':
			System.out.println(alpha + " is a vowel");
			break;
		default:
			System.out.println(alpha + " is a consonant");
			break;
		}
		
		
		System.out.println("--------------------------------");
		
		char alphastring = 'A';
		
		switch (String.valueOf(alphastring).toLowerCase()) {
		/*This line converting the character to string so we are maintaining the case in string with ""*/
		case "a":
			System.out.println(alphastring + " is vowel");
			break;

		case "e":
			System.out.println(alphastring + " is vowel");
			break;

		case "i":
			System.out.println(alphastring + " is vowel");
			break;

		case "o":
			System.out.println(alphastring + " is vowel");
			break;

		case "u":
			System.out.println(alphastring + " is vowel");
			break;

		default:
			System.out.println(alphastring + " is consonant");
			break;
		}
		
		System.out.println("--------------------------------");
		
		char top = 'u';
		
		switch (top) {
		case 'a','u','i','o','e':
			System.out.println(top + " is a vowel");
			break;
		default:
			System.out.println(top + " is a consonant");
			break;
		}
		
		
		System.out.println("--------------------------------");
		
		String paymentMode = "CreditCard";
		switch (paymentMode.toLowerCase().trim()) {
		case "CreditCard":
			System.out.println("payment via cc");
			break;
//		case "CreditCard": //Duplicate case not allowed
//			System.out.println("payment via cc");
//			break;
		default:
			System.out.println("payment via cc");
			break;
		}
		
		System.out.println("---------------------------------");
		
		
		/*Boolean not allowed in switch case*/
		
//		boolean flag = true;
//		switch (flag) {
//		case true:
			
//			break;

//		default:
//			break;
//		}
			
//		int price = 90;
//		switch (price == 90) {
//		case value:
//			
//			break;
//
//		default:
//			break;
//		}
		
		
	}

}