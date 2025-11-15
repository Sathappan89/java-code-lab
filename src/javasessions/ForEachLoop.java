package javasessions;

import java.util.Arrays;

public class ForEachLoop {

	public static void main(String[] args) {

		/*
		 * Two Major Limitations : 1. Similar types of data only. 2. SIZE is fixed :
		 * static array : in order to solve it, we have to use dynamic array,
		 * collections, ArrayList
		 */

		String browser[] = new String[5];

		browser[0] = "chrome";
		browser[1] = "firefox";
		browser[2] = "ie";
		browser[3] = "safari";
		browser[4] = "edge";

		int count = 0;
		for (String e : browser) {
			System.out.println(count + "=" + e);
			count++;
		}

		System.out.println("Reverse the array : index loop");

		for (int k = browser.length - 1; k >= 0; k--) {
			System.out.println(browser[k]);
		}

		System.out.println("Reverse the array : for each  loop");

		int c = browser.length - 1;
		for (String e : browser) {
			System.out.println(browser[c]);
			c--;
		}
	}

}
