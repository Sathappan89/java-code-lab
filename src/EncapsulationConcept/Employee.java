package EncapsulationConcept;

public class Employee {
	/* Hiding the data member of the class */
	private String name;
	private int age;
	private double salary;
	private boolean isActive;

	//constructor is helping as full setter; Give all the values in one and restrict the object
	
	//Getter is helping me to get the latest value of the particular object
	
	//Setter is helping me individual value and update the value
	
	//Some **Private data member are getting accessed by other public data member of the class**
	//(i.e., accessed by public getter, setter and constructor. this is encapsulation.
	//POJO
	public Employee(String name, int age, double salary, boolean isActive) {
		if(name.length()!=0) {
			this.name = name;}
			else {
				System.out.println("name cannot be blank");
			}
		
		if (age > 18) {
			this.age = age;
		} else {
			System.out.println("age should be greater than or equal to 18");
		}
		
		
		this.salary = salary;
		this.isActive = isActive;
	}

	// getter and setter - always public

	public void setName(String name) {
		this.name=name;
	}

	public String getName() {
		return this.name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age=age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

}