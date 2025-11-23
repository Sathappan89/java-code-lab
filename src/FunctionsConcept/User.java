package FunctionsConcept;

public class User {

	// function/method--non static -- data member of the class

	// function will have its own body in the class
	// I cannot create a function inside another function (very important question)

	// but I can call the function from another function
	// function will always return a single value not the multiple values
	
	
	// 1. no input and no return
	// void -- no return: can not return anything
	public void test() { // function name should start with small letter
		System.out.println("test method");
	}

	public void click() {
		System.out.println("click on button");
		// return;
	}

	// 2. no input but some return:
	// return type : int
	public int add() {
		System.out.println("add method");
		int a = 100;
		int b = 200;
		int c = a + b;
		return c;
	}

	// return type : String

	public String getTraineName() {
		String name = "Naveen";
		return name;
	}

	// 3. some input and some return
	// Return type : int
	// params : 2
	// int a & int b - local variable
	// Reusable function
	public int sum(int a, int b) { // a, b - parameters
		System.out.println("sum method");
		int z = a + b;
		return z;
	}

	// 3 Parameters in the function
	// using only 2 parameters (bad way of creating the function)
	public double getFinalBillingAmount(double foodBill, double drinksBill, double tax) {
		System.out.println("calculating the final bill");
		double finalBill = foodBill + drinksBill;
		return finalBill;
	}

	public boolean isUserActive(String userName) {
		System.out.println("checking user" + userName + "is active");
		
		if(userName.equals("admin")) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
	public static void main(String[] args) {

		// How to call non static methpd: create the object of the class

		User u1 = new User();

		u1.test();

		int s1 = u1.add();
		System.out.println(s1);

		String n1 = u1.getTraineName();
		System.out.println(n1);

		if (n1.equals("Naveen")) {
			System.out.println("then only i'll join");
		} else {
			System.out.println("I won't join the training");
		}

		// 10,20 - Values or arguments
		// calling function by passing two arguments/value :call by parameters
		// call by value
		int t1 = u1.sum(10, 20);
		System.out.println(t1);

		int t2 = u1.sum(10, 10);
		System.out.println(t2);

		u1.click();

		double test = u1.getFinalBillingAmount(20.0, 30.0, 3.2);
		System.out.println(test);
		
//		u1.getFinalBillingAmount(100.0, 20.0);
		
		
		if (u1.isUserActive("naveen")) {
			System.out.println("login to app");
		} else {
			System.out.println("not able to find that user.....");
		}

	}

}
