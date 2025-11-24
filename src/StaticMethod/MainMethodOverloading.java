package StaticMethod;

public class MainMethodOverloading {

	public static void main(int a) {
		System.out.println("hello testing " + a);
		MainMethodOverloading.main(10,20);
	}

	public static void main(int a, int b) {
		System.out.println("hello testing" + (a + b));
	}

	// PSVM(String[])
	public static void main(String[] args) {
		System.out.println("hello world");
		MainMethodOverloading.main(10); // CompileTime Polymorphisum
	}

	public static void main(String a[], String b[]) {
		System.out.println("hello selenium");
	}

}