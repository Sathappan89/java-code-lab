package javasessions;

public class DataTypes {

	public static void main(String[] args) {

		// data types: strict type

		// 1. primitive data types: no object is needed: direct/fixed memory allocation
		// memory: bytes/bits: 1 byte = 8 bits

		// Integral:
		// Integer: byte, short, int, long
		// floating-point: float, double
		// Character: char
		// boolean: true/false

		// 2. non primitive data types: object is needed: Class, Arrays, Collections,
		// Interface, String

		// 1. byte:
		// size: 1 byte = 8 bits
		// range: -128 to 127: -2^7 to 2^7-1
		byte b = 10;
		b = 20;
		System.out.println(b);// 20
		byte c = 0;
		byte c1 = -90;
		System.out.println(c);

		// 2. short:
		// size: 2 bytes = 2x8=16 bits
		// range: -32768 to 32767: -2^15 to 2^15-1
		short s = 100;
		short s1 = -900;
		System.out.println(s);

		// 3. int:
		// size: 4 bytes = 4x8=32 bits
		// range: -2147483648 to 2147483647: -2^31 to 2^31-1
		int i = 909889;
		int age = 10;
		int k = -98876;
		System.out.println(i);

		// 4. long:
		// size: 8 bytes = 8x8=64 bits
		// range: -2^63 to 2^63-1:
		long m = 9898888;
		long distance = 2147483648L;
		System.out.println(distance);

		// 5. float:
		// size: 4 bytes = 4x8=32 bits
		// range: after . it can take upto 6 to 7 digits
		float t = 12.33f;
		float t1 = (float) 22.33;
		System.out.println(t);
		System.out.println(t1);

		// 6. double:
		// size: 8 bytes = 8x8=64 bits
		// range: after . it can take upto 15 digits
		double d = 12.3333333;
		double d1 = -90.34343;

		// 7. char: single digit value
		// size: 2 bytes = 16 bits
		// uni-code/ascii values: chinese, arabic,
		char ch = 'a';// a to z
		char ch1 = '1';// 0 to 9
		char ch2 = '$';
		char ch3 = 'M';// A to Z

		char gender = 'f';
		char execution = 'Y';
		execution = 'N';

		char x = 'r';
		char p = ' ';// space
		char test = 65;// ascii values

		char tr = 'x';
		System.out.println(tr);

		// 8. boolean: true/false: boolean literals
		// size: ~ 1 bit
		boolean bb = true;
		boolean cc = false;

		int price = 200; // local var should be initialized
		System.out.println(price);// 200
		System.out.println(price + 10);// 210
		System.out.println(price);// 210

		// int pop = 12.33;
		double top = 100;
		System.out.println(top);// 100.0

		System.out.println(Byte.MIN_VALUE);// -128
		System.out.println(Byte.MAX_VALUE);// 127

		byte dg = 127;
		System.out.println(dg + 1); // 128
		System.out.println(dg); // 127

		System.out.println(Byte.SIZE);// 8 bits
		System.out.println(Double.SIZE);

		char test2 = 65;
		System.out.println(test2);

	}

}