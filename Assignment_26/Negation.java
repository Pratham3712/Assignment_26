/*Write a program that determines whether a number is not between 10 and 20 (inclusive).
Requirements:
•    Use logical ! to negate conditions.*/

package Assignment_26;
import java.util.Scanner;
public class Negation {

	private int num;
	Scanner sc = new Scanner(System.in);

	public void acceptNum() {
		System.out.println("Enter num:");
		num = sc.nextInt();

	}

	public void checkNum() {
		if (!(num >= 10 && num <= 20)) {
			System.out.println(+num + " is not between 10 and 20");
		} else
			System.out.println(+num + " is between 10 and 20");
	}

	public static void main(String[] args) {
		Negation num = new Negation();
		num.acceptNum();
		num.checkNum();
	}

}
