package ClassAndObject;

public class User2 {
	// Template variable or class variable
	// Template variables for only for template
	String name;
	int age;
	String city;

	public static void main(String[] args) {

		int i = 10; // local var --> stack

		User u1 = new User();
		u1.name = "Divya";
		u1.age = 30;
		u1.city = "Pune";

		User u2 = new User();
		u2.name = "vishal";
		u2.age = 35;
		u2.city = "Bangalore";

		User u3 = new User();
		u3.name = "Jaya";
		u3.age = 35;
		u3.city = "NY";
		

		User u4 = new User();
		u4.name = "Tesing";
		u4.age = 35;
		u4.city = "Arizona";

		System.out.println(u1.name + " " + u1.age + " " + u1.city); // D
		System.out.println(u2.name + " " + u2.age + " " + u2.city); // V
		System.out.println(u3.name + " " + u3.age + " " + u3.city); // J
		System.out.println(u4.name + " " + u4.age + " " + u4.city); // T

		System.out.println("------------------------------------------------");
		u1 = u2;

		System.out.println(u1.name + " " + u1.age + " " + u1.city); // V
		System.out.println(u2.name + " " + u2.age + " " + u2.city); // V
		System.out.println(u3.name + " " + u3.age + " " + u3.city); // J
		System.out.println(u4.name + " " + u4.age + " " + u4.city); // T

		System.out.println("------------------------------------------------");
		u2 = u3;

		System.out.println(u1.name + " " + u1.age + " " + u1.city); // V
		System.out.println(u2.name + " " + u2.age + " " + u2.city); // J
		System.out.println(u3.name + " " + u3.age + " " + u3.city); // J
		System.out.println(u4.name + " " + u4.age + " " + u4.city); // T

		System.out.println("------------------------------------------------");
		u3 = u4;

		System.out.println(u1.name + " " + u1.age + " " + u1.city); // V
		System.out.println(u2.name + " " + u2.age + " " + u2.city); // J
		System.out.println(u3.name + " " + u3.age + " " + u3.city); // T
		System.out.println(u4.name + " " + u4.age + " " + u4.city); // T
		
		System.out.println("------------------------------------------------");
		u4=u1;
		
		System.out.println(u1.name + " " + u1.age + " " + u1.city); // V
		System.out.println(u2.name + " " + u2.age + " " + u2.city); // J
		System.out.println(u3.name + " " + u3.age + " " + u3.city); // V
		System.out.println(u4.name + " " + u4.age + " " + u4.city); // V
	}

}
