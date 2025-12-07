package StringManipulation;

public class StringMethods {
	public static void main(String[] args) {
		String str = "hi this is my java code and i am so happy";
		System.out.println(str.length());

		int len = str.length();
		int li = 0;
		int hi = len - 1;

		System.out.println("lenght is = " + len);
		System.out.println("Lowest Index is = " + li);
		System.out.println("Highest Index is = " + hi);

		System.out.println(str.charAt(0));
		System.out.println(str.charAt(11));
		System.out.println(str.charAt(40));
		// System.out.println(str.charAt(41));
		// //java.lang.StringIndexOutOfBoundsException

		System.out.println(str.indexOf('h'));
		System.out.println(str.indexOf('i')); // 1st occurrence of i
		// System.out.println(str.indexOf('i', 2)); // 5 //Hot code value

		// Method overloading
		System.out.println(str.indexOf("i", str.indexOf('i') + 1)); // 2nd occurrence of i
		System.out.println(str.indexOf("i", str.indexOf("i", str.indexOf('i') + 1) + 1)); // 3rd occurrence of i

		int i3rd = str.indexOf("i", str.indexOf('i') + 1) + 1;

		System.out.println(str.indexOf('i', str.indexOf('i', i3rd) + 1));

		System.out.println(str.indexOf("java")); // 14
		System.out.println(str.indexOf("naveen")); // -1 (if index is not available)

		String mesg = "welcomeadmin";

		if (mesg.indexOf("admin") >= 8) { // 8>=0 T
			System.out.println("message is valid -- passed");
		} else {
			System.out.println("invalid message -- failed");
		}

		// trim:
		String test = " hello world ";
		System.out.println(test.trim());

		// LowerCase//UpperCase
		String un = "naveenautomationlabs";
		System.out.println(un.toUpperCase());
		System.out.println(un.toLowerCase());

		// Replace method
		String dob = "12-08-1990";
		System.out.println(dob.replace("-", "/"));

		String rest = " hello world ";
		System.out.println(rest.replace(" ", ""));

		String mg = "hi this is my java code and i am so happy";
		System.out.println(mg.replace("java", "Cypress"));

		// equals:
		String t1 = "hello selenium";
		String t2 = "hello selenium";
		System.out.println(t1.equals(t2)); // true //Hard Comparison
		System.out.println(t1.equalsIgnoreCase(t2)); // true /Soft Comparison

		// contains:
		String tg = "hi this is my java code and i am so happy";
		System.out.println(tg.contains("java"));

		if (tg.contains("java")) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}

		
		/*Very famous interview question*/
		String x = "hello selenium";
		x.concat("automation");
		System.out.println(x);
		
		String y= "hello selenium";
		String hs=y.concat(" automation");
		System.out.println(hs);
}}