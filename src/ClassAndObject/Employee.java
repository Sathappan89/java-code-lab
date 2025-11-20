package ClassAndObject;

public class Employee {
	
	
	//Data Members = Class Variable
	String name;
	int age;
	String city;
	double salary;
	boolean isPermanent;
	char gender;

	public static void main(String[] args) {
	
		//Class : Category, Blurprint, template for the object
		//Object : physical entity or instance
		
		//class : data members [variable, methods]
		
		//Create the object of the class : using new keyword
		
		
		Employee e = new Employee();
		
		//Employee = Class name
		//e = object reference name
		//new Employee(); -- Object
		
		System.out.println(e.name); //null Default value of string is always null
		

		System.out.println(e.name + " " + e.age + " " + e.salary + " "+ e.isPermanent + " "+e.gender);
		
		e.name="Tom";
		e.age=30;
		e.salary=12.33;
		e.isPermanent=true;
		e.gender='m';
		
		System.out.println(e.name + " " + e.age + " " + e.salary + " "+ e.isPermanent + " "+e.gender);
		
	    
		
		Employee e1 = new Employee();
		System.out.println(e1.name + " " + e1.age + " " + e1.salary + " "+ e1.isPermanent + " "+e1.gender);
		
		//Object without reference name : anti pattern
		new Employee().name = "Ravi";
		new Employee().age = 30;
		new Employee().salary = 23.44;
		
		//Object with null reference
		Employee obj=new Employee();
		obj = null;
		obj.name="Lisa";//NullPointerException:NPE //null.name = "Lisa"
		System.out.println(obj.name);
		
		//gc
		System.gc(); //calling the GC
		

	}

}