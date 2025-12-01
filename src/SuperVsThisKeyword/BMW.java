package SuperVsThisKeyword;
public class BMW extends Car{
	
	int min_speed=200;
	
	public BMW() {
		System.out.println("BMW---default");
	}	
	public BMW(int i) {
		System.out.println("BMW---one param ..  " + i);
	}	
	public BMW(int i,int j) {
		System.out.println("BMW---two param ..." + i + j );
	}
	@Override
	public void start() {
		System.out.println("BMW---Start");
		super.start();
	}	
	public void displaySpeed() {
		System.out.println(min_speed); //200
		System.out.println(super.min_speed); 
		int carSpeed = super.min_speed;
	}
}