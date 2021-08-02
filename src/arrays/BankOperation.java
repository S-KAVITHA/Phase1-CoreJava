package arrays;

import java.util.Scanner;

public class BankOperation {
	
	static boolean until = true;
	public static void main(String[] args) {

		// single dimensional arrays to hold list of strings ,int, balances values.
		
		String[] usernames = { "John Smith", "Mike Smith", "David Miller", "Rajan Ram", "Robert Kim" };
		int[] userIds = { 1001, 1002, 1003, 1004, 1005 };
		double[] balances = { 76552.3, 23423.456, 54654.67, 343.34, 8345.456 };
		
		// step 1. collect input from user console
		
		Scanner input = new Scanner(System.in);
		System.out.println("-----------------------------------------");
		System.out.println(" :: Welcome to show balance feature of Bank ABC :: ");
		System.out.println("-----------------------------------------");
		while (until) {			
			System.out.println(" :: Enter a userId :: ");			
			int userId = input.nextInt();
			findUser(usernames, userIds, balances, userId);
		}

	}

	private static void findUser(String[] usernames, int[] userIds, double[] balances, int userId) {
		int match = 0;
		// find a userId
		for (int index = 0; index < userIds.length; index++) {
			// match user given userId with existing userids
			if (userIds[index] == userId) {
				System.out.println("User is Found with userId : " + userId);
				System.out.println("The Account username : " + usernames[index]);
				System.out.println("The Account balance : " + balances[index]);
				match++;
				until = false;
			}
		}
		if (match == 0) {
			System.out.println("User is not found with userId : " + userId);
		}
	}

}
