package OOP_Abstract;
public abstract class Page {
	// abstract class: can not have the object
	//can have:
		//1. Only abstract method: 100% abstraction
		//2. Only non-abstract methods: 0% abstraction
		//3. Both abstract + non abstract method: partical abstraction
		//0 to 100% abstraction
		//100% abstraction = Always Interface
	// When we really want to achieve 100% abstraction, we will go with interface 
	
	
	/*
	 * Can not create the object of the abstract class
	 * 
	 * But we create the constructors of the abstract class
	 * 
	 * it will be called when e create the object of the child class
	 * */
	
	public Page() {
		System.out.println("Page--page constructots...");
	}
	
	public Page(int i) {
		System.out.println("Page--one param constructots..." + i);
	}
	
	public Page(int i,int j) {
		System.out.println("Page--two param constructots..." + i +""+j);
	}
	
	
	public abstract void title();
	public abstract void url();

	public final void displayLogo() {
		System.out.println("display logo");
	}
	public void timeOut() {
		System.out.println("time out: 10 secs");
	}
	public static void displayFooter() {
		System.out.println("Page -- footer Links");
	}
	public void inPage() {
		System.out.println("Individual page of login page");
	}
}