package javasessions;

public class IFElseConcept {

	// == comparison operator to compare two primitive data type
	// = assignment operator

	public static void main(String[] args) {

		int a = 10;
		int b = 10;

		if (a == b) {
			System.out.println("pass");
		} else {
			System.out.println("fail");
		}

		/* Dead Code */
		/* this is not good practices */
//		if(true) {
//			System.out.println("hi");
//		}
//		else {
//			System.out.println("bye");
//		}

		boolean flag = true;
		if (flag) {
			System.out.println("hello");
		} else {
			System.out.println("bye");
		}

		System.out.println("----------");
		// if--if--if else: nested if else
		int number = 0;

		if (number <= 100) {
			if (number >= 95) {
				System.out.println("Grade A");
				if (number == 100) {
					System.out.println("Grade A++");
					System.out.println("eligible for MBA");
				}
			} else {
				if (number >= 75) {
					System.out.println("Grade B");
				}
			}
		} else {
			System.out.println("....invalid marks....");
		}

		System.out.println("----------");

//		String browser = "chrome";

//		if (browser.equals("chrome")) { // T
//			System.out.println("lanuch chrome");
//		}
//		if (browser.equals("firefox")) {// F
//			System.out.println("lanuch firefox");
//		}
//		if (browser.equals("edge")) {// F
//			System.out.println("lanuch edge");
//		}
//		if (browser.equals("safari")) {// F
//			System.out.println("lanuch safari");
//		} else {
//			System.out.println("invalid browser.. pls pass the right browser name");
//		}

//		 OUTPUT :
		/*
		 * lanuch chrome invalid browser.. pls pass the right browser name
		 */
		
		
		String browser = "safari";
		
		if(browser.equals("chrome")) { //F
			System.out.println("launch chrome");
		}
		else if(browser.equals("firefox")) {//F
			System.out.println("launch edge");
		}
		else if(browser.equals("edge")) {//F
			System.out.println("launch safari");
		}
		else if(browser.equals("safari")) {//T
			System.out.println("launch safari");
		}
		else {
			System.out.println("invalid browser.. please pass the right browser name..");
		}
		
	}
}