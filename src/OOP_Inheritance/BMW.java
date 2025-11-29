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
	//Method Hiding : static method in parent class and the same in child class
	public static void billing() {
		System.out.println("BMW --- Billing");
	}
	@Override
	public void engine() {
		System.out.println("BMW---engine");
		Truck tr=new Truck();
		tr.transport(); //Composition : HAS-A Relationship
	}
	private void ratingMethod() {
		System.out.println("BMW --- ratting");
	}		
	public void carRating() {
		ratingMethod();
	}
}