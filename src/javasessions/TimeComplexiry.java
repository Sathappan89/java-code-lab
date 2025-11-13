package javasessions;

public class TimeComplexiry {

	public static void main(String[] args) {

		// 50 -->1
		// 50k --> 1
		// 500k --> 1

		// TC : Big Oh--> 0(n)

		System.out.println("------Constant Time -----");
		int i = 10;
		System.out.println(i);

		System.out.println("-------Linear Time--------");
		for (int p = 1; p <= 10; p++) {
			System.out.println(p);
		}

		// 1+n+n+n = (3n+1) : linear Equation
		// 3n+1 = 3n-->n-->O(n) : number of times
		// 5hrs : 0.000000000001 Sec
		
		

	}

}
