package StringManipulation;

public class ReverseStringAssignment {

	public static String reverse(String str) {

		/** null check **/
		if (str == null) { // o(1)
			throw new RuntimeException("str is null");
		}

		/** length check **/ // o(1)
		if (str.length() == 1) {
			return str;
		}

		// length check==0 //o(1)
		if (str.length() == 0) {
			return str;
		}

		String words[] = str.split(" ");
		StringBuilder finalWord = new StringBuilder();

		for (int i = 0; i < words.length; i++) {

			String word = words[i];
			StringBuilder revWord = new StringBuilder();

			for (int j = word.length() - 1; j >= 0; j--) {
				revWord.append(word.charAt(j));
			}

			finalWord.append(revWord);

			if (i < words.length - 1) {
				finalWord.append(" ");
			}

			return finalWord.toString();

		}

		return finalWord.toString();

	}

	public static void main(String[] args) {

		String str = "testing automation selenium";
		String res = ReverseStringAssignment.reverse(str);
		System.out.println(res);

	}

}
