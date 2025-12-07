package AccMod1;
public class Car {
	//Instance Variable 
	public String name;
	int price; // Default - Default is only for interface and methods
	protected String color;
	private String licenseNumber;
	
	
	public void start() {
		System.out.println("car -- start");
	}

	protected void stop() {
		System.out.println("car -- stop");
	}

	void refuel() {
		System.out.println("car -- refuel");
	}

	private void billing() {
		System.out.println("car -- billing");
	}
	
	public static void main(String[] args) {
		Car c=new Car();
		c.name="BMW";
		c.price=45;
		c.color="Yellow";
		c.licenseNumber="999";

	}
}