package StringManipulation;
public class StringReverse {
	public static void main(String[] args) {
		
		String str = "Selenium";
		
		StringBuilder sb = new StringBuilder("selenium");
		System.out.println(sb.reverse());

		StringBuffer sbf = new StringBuffer("selenium");
		System.out.println(sbf.reverse());
		
	}

}
