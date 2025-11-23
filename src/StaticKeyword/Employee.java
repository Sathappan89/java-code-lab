package StaticKeyword;

public class Employee {

	// instance vars:
	String name;
	int empID;
	double salary;
	String deptName;

	// class /static var
	static String compName = "NaveenAutomationLabs";

	public static void main(String[] args) {

		int i = 10;
		System.out.println();

		Employee e1 = new Employee();
		Employee e2 = new Employee();
		Employee e3 = new Employee();
		Employee e4 = new Employee();

		System.out.println(e1.name); // null
		System.out.println(e2.name); // null
		System.out.println(e3.name); // null

		System.out.println(Employee.compName);

		final String compName = "IBM";
		System.out.println(compName);

		System.out.println(e1.compName);
		System.out.println(Employee.compName);

	}

}