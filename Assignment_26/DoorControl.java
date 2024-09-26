/*Write a program that simulates an access control system. A person is allowed access if they have both a valid ID and a valid access card, or if they are an admin.
Requirements:
•    Use logical operators &&, ||, and !.*/

package Assignment_26;

import java.util.Scanner;

public class DoorControl {

	private boolean validId;
	private boolean validAccessCard;
	private boolean Admin;
	Scanner sc = new Scanner(System.in);

	void acceptInfo() {
		System.out.println("Do you have a valid ID ?");
		String idInput = sc.next();
		validId = idInput.equals("yes");
		System.out.println("Do you have a valid access card ?");
		String cardInput = sc.next();
		validAccessCard = cardInput.equals("yes");
		System.out.println("Are you an admin ?");
		String adminInput = sc.next();
		Admin = adminInput.equals("yes");
	}

	void checkAccess() {

		if (Admin || (validId && validAccessCard)) {
			System.out.println("Door Access Granted");
		} else {
			System.out.println("Door Access Not Granted");
		}
	}

	public static void main(String[] args) {
		DoorControl user = new DoorControl();
		user.acceptInfo();
		user.checkAccess();
	}

}
