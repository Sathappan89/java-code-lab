package javasessions;

public class CharConcept {

	public static void main(String[] args) {
		
		int a=10;
		int b=20;
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(b/a);
		
		
		char c1='a'; //97
		char c2='b'; //98
		System.out.println(c1);  //a
		System.out.println(c2);  //b
		System.out.println(c1+c2); //195
		System.out.println(c2-c1); //1 
		
		//ASCII Value
		//a-z : 97 to 122
		//A-Z : 65 to 90
		//0-9 : 48 to 57
		
		System.out.println('a' + '0'); //97+48 = 145
		
		System.out.println('Z' + 7); //90+7 = 97
		
		char c4 = 'e';
		System.out.println(c4);
		System.out.println((int)c4);
		
		
		char c5 = ' ';
		System.out.println(c5);
		System.out.println((int)c5);
		System.out.println((byte)c5); //Memory optimization 
		
		System.out.println((byte) '1'); //49
		 
		/*Very famous interview question*/
		char c3 ='a';
		System.out.println(c3);//a
		
		int p='a';
		System.out.println(p);//97
		
		int q=66;
		System.out.println(q); //66
		System.out.println((char)q); //B
		
		char t = 67;
		System.out.println(t); //C
		
		
		char t1 = 200;
		System.out.println(t1); //C
		
		char t5 = 8377;
		System.out.println(t5); //₹

		char t10 = 36;
		System.out.println(t10); //$
		
	}

}
