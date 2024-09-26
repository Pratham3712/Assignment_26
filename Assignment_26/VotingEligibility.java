/*Write a program that checks if a person is eligible to vote. A person can vote if they are a citizen and their age is 18 or above.
Requirements:
• Use logical && to combine conditions, and ! to negate conditions if necessary.*/

package Assignment_26;
import java.util.Scanner;
public class VotingEligibility {
	private int age;
	Scanner sc = new Scanner(System.in);

	public void acceptAge() {
		System.out.println("Enter The Age of Person");
		age = sc.nextInt();
	}

	public void checkAge() {
		if (age >= 18 && age <= 100)
			System.out.println("Person is Eligible to Vote");
		else if (age <= 0)
			System.out.println("Not a Valid Age");
		else
			System.out.println("Person is Not Eligible to Vote");

	}

	public static void main(String[] args) {

		VotingEligibility voter = new VotingEligibility();
		voter.acceptAge();
		voter.checkAge();
	}

}
