package ConstructorConcept;

public class car2 {
	String name;
	int price;
	String licenseNum;
	double mileage;
	boolean isAvailable;

	public car2(String name, int price) {
		// this.global = local
		this.name = name;
		this.price = price;

		car2.rd(this);
		
	}
	
	public void sendMail() {
		System.out.println("SendMail");
	}
	
	public static void rd(car2 test) {
		System.out.println("readMail");
		test.sendMail();
	}
	

	public static void main(String[] args) {
		car2 c1 = new car2("BMW x1", 50);
	
		//car2.rd(c1); // Call By Reference

	}

}
