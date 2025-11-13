package javasessions;

public class NestedLoops {

	public static void main(String[] args) {

		// 00 01 02 03 04 05
		// 10 11 12 13 14 15
		// 20 21 22 23 24 25

		// 50 51 52 53 54 55

		// 6*6

		for (int i = 0; i <= 5; i++) {
			for (int j = 0; j <= 5; j++) {
				System.out.print(String.valueOf(i) + String.valueOf(j) + " ");
			}
			System.out.println(" ");
		}

		System.out.println("----------------------------------");

		// 000 001 002 003 004 005
		// 100 102 103 104 105 105

		for (int n = 0; n <= 9; n++) {
			for (int m = 0; m <= 9; m++) {
				for (int k = 0; k <= 9; k++) {
					System.out.print(String.valueOf(n) + String.valueOf(m) + String.valueOf(k) + " ");
				}
				System.out.println(" ");

			}
		}

	}

}