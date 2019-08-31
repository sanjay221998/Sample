package basic;

import java.util.Scanner;

public class authendication {

	public static void main(String[] args) {
		Scanner g = new Scanner(System.in);
	    String user, pass;
		System.out.println("ENTER THE USER NAME");
		user = g.nextLine();
		System.out.println("ENTER YOUR PASSWORD");
		pass = g.nextLine();
		if (user.equals("sanjay") && (pass.equals("sanjay@123"))) {
			System.out.println("WELCOME SANJAY");

		} else

		{
			System.out.println("THE USER NAME OR PASSWORD INCORRECT");

		}
g.close();
	}
}
