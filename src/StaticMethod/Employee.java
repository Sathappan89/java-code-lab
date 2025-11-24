package StaticMethod;

public class Employee {

	public void sendMail() {
		System.out.println("send mail");
	}

	public static void readMail() {
		System.out.println("read mail");
	}

	public static void main(String[] args) {

		// 1. How to access non static methods: create the object of the class

		Employee e = new Employee();
		e.sendMail();

		// 2. How to access static methods:

		// a. call it directly
		readMail();

		// b. using the class name: recommeded way
		Employee.readMail();

		// c. can use ref variable:
		e.readMail(); // The static method readMail() from the type employee should be accessed in a
						// static way

		// Read Excel file
		// Write Excel file
		// Common util file - We will use static function

		TestUtil.readFile();

		TestUtil util = new TestUtil();
		util.writeFile();

		// When to use static methods
		// 1. When will really need create some common methods for all the functionality
		// 2. Read - PDF , Excel , csv.file ;

		// Static methods for static
		// Static cannot be used for parallel execution
		
		// All the drive related utlis will be in non static in nature

	}

}