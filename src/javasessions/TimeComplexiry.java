package javasessions;

public class TimeComplexiry {

	public static void main(String[] args) {

		// 50 ---> 1
		// 50k ---> 1
		// 500k --> 1

		// TC: Big Oh--> O(n)

		int i = 10;
		System.out.println(i);
		// O(1)--constant time

		for (int p = 1; p <= 10000; p++) {
			System.out.println(p);
		}
		// 1+n+n+n=>3n+1 : linear equation
		// 3n+1 --> 3n --> n --> O(n)
		// 5 hrs: 0.0000000001 sec

		int a = 1;
		while (a <= 10) {
			System.out.println(a);// 1234567...10
			i++;
		}
		// 1+n+n+n=>3n+1==> 3n==> n--> O(n)

		System.out.println("---------");
		for (int m = 0; m <= 5; m++) {
			for (int n = 0; n <= 5; n++) {
				System.out.print(m + "" + n + " ");
			}
			System.out.println();
		}

		// (1+n+n+n)(1+n+n+n)=>(1+3n)(1+3n)=>1+3n+3n+9n^2
		// 9n^2+6n+1: Quadratic equation
		// 9n^2+6n+1: 9n^2+6n ==> 3n(3n+2)==> 3n(3n)==> 9n^2 ==> n^2 ==> O(n^2)

		System.out.println("---------");
		for (int m = 0; m <= 5; m++) {
			for (int n = 0; n <= 5; n++) {
				for (int k = 0; k <= 5; k++) {
					System.out.print("hi");
				}
			}
		}

		// (1+n+n)(1+n+n)(1+n+n+n)==>(1+2n)(1+2n)(1+3n)==>n^3+n2+n: cubic equation

		//
		// n --> n/2
		// n/4

		// n/k ; k=2
		// T = n/k
		// log T = log(n/k)
		// log T = log n - log k; base=k=2
		// log T = log n - 1
		// log T = log n
		// TC = log n

	}

}
