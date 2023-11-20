package loginInfo;

import java.util.Scanner;

public class Login {
	String UserId;
	String password;
	int chancesToLogin;

	Scanner sc = new Scanner(System.in);

	void loginInformation() {

		for (chancesToLogin = 0; chancesToLogin < 3; chancesToLogin++)

		{

			System.out.println("Enter your UserId:");
			UserId = sc.next();
			System.out.println("Enter The Password:");
			password = sc.next();

			System.out.println("User id is:" + UserId);
			System.out.println("Password is:" + password);

			if (UserId.equals("pivotAdmin") && password.equals("Admin123")) {

				System.out.println("You are logged in to the application");
				break;

			} else {
				System.out.println("Incorrect UserId and Password.Try Again");
			}

		}
		if (chancesToLogin == 3) {

			System.out.println("Account Locked");

		}
	}
}