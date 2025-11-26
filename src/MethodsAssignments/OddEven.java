package MethodsAssignments;

public class OddEven {

//	Def ine a program to find out whether a given number is even or odd - return true/false.

	public static boolean OddEvenNumber(int num) {

		boolean isFlag = true;

		if (num < 0) {
			isFlag = false;
			System.out.println("cannot find the oddEven Number " + num + " " + isFlag);
		}

		if (num >= 0 && num % 2 == 0) {
			System.out.println("Number is even number " + num + " " + isFlag);
		} else if (num % 2 == 1) {
			System.out.println("Number is odd number " + num + " " + isFlag);
		}

		return isFlag;

	}

	public static void main(String[] args) {

		OddEvenNumber(10);

		OddEvenNumber(0);
		
		OddEvenNumber(-1);
		
		OddEvenNumber(11);
	}

}
