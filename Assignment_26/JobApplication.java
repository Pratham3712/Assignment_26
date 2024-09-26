/*Write a program that checks if a person is eligible for a job based on their qualifications. A person is eligible if they have a bachelor’s degree or equivalent experience, and they have a clean criminal record.
Requirements:
•    Use logical operators to combine conditions.*/

package Assignment_26;
import java.util.Scanner;
public class JobApplication {
	private boolean degree;
	private boolean experience;
	private boolean record;

	Scanner sc = new Scanner(System.in);

	void acceptDetails() {
		System.out.println("Do You Have a Bachelor's Degree or Not ? ");
		String input = sc.next();
		degree = input.equals("yes");
		System.out.println("Do You Have Any Experience ?");
		String Input = sc.next();
		experience = Input.equals("yes");
		System.out.println("Do You have a clean criminal ?");
		String Record = sc.next();
		record = Record.equals("yes");
	}

	void checkEligibility() {
		if (degree && experience && record) {
			System.out.println("Person is Eligible For Job");
		} else {
			System.out.println("Person is Not Eligible For Job");
		}
	}

	public static void main(String[] args) {
		JobApplication candidate = new JobApplication();
		candidate.acceptDetails();
		candidate.checkEligibility();
	}

}
