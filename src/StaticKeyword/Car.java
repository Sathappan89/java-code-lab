package StaticKeyword;

public class Car {

	// Instance Variable // Class Variable //object variables :

	String name;
	int price;
	String licenseNumber;

	// 2. Static Variable/Class Variable: will never be part of the object
	// JVM will create only one common copy for the static variables
	// CMA : Common Memory Allocation/ Permanent Generation - Meta space
	static final int wheels = 4;

	public static void main(String[] args) {

		final int days = 7; // local var
		int salary = days * 100;
		System.out.println(salary);

		final String color;
		// local vars : static is not allowed, but final is allowed

		Car c1 = new Car(); // Create a object of the class

		// System.out.println(c1); //StaticKeyword.Car@5e9f23b4 - Printing the reference

		c1.name = "BMW";
		c1.price = 50;
		c1.licenseNumber = "US12334";

		// How to access static variables:
		// 1.use it directly:
		System.out.println(wheels);

		// 2. using it by class name : Recommended way to access the Static Variable
		System.out.println(Car.wheels);

		// How to access non static(object variables): using by object reference name:
		System.out.println(c1.name);
		System.out.println(c1.name + " " + c1.price + " " + c1.licenseNumber + " " + Car.wheels);

		// 3. can I access static variables using the object reference name > Yes
		// Warning : The static field Car.wheels should be accessed in a static way
		System.out.println(c1.wheels);

		Car c2 = new Car();

		c2.name = "AUDI";
		c2.price = 60;
		c2.licenseNumber = "IND390823";
		System.out.println(c2.name + " " + c2.price + " " + c2.licenseNumber + " " + Car.wheels);

		Car c3 = new Car();

		c3.name = "HONDA";
		c3.price = 25;
		c3.licenseNumber = "HONDA21212";
		System.out.println(c3.name + " " + c3.price + " " + c3.licenseNumber + " " + Car.wheels);

	}

}
