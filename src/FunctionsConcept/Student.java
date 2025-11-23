package FunctionsConcept;

public class Student {

	// WAF - AC:
	// getStudentMarks(String studentName)
	// if student is available : return student marks (int)
	// else: return : int : -1

	public int getStudentMarks(String studentName) {
		System.out.println("getting the marks for student : " + studentName);

		int marks = -1;

		switch (studentName.trim().toLowerCase()) {
		case "hari":
			marks = 90;
			break;
		case "dev":
			marks = 30;
			break;
		case "zain":
			marks = 40;
			break;
		case "pooja":
			marks = 60;
			break;
		default:
			System.out.println("student is not found...." + studentName);
			break;
		}

		return marks;

	}

	public int getStudentScore(String studentName) {
		System.out.println("getting the marks for student : " + studentName);

		int marks = -1;

		switch (studentName.trim().toLowerCase()) {
		case "hari":
			return 90;
		case "dev":
			return 30;
		case "zain":
			return 40;
		case "pooja":
			return 60;
		default:
			System.out.println("student is not found...." + studentName);
			return -1;
		}
	}

	/* Return and Break can't be together */

	public static void main(String[] args) {

		Student s1 = new Student();
		int m = s1.getStudentMarks("hari");
		System.out.println(m);

		int tom = s1.getStudentMarks("tom");
		System.out.println(tom);

		if (m >= 0) {
			System.out.println("print the mark sheet");
		}

		int n1 = s1.getStudentScore("hari");
		System.out.println(n1);

	}

}