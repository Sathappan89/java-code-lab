package MethodCalling;

public class Browser {

	public void m0() {
		System.out.println("m0 method");
	}
	
	public void m1() {
		System.out.println("m1 method");
		m2();
	}

	public void m2() {
		System.out.println("m2 method");
		m3();
	}

	public void m3() {
		System.out.println("m3 method");
	}
	
	
	public static void t1() {
		System.out.println("t1 method");
		t2();
	}
	public static void t2() {
		System.out.println("t2 method");
		//t3();
		
	}
	public  static void t3(Browser test) {
		System.out.println("t3 method");
//		Browser bh=new Browser(); //S-->NS Have to create the object
//		bh.m1();
		test.m0();
	}
	
	public static void main(String[] args) {
		Browser br=new Browser(); //local variable only for main method
		br.m1();
		Browser.t3(br);
		
	}

}