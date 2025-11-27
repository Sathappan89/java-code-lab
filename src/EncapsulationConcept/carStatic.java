package EncapsulationConcept;

//Which class in Java has private constructor ? System Class
public class carStatic {

	private static String name;
	private static String plate;
	private static int carTyre;

	private static String getName() {
		return name;
	}

	private static void setName(String name) {
		carStatic.name = name;
	}

	private static String getPlate() {
		return plate;
	}

	private static void setPlate(String plate) {
		carStatic.plate = plate;
	}

	private static int getCarTyre() {
		return carTyre;
	}

	private static void setCarTyre(int carTyre) {
		carStatic.carTyre = carTyre;
	}

	public static void main(String[] args) {

		carStatic.setName("Tesla");
		System.out.println(carStatic.getName());

	}

}
