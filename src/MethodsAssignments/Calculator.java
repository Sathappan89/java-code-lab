package MethodsAssignments;

public class Calculator {

	private int a;
	private int b;

	public int sum(int a, int b) {
		this.a = a;
		this.b = b;
		int sum = a + b;
		return sum;
	}

	public int sub(int d, int e) {
		int sub = d - e;
		return sub;
	}

	public int mul(int f, int g) {
		int mul = f * g;
		return mul;
	}

	public double div(double s, double h) {
		double div = s / h;
		return div;
	}

	public static void main(String[] args) {

		Calculator c1 = new Calculator();
		int add = c1.sum(10, 10);
		System.out.println(add);

		int c2 = c1.sub(20, 10);
		System.out.println(c2);

		int c3 = c1.mul(10, 10);
		System.out.println(c3);

		double c4 = c1.div(10, 2);
		System.out.println(c4);

	}

}