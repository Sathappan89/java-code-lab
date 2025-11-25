package ConstructorConcept;

public class User {
	// instance variable or global variable or object variable
	String name;
	int age;
	double salary;
	String dob;

	// Constructor is used to initialize the instance variables with the local
	// variables using this keyword
	// Constructor is helping to construct the object
	// Constructor is helping to avoid to create unnecessary objects

	public User(String name, int age) { /* 2 param const...local vars */
		System.out.println("user --- 2 param const...");

		// Global = local
		// this.global = local
		// this keyword helping me to access the GLOBAL Variable
		// this keyword referring to current class object
		// this keyword helping to get the current class object value
		this.name = name;
		this.age = age;

	}

	public User(String name, int age, double salary) { /* 3 param const...local vars */
		System.out.println("user --- 2 param const...");

		// Global = local
		// this.global = local

		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	public static void main(String[] args) {

		User u1 = new User("jaya", 30);
		System.out.println(u1.name + " " + u1.age + " " + u1.salary + " " + u1.age);

		User u2 = new User("tom", 40, 34.44);
		System.out.println(u2.name + " " + u2.age + " " + u2.salary + " " + u2.age);

	}

}