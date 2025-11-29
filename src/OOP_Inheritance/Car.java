package OOP_Inheritance;
// final class - can not be parent
public /*final*/ class Car extends Vehicle{
	/*Final - Final method can not be overridden -- preventing method overriding*/
	//Final used to be provide Constants
	public /*final*/ void start() {
		System.out.println("car -- start");
	}
	//final - final method can not be overridden - preventing method overridding
	//but can be inherited
	public final void info() {
		System.out.println("CAR---INFOR");
	}
	public void stop() {
		System.out.println("car -- stop");
	}
	public void refuel() {
		System.out.println("car -- refuel");
	}
	@Override
	public void engine() {
		System.out.println("CAR---engine");
	}
	/*Can we override the static method - Cannot be override*/
	/*Static method can be part of inherited*/
	//Method Hiding
	public static void billing() {
		System.out.println("CAR --- Billing");
	}
	public static void taxation() {
		System.out.println("CAR --- taxation");
	}
	//private method can not be overridden and cannot be inherited
	private void ratingMethod() {
		System.out.println("CAR --- ratting");
	}
}