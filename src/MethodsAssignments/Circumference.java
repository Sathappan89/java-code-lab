package MethodsAssignments;

public class Circumference {

	public static double calculateCircumference(double radius) {
		return 2 * Math.PI * radius;
	}

	public static double calculateArea(double radius) {
		return Math.PI * radius * radius;
	}

	public static void main(String[] args) {

		double a = Circumference.calculateCircumference(10.3);
		double b = Circumference.calculateArea(10.9);
		System.out.println(a);
		System.out.println(b);
	}

}
