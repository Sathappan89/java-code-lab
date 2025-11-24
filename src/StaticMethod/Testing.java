package StaticMethod;

public class Testing {

	public int add(int a, int b) {
		System.out.println("adding");
		return a + b;
	}

	// PSVM(String [])

	public static void main(String[] args) {
		System.out.println("hello world");
	}
	
//	public static void main(String[] test) {
		
//	}

	
	
}

/*  Why main method is in Void in nature ? no return in the main method
 *  
 *  ----> Main Method behaving like a caller method or user method 
 *  ----> Inside the main method we will never write the business logic
 *  ----> Main method starting point of the execution
 *  ----> Main method create the object and calling the other object.
 *  ----> Every programming language python or c or c++ ...(We should have method which will behave a caller method) 
 *  -----> It will not return anything. JVM no need to create object
 *  
 *  
 *  
 *  ----> public - available public
 * 
 *  ---- > main is name
 *  
 *  ---> JVM passing array parameters
 */