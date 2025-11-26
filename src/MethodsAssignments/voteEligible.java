package MethodsAssignments;

public class voteEligible {
	/*
	 * A person is eligible to vote if his/her age is greater than or equal to 18.
	 * Define a method to find out if he/she is eligible to vote. - return
	 * true/false
	 */

	public static void VoterEligible(int age) {
		boolean isEligible = true;

		if (age >= 18) {
			System.out.println("Eligible for voting " + age + " " + isEligible);
		} else {
			isEligible = false;
			System.out.println("Not Eligible for voting " + age + " " + isEligible);
		}

	}

	public static void main(String[] args) {
		voteEligible.VoterEligible(19);
		voteEligible.VoterEligible(21);
		voteEligible.VoterEligible(21);
		voteEligible.VoterEligible(18);
		voteEligible.VoterEligible(17);
	}
	

}
