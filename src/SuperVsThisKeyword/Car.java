package SuperVsThisKeyword;
public class Car extends Vehicle{

	//int min_speed=100;
	
	public Car() {
		super(10);
		System.out.println("car---default");
	}	
//	public Car(int i) {
//		System.out.println("car---one param ..  " + i);
//	}	
//	public Car(int i,int j) {
//		System.out.println("car---two param ..." + i + j );
//	}	
	public void start() {
		System.out.println("Car---Start");
	}	
	public void stop() {
		System.out.println("Car---Stop");
	}
}
