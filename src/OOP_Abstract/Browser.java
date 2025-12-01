package OOP_Abstract;

public class Browser extends Web{
	
	public Browser() {
		System.out.println("Browser--default");
	}
	
	public Browser(int i) {
		System.out.println("Browser--one param");
	}
	
	public Browser(int i,int j) {
		System.out.println("Browser--two param");
	}

}
