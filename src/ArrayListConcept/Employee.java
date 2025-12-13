package ArrayListConcept;

public class Employee {

	String name;
	int age;

	public static void main(String[] args) {
		Employee e = new Employee();
		e.name = "tom";
		e.age = 20;
		System.out.println(e); //ArrayListConcept.Employee@5e9f23b4
		
		

	}

	//Object : Employee is the child of object
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + "]";
	}

}
