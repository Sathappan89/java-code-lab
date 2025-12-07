package ExceptionHandling;

public class Student {

	public static int getMarks(String studentName) {
		System.out.println("getting marks for : " + studentName);

		if (studentName.equals("divya")) {

			try {
				int i = 9 / 3;
				return 90;
			} catch (ArithmeticException e) {
				return 80;
				// immediate return
			} finally {
				System.out.println("hi");
				return 65;
			}

		} else if (studentName.equals("priti")) {
			return 100;
		} else if (studentName.equals("priti")) {
			return 95;
		} else {
			System.out.println("no student....");
			return -1;
		}

	}

	public static void main(String[] args) {

		int m = Student.getMarks("divya");
		System.out.println(m);
	}

}