/*Assignment 1: Validating Age and Income
Write a program that checks if a person is eligible for a loan based on their age and income.
Requirements:
•    A person is eligible if their age is between 18 and 60 and their income is above $25,000.
•    Use logical && to combine these conditions.*/

package Assignment_26;

import java.util.Scanner;

public class ValidateAgeIncome {
	private int age;
	private double income;
	Scanner sc = new Scanner(System.in);

	public void accept() {
		System.out.println("Enter Age ");
		age = sc.nextInt();
		System.out.println("Enter Income ");
		income = sc.nextDouble();
	}

	public void validateAgeandIncome() {
		if (age >= 18 && age <= 60 && income > 25000)
			System.out.println("Person is Eligible For Getting a Loan");
		else

		if (age <= 0 || income <= 0)
			System.out.println("Not a Valid Age or Income");
		else
			System.out.println("Person is Not Eligible For Getting a Loan");

	}

	public static void main(String args[]) {
		ValidateAgeIncome person = new ValidateAgeIncome();
		person.accept();
		person.validateAgeandIncome();

	}
}
