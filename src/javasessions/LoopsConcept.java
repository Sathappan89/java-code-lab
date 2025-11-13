package javasessions;

public class LoopsConcept {

	public static void main(String[] args) {

		// 1. while loop:
		// 1 to 10;
		int i = 1;
		while (i <= 10) {
			System.out.println(i);
			i++;
			// i++;
		}
		System.out.println("-----------Even Number in While Loop-----------------");

		int j = 1;
		while (j <= 10) {
			j++;
			System.out.println(j);
			j++;

			// i++;
		}

		System.out.println("-----------------------------------------------------");

		while (true) {
			System.out.println("hi");
			break; //
		}

		System.out.println("---------------------Unreachable code----------------");
//		
//		while(false) {
//			System.out.println("hi");
//			break; //
//		}

		System.out.println("-----------------------------------------------------");

		int p = 1;
		while (p <= 10) {
			System.out.println(p);
			if (p == 5) {
				System.out.println(p + " Hello Selenium");
				break; // Break can be written inside the loop and Break will come out the loop
						// immediately
			}
			p++;
		}

		System.out.println("-----------------------------------------------------");

		int t = 1;
		while (t <= 10) {
			if (t % 2 == 0) {
				System.out.println(t + " is an even number");
			} else {
				System.out.println(t + " is a old number");
			}
			t++;
		}

		System.out.println("----------------------**FOR LOOP**-------------------------------");

		for (int k = 1; k <= 10; k++) {
			System.out.println(k);
		}

		// or
		int g = 1;
		for (; g <= 10;) {
			System.out.println(g);
			g++;
		}

		System.out.println("-----------------------------------------------------");

		for (;;) {
			System.out.println("Bye !!");
			break;
		}

		System.out.println("-----------------------------------------------------");

		for (int n = 10; n >= 1; n--) {
			if (n % 2 == 0) {
				System.out.println(n);
			}
		}

		System.out.println("-----------------------------------------------------");

		for (int s = 1; s <= 10; s++) {
			System.out.println(s);
			if (s % 5 == 0) {
				System.out.println("Hello Selenium");
				break;
			}
		}

		System.out.println("-------------------------Byte loop----------------------------");

		for (byte b1 = 1; b1 <= 5; b1++) {
			System.out.println(b1);
		}

		/* Write the ascii value of a to z using loop concept */

		for (char ch = 'a'; ch <= 'z'; ch++) {
			System.out.println(ch + " ascii value =  " + (int) ch);
		}

		System.out.println("-----------------------Double loop------------------------------");

		for (double d = 1.0; d <= 5.0; d++) {
			System.out.println(d);
		}

		// use cases : While loop

		/*
		 * 1. When number of iterations are not fixed Example Waiting for the element on
		 * the page:0,5,10,15,20,25 Waiting for the page loading : 0,5,10,15,20 Calendar
		 * Handling WebTable Pagination Handling Linkedin/FB/Insta : Infinite scrolling
		 * food delivery carousel
		 * 
		 */

		// use cases : For Loop

		/*
		 * 1. When number of iteration are fixed Dropdown : Month : 1 to 12 Footer links
		 * Table columns Array, ArrayList :- (fixed size data) Reading Excel Retry Logic
		 * : Count = 3 Dropdown = Country 1 to 233
		 */

		System.out.println("-----------------------Do While loop------------------------------");

		// do-while loop
		// 1 to 10:

		int n = 1;
		do {
			System.out.print(n + " ");
			n++;
		} while (n <= 10);

		System.out.println("------------------------------------------------------------------");

		// use cases : Do While Loop

		/*
		 * Wait for webelement : Element in on the page //do{ // click on element ///}
		 * while(!element is displayed)
		 */

	}

}
