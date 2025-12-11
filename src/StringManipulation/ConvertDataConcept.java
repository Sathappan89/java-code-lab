package StringManipulation;

public class ConvertDataConcept {
	public static void main(String[] args) {

		String x = "100";
		System.out.println(x + 20); // 100200

		// String to int:
		int i = Integer.parseInt(x); // 100
		System.out.println(i + 20); // 120

		String y = "100$";
//		int p=Integer.parseInt(x); //100
		/* throws NumberFormatException */
//		System.out.println(p); //100
//		System.out.println(p+20);

		y = y.replace("$", "");
		int p = Integer.parseInt(y);
		System.out.println(p);

		// String to double:
		String z = "12.33";
		System.out.println(z + 20);// 12.3320

		double d = Double.parseDouble(z);
		System.out.println(d + 20); // 32.33

		// String to boolean:
		String headless = "true";
		boolean flag = Boolean.parseBoolean(headless);

		if (flag) {
			System.out.println("run test cases in headless");
		}

		// int to String:
		int total = 2000;
		System.out.println(total + 20); // 2020

		String totalVal = String.valueOf(total);
		System.out.println(totalVal + 20);

		// double to String:
		double bmi = 17.12;
		String bmiVal = String.valueOf(bmi); // "17.12"
		System.out.println(bmiVal.length()); /// 5

		// boolean to string:
		boolean isTemp = true;
		String tempVal = String.valueOf(isTemp); // "true"
		System.out.println(tempVal.length()); // 4
		
		//int to String:
		int price = 1000;
		String priceVal = price+"";
		System.out.println(priceVal+20);//100020
		
	}

};