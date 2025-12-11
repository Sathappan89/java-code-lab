package StringManipulation;

public class StringBuilderVsStringBuffer {

	public static void main(String[] args) {
		
		//faster
		StringBuilder sb = new StringBuilder("hello ");
		sb.append("automation");
		System.out.println(sb); //hello automation
		
		//slower
		StringBuffer sbf = new StringBuffer("tesing");
		sbf.append("selenium");
		System.out.println(sbf); //tesingselenium

	}

}
