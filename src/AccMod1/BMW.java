package AccMod1;

public class BMW extends Car {

	@Override
	// public --> public
	public void start() {
		System.out.println("BMW -- start");
	}

	@Override
	// protected --> protected, public
	public void stop() {
		System.out.println("BMW -- stop");
	}

	@Override
	// default --> default, protected, public
	public void refuel() {
		System.out.println("BMW -- refuel");
	}

	// private --> NA
	private void billing() {
		System.out.println("BMW -- billing");
	}

	public static void main(String[] args) {

		BMW b1 = new BMW();
		b1.name = "BMW";
		b1.color = "Green";
		b1.price = 99;

	}

}