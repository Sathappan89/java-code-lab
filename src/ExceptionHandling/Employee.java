package ExceptionHandling;
public class Employee {
	String name;
	public static void main(String args[]) {
		System.out.println("A");
		System.out.println("A");
		System.out.println("A");
		try {
			int p[] = new int[2];
			p[5] = 100; // AIOB
			int i = 9 / 0; // ArithmeticException
			Employee obj = new Employee();
			obj = null;
			obj.name = "naveen"; // NPE
		}
		/*
		 * First child exception should be displayed...Parent child should in the last
		 */
		catch (ArithmeticException e) {
			System.out.println("AE is coming...");
			e.printStackTrace();
		} catch (NullPointerException e) {
			System.out.println("NPE is coming...");
			e.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("AIOB is coming");
			e.printStackTrace();
		} catch (RuntimeException e) {
			System.out.println("RuntimeException is coming");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Exception is coming");
			e.printStackTrace();
		} catch (Throwable e) {
			System.out.println("Throwable is coming");
			e.printStackTrace();
		}
		System.out.println("bye");
	}
}