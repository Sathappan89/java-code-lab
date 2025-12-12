package ArrayListConcept;

import java.util.ArrayList;

public class ArrayListGenerics {

	public static void main(String[] args) {

		ArrayList ar = new ArrayList();
		ar.add(100);
		ar.add(12.33);
		ar.add(true);
		ar.add('c');
		ar.add("test");
		System.out.println(ar);

		// Generics in AL:
		ArrayList<Integer> marksList = new ArrayList<Integer>();
		marksList.add(100);

		ArrayList<Double> billList = new ArrayList<Double>();
		billList.add(12.33);
		billList.add(23.44);

		ArrayList<String> browserList = new ArrayList<String>();
		browserList.add("chrome");
		browserList.add("firefox");
		browserList.add("edge");

		System.out.println(browserList);
		System.out.println(browserList.get(0));

		// Object is parent of everything. Object is default class
		ArrayList<Object> empData = new ArrayList<Object>();
		empData.add("Jaya");
		empData.add(30);
		empData.add(34.55);
		empData.add('f');
		empData.add(true);

		//
		StringBuilder sb1 = new StringBuilder("java");
		StringBuilder sb2 = new StringBuilder("java");
		System.out.println(sb1.equals(sb2)); // false -- It is proper decent for string compare
		System.out.println(sb1.toString().equals(sb2.toString())); // true -- we need to use toString method to compare																	// object
		System.out.println(sb1 == sb2); // false

	}

}
