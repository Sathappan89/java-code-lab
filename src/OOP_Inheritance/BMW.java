package OOP_Inheritance;

public class BMW extends Car{

	
	//Method Overriding :
	// When you have a method in parent class and the same method in the child class
	//1. With the same name
	//2. With the same number of parameters
	//3. With the same return type
	
	@Override  //Method Overriding
	public void start() {
		System.out.println("BMW -- start");
	}
	
	public void autoParking() {
		System.out.println("BMW -- auto Parking");
	}
	
	@Override
	public void engine() {
		System.out.println("BMW---engine");
	}

}