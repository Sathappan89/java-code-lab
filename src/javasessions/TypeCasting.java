package javasessions;

public class TypeCasting {
	
	public static void main(String[] args) {
		
		byte b = 10;
		short s = b;
		int i = s;
		long ln=i;
		
		System.out.println(s);
		
		//Range : -128 to 127
		byte b1 = 10;
		byte b2 = 20;
		//byte b3=b1+b2;//30 
		int b3=b1+b2;
		long b4=b1+b2;
		System.out.println(b3);
		System.out.println(b4);
		
		System.out.println();
		
		short s1=1000;
		short s2=1200;
		int s3=s1+s2;
		
		System.out.println(s3);
			
		int i1=15000;
		int i2=14000;
		int i3=i1+i2;
		System.out.println(i3);
		
		long l1=17000000;
		long l2=90000000;
		long l3=l1+l2;
		System.out.println(l3);
		
		byte price = 100;
		byte totalPrice = (byte) (price + 50);
		int totalP=price+50;
		
		System.out.println(totalPrice);
		System.out.println(totalP);
			
		short sh=100;
		byte bh=(byte) sh; //100
		System.out.println(bh); //100
			
		short vh = 200;
		byte ch=(byte)vh;	//200
		System.out.println(ch); //-56
		
		int ih = 10;
		byte th = (byte)ih;  //130
		System.out.println(th); //10
		
		long lh = 1000;
		int k = (int)lh;
		System.out.println(k);
		
		byte r = 10;
		float f = r;
		double d = r;
		System.out.println(f); // 10.0
		System.out.println(d); //10.0
		
		
		float bmi = 12.33f;
		byte bm=(byte)bmi; //12	
		System.out.println(bm);
		
		
		double dmi = 4550.123;
		long lmi = (long)dmi; //4550
		System.out.println(lmi);
		
		
		float x1=12.33f;
		float x2=12.44f;
		float x3=x1+x2;
		double x4=x1+x2;
		System.out.println(x3);
		System.out.println(x4);
		
		int s5=10;
		byte s6=20;
		byte s7=(byte) (s5+s6);		
		System.out.println(s7);
		
		char gender = 'm';
		byte bg=(byte) gender;
		System.out.println(bg);
				
		
		int c = 100;
		int d9 = 200;
		int c9 = (byte) (c+d9);
		System.out.println(c9);
	
		
		byte vg='a'; //97
		float fg = 'a';
		System.out.println(fg);
		
		long num = 97;
		char cl = (char)num;
		System.out.println(cl);
		
		System.out.println(Integer.MAX_VALUE); //	2147483647
		int x = Integer.MAX_VALUE+1;
		long y =(long) (Integer.MAX_VALUE)+1;
		System.out.println(x);
		System.out.println(y);
		
		byte bn=20;
		System.out.println(bn*8);
		
		
		
	}

}
