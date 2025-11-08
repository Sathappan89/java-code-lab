package javasessions;

public class StringConcatenation {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;

		System.out.println("the value of a is :" + a); // 129
		System.out.println("the value of b is " + b); // 294
		System.out.println("the sum is :" + (a + b)); // 294hello

		String x = "hello";
		String y = "world";

		double c = 12.33;
		double d = 12.44;

		System.out.println(a + b);

		System.out.println(x + y); // helloworld
		System.out.println(x + a); // hello10
		System.out.println(a + b + x + y);// 30helloworld //Execution will always start with left to right
		System.out.println(x + y + a + b);// helloworld1020

		System.out.println(x + y + (a + b));// helloworld30

		System.out.println(a + b + x + y + a + b);// 30helloworld
		System.out.println(x + y + c + d);// helloworld12.3312.44
		System.out.println(x + y + c + d + a + b);// helloworld12.3312.441020
		System.out.println(a + b + c + d + x + y + a + b);// 54.77helloworld1020

		char ch = 'a';
		char th = 'b';
		System.out.println(a + b + x + y);// 195helloworld

		System.out.println(x + y + ch + th + a + b); // helloworldab1020
		System.out.println(x + y + (ch + th) + a + b); // helloworld1951020

		char yh = 99;
		System.out.println(yh);

		System.out.println(a + b + yh);// 129

		System.out.println(ch + th + yh);// 294

		System.out.println(ch + th + yh + x);// 294hello

	}

}
