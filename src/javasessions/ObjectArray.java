package javasessions;

import java.util.Arrays;

public class ObjectArray {

	public static void main(String[] args) {

		// emp data
		// name(String)
		// age(int)
		// salary(double)
		// gender(char)
		// isPermanent(boolean)

		// Object : is a class -- Super(parent) class

		Object empData[] = new Object[5]; // 0-4

		System.out.println(Arrays.toString(empData)); // null

		empData[0] = "anyName";
		empData[1] = 30;
		empData[2] = 34.44;
		empData[3] = 'f';
		empData[4] = true;
		//empData[5]=true; // AIOB

		System.out.println(Arrays.toString(empData));
		
		
		

		System.out.println(empData.length);
		System.out.println(empData[0]);

		System.out.println("----For loop------");

		for (int i = 0; i < empData.length - 1; i++) {
			System.out.println(empData[i]);
		}

		System.out.println("----For  Each loop------");

		for (Object e : empData) {
			System.out.println(e);
		}

	}

}
