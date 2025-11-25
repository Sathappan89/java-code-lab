package MethodCalling;

public class Customer {

	//static Customer obj;

	public void m1() {
		System.out.println("m1 method");
	}

	public static void t1(Customer ob) { // class parameter
		System.out.println("t1 method");
		ob.m1();
	}

	public static void main(String[] args) {

		Customer obj = new Customer();
		Customer.t1(obj); // obj - reference
						// call by reference

	}

}