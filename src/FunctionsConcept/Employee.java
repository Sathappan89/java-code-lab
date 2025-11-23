package FunctionsConcept;

public class Employee {

	// Duplicate functions are not allowed in the same class

	// poly(many) + morphism(forms) -->Compile time (static) fixed
	// Static Polymorphisum is also called Method Overloading

	// MethodOverloading/FunctionOverloading : When you have multiple method in the
	// same class:
	// (1) With the same name
	// (2) With the different number of parameters and different types of parameters
	// (3) With the different sequence of parameters
	// (4) Return type does not matter
	// (5) Method body (total lines of code) doesn't matters

	public void test() { // O parameters
		System.out.println("test method1");
	}

//	public int test() {
//		System.out.println("test method");
//		return 100;
//	}

	public void test(int a) { // 1 parameters
		System.out.println("test method2");
	}

	public void test(int a, int b) { // 2 parameters
		System.out.println("est method2");
	}

	public void test(int c, String d) { // 2 parameters
		System.out.println("test method3");
	}

	public void test(String c, int d) { // 2 parameters
		System.out.println("test method4");
	}

	// login:

	public void login() {

	}

	public void login(String un, String pwd) {

	}

	public void login(String um, String pwd, int otp) {

	}

	public void login(String um, String pwd, int otp, String reCaptcha) {

	}

	// search

	public void search() {

	}

	public void search(String productName, int price) {

	}

	public void search(String productName, int price, String color) {

	}

	// payment:

	public void doPayment(String upi) {

	}

	public void doPayment(String cc, int cvv) {

	}

	public void doPayment(String cc, int cvv, int discount) {

	}

	public void doPayment(String um, String pwd, int otp) {

	}

	// uber : booking feature:

	public void booking(String carType, String stPoint, String endPoint) {

	}

	public void booking(String stPoint, String endPoint) {

	}

	public void booking(String carType, String stPoint, String endPoint, String bookingType) {

	}

	// selenium link

	public void click(String element) {

	}

	public void click(String element, int x, int y) { // corner of the screen x & y

	}

	// Interview Questions

	public void yum(byte a) {
		System.out.println("Hi Byte");
	}

	public void yum(short a) {
		System.out.println("Hi short");
	}

	public void yum(int a) {
		System.out.println("Bye int");
	}

	public void yum(long a) {
		System.out.println("good bye long");
	}

	public static void main(String[] args) {

		Employee e1 = new Employee();
		e1.test(10);
		e1.test(100, "naveen"); // Compiler is taking a call to select the respective method so it is called
								// compile time polymorphisum

		e1.yum(10);
		e1.yum((short) 10);
		e1.yum(10L);
		e1.yum((short) 10);

	}

}
