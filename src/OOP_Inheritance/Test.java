package OOP_Inheritance;
public class Test {
	public static void main(String[] args) {
		BMW b = new BMW();
		b.start(); // Overridden Method
		b.autoParking(); // individual
		b.stop(); // inherited
		b.refuel(); // inherited
		b.engine(); //Overridden
		b.loading(); //inherited
		BMW.billing();
		BMW.taxation(); //inherited static method	
		b.info();//final method can be inherited but it can be inherited
		System.out.println(" ");
		System.out.println("-----------------------");		
		Audi au=new Audi();
		au.start();
		au.refuel();
		au.stop();
		au.theFtSafety();
		au.autoParking(); 				
		System.out.println(" ");
		System.out.println("-----------------------");		
		Car c=new Car();
		c.start();
		c.refuel();
		c.stop();
		c.engine(); //Overridden 
		c.loading(); //inherited
		Car.billing();
		Car.taxation();
	}
}