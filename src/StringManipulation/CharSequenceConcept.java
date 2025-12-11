package StringManipulation;

public class CharSequenceConcept {

	public static void sendKeys(CharSequence t) {
		System.out.println(t);
	}

	public static void main(String[] args) {

		// CharSquence(I) --> String, StringBuilder, StringBuffer

		String name = "Prity";
		String city = "Pune";

		StringBuilder sb = new StringBuilder("123 NFC, Pune, India");
		StringBuffer sbf = new StringBuffer("IBM,Pune");

		CharSequenceConcept.sendKeys(name);

		CharSequenceConcept.sendKeys(city);

		CharSequenceConcept.sendKeys(sb);

		CharSequenceConcept.sendKeys(sbf);
	}

}