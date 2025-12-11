package StringManipulation;
public class StringReverse {
	public static String StringRev(String str) {

		/** null check **/
		if (str == null) { //o(1)
			throw new RuntimeException("str is null");
		}

		/** length check **/  //o(1)
		if (str.length() == 1) {
			return str;
		}

		// length check==0 //o(1)
		if (str.length() == 0) {
			return str;
		}

		String rev = ""; 
		for (int i = str.length() - 1; i >= 0; i--) { //o(n)-linear execution
			rev = rev + str.charAt(i);
		}

		return rev;
	}

	public static void main(String[] args) {

		String str = "Selenium Testing";
		String res = StringReverse.StringRev(str);
		System.out.println(res);
//		
//		StringBuilder sb = new StringBuilder("selenium");
//		System.out.println(sb.reverse());
//
//		StringBuffer sbf = new StringBuffer("selenium");
//		System.out.println(sbf.reverse());

		
		//testing automation selenium - Don't change the possible
		//split , reverse and append 
		
	}
}