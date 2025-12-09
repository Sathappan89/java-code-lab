package StringManipulation;

public class StringPool {

	public static void main(String[] args) {

		// String literals : SCP-HEAP
		String s1 = "hello";
		String s2 = "hello";

		System.out.println(s1 == s2); // true
		System.out.println(s1.equals(s2)); // true //compare the values

		String s3 = new String("hello");
		System.out.println(s1 == s3); // false
		System.out.println(s2 == s3); // false
		// It will not compare the value . It will compare the reference variable
		System.out.println(s1.equals(s3)); // true

		String s4 = new String("hello");
		System.out.println(s3 == s4);// false
		System.out.println(s3.equals(s4)); // true

		String s5 = new String("testing");
		String s6 = "testing";

		/* Very Important Question */
		String t1 = new String("automation"); // 2 objects will be created //2: heap(object) + scp(value/object)
		String t2 = "automation"; // 0 object will be created but t2 refer to SCP

		String r1 = null;
		String r2 = null;
		System.out.println(r1 == r2); // true
		// System.out.println(r1.equals(r2)); // NPE

		String p1 = null;
		// always prefer the first one //
		// expected value is always equal to actual value
		if ("naveen".equals(p1)) {
			System.out.println("Both are not equal");
		}

//		if (p1.equals("naveen")) {
//
//		}

		/* very famous interview questions */
		// It is expensive manipulation(chaning value,add,concat) so java introduced
		// stringbuffer and string builders.
		String x = "hello";
		x = x.concat("automation");
		System.out.println(x);

		
		StringBuilder sb = new StringBuilder("Selenium");
		System.out.println(sb.append(" automation"));
		
		//
		int i=10;
		int j=10;
		
	}

}
