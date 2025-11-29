package OOP_Inheritance;
public class Audi extends Car{	
	@Override 
	public void start() {
		System.out.println("Audi---Start");
	}	
	public void theFtSafety() {
		System.out.println("Audi----theFtSafety");
	}
	public void autoParking() {
		BMW b=new BMW();
		b.autoParking();
	}
	
}
