package ExceptionHandling;

public class Browser {
	// amazon: portal application
	public void m1() {
		System.out.println("m1");
		m2();
	}

	// amazon: Order Management System (OMS)
	public void m2() {
		System.out.println("m2");
		try {
			m3(10, 0);
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
	}

	// ----------------------//
	// external system: bank method
	public void m3(int a, int b) {
		System.out.println("m3");
		int i = a / b;
	}

	// user/caller method:
	public static void main(String[] args) {
		Browser b1 = new Browser();
		b1.m1();
		System.out.println("bye!!");
	}
}