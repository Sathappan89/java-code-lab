package EncapsulationConcept;

public class EmpTest {

	public static void main(String[] args) {

		
		//Create ---POST CALL
		Employee e1 = new Employee("zain", 10, 34.33, true);

		//READ --- GET
		System.out.println(e1.getName());
		System.out.println(e1.getAge());
		System.out.println(e1.getSalary());
		
		Employee e2 = new Employee("zain", 45, 34.33, true);
		
		System.out.println(" ");
		System.out.println("----UPADATE----");
		//UPDATE -- PUT {Setter is helping me individual value and update the value
		e1.setAge(30);
		e1.setSalary(45.44);
		
		//Read -- GET
		System.out.println(e1.getName());
		System.out.println(e1.getName());
		System.out.println(e1.getSalary());
		
	}

}