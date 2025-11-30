package OOP_Inheritance;
public class Testing {
	public static void main(String[] args) {
		// Child class object can be referred by parent class reference variable : Yes
		// Top Casting/Up Casting

		// c ---> car class object reference
		// new BMW() -- BMW Object
		System.out.println("--------------Top Casting----------------");
		Car c = new BMW();
		c.start(); //BMW -- start 
		c.info(); // CAR---INFOR
		c.start(); //	BMW -- start
		c.stop(); //car -- stop
		c.refuel(); //	car -- refuel
		c.engine(); //	BMW---engine
		// c.autoParking(); - ref type check - will fail
		// ref type check		
		System.out.println("--------------Top Casting----------------");
		Vehicle v  = new BMW();
		v.engine();		
		System.out.println("--------------DOWN Casting----------------"); //ClasscasrException (Run time error)	
		//BMW b=(BMW) new Vehicle(); // java.lang.ClassCastException
		//Audi au=(Audi) new BMW(); // Anti - Pattern
	}
}