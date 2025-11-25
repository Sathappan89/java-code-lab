package ConstructorConcept;

public class Employee {

	String name;
	int age;
	double salary;
	String dob;
	
	//Constructor
	// Name : classname
	// Const... Is having the same name as the class name
	// Const... Will be called when you create the object
	// Const... is not a function
	// Const... can not return anything, can not void also, there is no return type
	// Const... can be overloaded
	
	/*Constructor is an entity , Also called an data member of the class*/
	
	/*Data Member of the class which is helping us to create the object and initialize the class variabl*/
	
	public Employee() { //O param const... Default Constructor
		System.out.println("Default 0 param const...");
	}
	
	
	public Employee(int i) {
		System.out.println("1 param const..." + i);
	}

	public Employee(String p,int i) {
		System.out.println("2 param const..." + i);
	}
	
	public Employee(int i,String p) {
		System.out.println("2 param const..." + i);
	}
	
	
	public static void main(String[] args) {
		
		Employee e1=new Employee(10);
		Employee e2=new Employee();

	}

}
