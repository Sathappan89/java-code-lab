package MethodCalling;

public class Customer {

	static Customer obj;

	public void m1() {
		System.out.println("m1 method");
		Customer.t1();
	}

	public static void t1() { // class parameter
		System.out.println("t1 method");
		obj.m1();
	}

	public static void main(String[] args) {

		obj = new Customer();
		obj.m1();

		Customer.t1(); // obj - reference
						// call by reference

	}

}