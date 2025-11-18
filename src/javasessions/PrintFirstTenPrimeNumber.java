package javasessions;

public class PrintFirstTenPrimeNumber {
/*Write a java program to print the 10 prime number*/
	public static void main(String[] args) {
	
		int count = 1;
		int num=2;
		
		while(count<11) {
			boolean isPrime = true;
			
			//check if num is prime
				for(int i=2;i<=num/2;i++) {
					if(num%i==0) {
						isPrime = false;
						break;
					}
				}
			
				//If prime, print it
				if(isPrime) {
					System.out.println("Prime number " + count + "  = " +num+ " ");
					count++;
				}
			num++;
		}

	}

}
