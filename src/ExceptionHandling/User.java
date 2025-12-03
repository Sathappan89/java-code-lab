package ExceptionHandling;

public class User {

	public static void div(int a, int b) {
		System.out.println("div method");
		int d = 0;
		try {
			d = a / b;
		} catch (ArithmeticException e) {
			//reporting/logging/screenshot/fail/validating message
			//e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println("Please pass the right value of b ..coz b is zero ..so getting AE");
		}
		System.out.println("div done: " + d);
	}

	public static void main(String[] args) {

		div(10, 0);
		System.out.println("bye!!");
	}

}