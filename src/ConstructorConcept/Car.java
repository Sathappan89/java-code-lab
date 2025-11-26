package ConstructorConcept;

public class Car {

	// AC:
	// No Unnecessary car in the system
	// Create the car details with the following combinations :
	// 1. name, price
	// 2. name, licenseNum
	// 3. name, price, licenseNum
	// 4. name, price, licenseNum, isAvailable,mileage

	String name;
	int price;
	String licenseNum;
	double mileage;
	boolean isAvailable;

	public Car(String name, int price) {
		// this.global = local
		this.name = name;
		this.price = price;

		sendMail();// Can we call a function from a constructor ?
		Car.deleteMail(); 
		Car.readMail(this);

	}

	public Car(String name, String licenseNum) {
		this.name = name;
		this.licenseNum = licenseNum;
	}

	public Car(String name, int price, String licenseNum, boolean isAvailable) {
		this.name = name;
		this.price = price;
		this.licenseNum = licenseNum;
		this.isAvailable = isAvailable;
	}

	public Car(String name, int price, String licenseNum, double mileage, boolean isAvailable) {
		this.name = name;
		this.price = price;
		this.licenseNum = licenseNum;
		this.mileage = mileage;
		this.isAvailable = isAvailable;
	}

	public void sendMail() {
		System.out.println("SendMail");
		Car c7 = new Car("testing", 90); // Can we call a Constructor from a function ?
	}

	public static void readMail(Car test) {
		System.out.println("readMail");
		test.sendMail();
	}

	public static void deleteMail() {
		System.out.println("readMail");
	}

	// Caller/User Method
	public static void main(String[] args) {

		Car c1 = new Car("BMW x1", 50);
		Car c2 = new Car("Honda", 20, "6y6y6t5t", true);
		Car c3 = new Car("Hyundai", 30, "po85739", 12.33, false);

		System.out.println(c2.name + " " + c2.price + " " + c2.licenseNum + " " + c2.mileage + " " + c2.isAvailable);

		// update the mileage and isAvailable --PUT /PATCH
		c2.mileage = 12.11;
		c2.isAvailable = true;

		// Retrieve --GET
		System.out.println(c2.name + " " + c2.price + c2.licenseNum + " " + c2.mileage + " " + c2.isAvailable);

		Car.readMail(c2); // Call By Reference

	}

}
