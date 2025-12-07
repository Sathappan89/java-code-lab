package AccMod2;

import AccMod1.Car;

public class Audi extends Car {

	@Override
	// public --> public
	public void start() {
		System.out.println("Audi -- start");
	}

	@Override
	// protected --> protected, public
	public void stop() {
		System.out.println("Audi -- stop");
	}

	// private --> NA
	private void billing() {
		System.out.println("Audi -- billing");
	}

	public static void main(String[] args) {

		Audi a1 = new Audi();
		a1.name = "Audi 99";
		a1.color = "Rainbow Color";

	}

}