package DataConversion;

public class ConvertDataConcept {

	public static void main(String[] args) {
		//String to int:
		String x = "100";
		System.out.println(x+20);
		int i = Integer.parseInt(x);//100
		System.out.println(i+20);//120
		
		String y = "100$";
//		int p = Integer.parseInt(y);//NumberFormatException
//		System.out.println(p+20);

		y = y.replace("$", "");//"100"
		int p = Integer.parseInt(y);//100
		System.out.println(p+20);//120
		
		//String to double:
		String z = "12.33";
		System.out.println(z+20);
		double d = Double.parseDouble(z);//12.33
		System.out.println(d+20);

		//String to boolean:
		String headless = "true";
		boolean flag = Boolean.parseBoolean(headless);
		
		if(flag) {
			System.out.println("run tc in headless");
		}
		
		//int to String:
		int total = 2000;
		System.out.println(total+20);
		
		String totalVal = String.valueOf(total); // "2000"
		System.out.println(totalVal + 20);
		
		
		//double to String:
		double bmi = 17.12;
		String bmiVal = String.valueOf(bmi);//"17.12"
		System.out.println(bmiVal.length());
		
		
		//boolean  to String:
		boolean isTemp = true;
		String tempVal = String.valueOf(isTemp);//"true"
		System.out.println(tempVal.length());
		
		
		//int to String:
		int price = 1000;
		String priceVal = price+"";
		System.out.println(priceVal+20);//100020

	}

}
