package StaticMethod;
/*Can we overload the static method ?
Yes, we can overload the static method not Overriding does not happen.
*/
public class Browser {

	public static void init() {
		
	}
	
	public static void init(int a) {
		
	}
	
	public static void init(int a,int b,int c) {
		
	}
	public static void main(String[] args) {
		
		Browser.init(10);
	}

}
