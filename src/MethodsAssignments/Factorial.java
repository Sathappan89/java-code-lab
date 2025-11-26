package MethodsAssignments;

public class Factorial {
	/*
	 * Write a program to print the factorial of a number by defining a method named
	 * 'Factorial'. Factorial of any number n is represented by n! and is equal to
	 * 1*2*3*....*(n-1)*n. E.g.- 4! = 1*2*3*4 = 24 3! = 3*2*1 = 6 2! = 2*1 = 2
	 */

	   public static int Fact(int num) {
	        int fact = 1; // start with 1
	        for (int i = 1; i <= num; i++) {
	            fact = fact * i; // multiply step by step
	        }
	        return fact;
	    }

	public static void main(String[] args) {
		int result = Fact(4);
		System.out.println(result);

	}

}
