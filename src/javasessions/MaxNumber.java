package javasessions;

public class MaxNumber {

	public static void main(String[] args) {
		
		int x = 700;
		int y = 500;
		int z = 800;
		
		// && - Short circuit operator - Improve the performance
		// &
		if(x>y && x>z) { //F && No
			System.out.println("x is the greatest number");
		}
		else if(y>z) { //F
			System.out.println("y is the greatest");
		}
		else {
			System.out.println("z is the greatest");
		}
		
//		if(10>5 && 10>7 && 10<20 && 10>30) {
//			System.out.println("Hi");
//		}
//		else {
//			System.out.println("bye");
//		}
	}

}