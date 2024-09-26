/*Assignment 2: Exam Grading System
Write a program that determines whether a student passes an exam based on three subjects. A student passes if the average score is at least 60, and none of the individual scores is below 40.
Requirements:
• Use logical operators && and || to combine conditions.*/

package Assignment_26;

import java.util.Scanner;

public class GradingSystem {
	private int subject1;
	private int subject2;
	private int subject3;
	private int avg;

	Scanner sc = new Scanner(System.in);

	public void accept() {
		System.out.println("Enter Subject 1 Marks : ");
		subject1 = sc.nextInt();
		System.out.println("Enter Subject 2 Marks : ");
		subject2 = sc.nextInt();
		System.out.println("Enter Subject 3 Marks : ");
		subject3 = sc.nextInt();
		avg = (subject1 + subject2 + subject3) / 3;

	}

	public void display() {
		System.out.println("Average of 3 Subjects = " + avg);
		System.out.println("Subject 1 Marks = " + subject1);
		System.out.println("Subject 2 Marks = " + subject2);
		System.out.println("Subject 3 Marks = " + subject3);
	}

	public void ValidatePassStatus() {
		if (avg >= 60 && subject1 >= 40 && subject2 >= 40 && subject3 >= 40)
			System.out.println("Result : Pass");
		else
			System.out.println("Result : Fail");
	}

	public static void main(String[] args) {
		GradingSystem student = new GradingSystem();
		student.accept();
		student.display();
		student.ValidatePassStatus();

	}

}
