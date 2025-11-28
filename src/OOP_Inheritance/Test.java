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
		
		System.out.println(" ");
		System.out.println("-----------------------");
		Car c=new Car();
		c.start();
		c.refuel();
		c.stop();
		c.engine(); //Overridden 
		c.loading(); //inherited
	}
	

}
