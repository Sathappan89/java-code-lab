package ExceptionHandling;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
public class FileTest {
	public static void main(String[] args) {
		System.out.println("file test");

		//int i = 9 / 0; // Runtime exception - AE //Unchecked Exception //RunTime Exception

		
		
		File file = new File("C:\\document\\test.xls");
		//FileInputStream ip = new FileInputStream(file); // CT- Checked exception
		// - Unhandled exception type FileNotFoundException
		try {
			FileInputStream ip = new FileInputStream(file);
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
		}
	
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		/*
		 * 
		 * 1. Error are runtime exception
		 * 2. Runtime Exception & it's sub classes and Error & it's sub-classes are unchecked Exception (runtime exception)
		 * 3. All other exception are checked Exception
		 * 
		 * 4. Compile time exception example : thread.sleep and filenotfoundexception
		 * */
		
	}
}