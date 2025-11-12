package javasessions;

public class MaximumNumber {

	public static void main(String[] args) {

		int a = 900;
		int b = 200;
		int c = 1300;
		int d = 400;

		if (a > b && a > c && a > d) {
			System.out.println(a + " is the MaxNumber");
		} else if (b > c && b > d) {
			System.out.println(b + " is the MaxNumber");
		} else if (c > d) {
			System.out.println(c + " is the MaxNumber");
		} else {
			System.out.println(d + " is the MaxNumber");
		}

	}

}