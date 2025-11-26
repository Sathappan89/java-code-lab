package MethodsAssignments;

/* Define two methods to print the maximum and the minimum number respectively among three
numbers*/
public class MaxandMin {

	public static void MaxMin(int a, int b, int c) {

		if (a > b && a > c) {
			System.out.println("Maxmium number is " + a);
		} else if (b > c) {
			System.out.println("Maxmium number is " + b);
		} else {
			System.out.println("Maxmium number is " + c);
		}

		if (a < b && a < c) {
			System.out.println("Minimum number is " + a);
		} else if (b < c) {
			System.out.println("Minimum number is " + b);
		} else {
			System.out.println("Minimum number is " + c);
		}

	}

	public static void main(String[] args) {
		MaxandMin.MaxMin(89, 98, 100);

	}

}
