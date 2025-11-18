package javasessions;

import java.util.Arrays;

public class ArrayLiterals {

	public static void main(String[] args) {

		// literals : data is already with us
		// still static array

		// literals: data is already with us
		int a[] = { 10, 20, 301, 40, 50 };
		System.out.println(a.length);
		System.out.println(a[2]);

//		a[5]=60;
//		System.out.println(a[5]); // AIOB

		int i[] = new int[4];
		i[0] = 10;
		i[2] = 20;

//		System.out.println(Arrays.toString(i));

		String lang[] = { "Java", "JS", "Python", "TS" };
		System.out.println(Arrays.toString(lang));

		lang[0] = "Ruby";
		System.out.println(Arrays.toString(lang));

	}

}