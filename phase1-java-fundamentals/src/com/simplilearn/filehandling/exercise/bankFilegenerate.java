package filehandling.exercise;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class bankFilegenerate {

	private static final String N = null;
	static boolean until = true;

	public static void main(String[] args) {
		
		
		while (until) {
			@SuppressWarnings("resource")
			Scanner input = new Scanner(System.in);
			
			System.out.println("Enter a userId : ");
			Long Id = input.nextLong();

			System.out.println("Enter a Name : ");
			String name = input.next();

			System.out.println("Enter a Balance : ");
			double balance = input.nextFloat();

			Account account = new Account(Id,name,balance);

			List<Account> listOfAccounts = new ArrayList<Account>();

			listOfAccounts.add(account);

			createFile(account);
			

			System.out.println("Do you want to exit (y/n)? : ");
			String flag = input.next();

			if ((flag.equalsIgnoreCase("n")) || (flag.equalsIgnoreCase("N"))) {
				until = false;
			}
		}
		System.out.println("Reading file data");
		System.out.println("------------------");
		ReadFile();
	}

	private static void ReadFile() {
		File dbFile = new File("BANK.txt");
		try {
			Scanner input = new Scanner(dbFile);
			
			System.out.println(input.nextLine());
			 
			int count = 0;
			while (input.hasNextLine()) {
	           System.out.println(input.nextLine());
	            count++;
	         }
			input.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	@SuppressWarnings("unused")
	private static void createFile(Account account) {

		File dbFile = new File("BANK.txt");
		PrintWriter output;
		try {
			output = new PrintWriter(new FileWriter(dbFile, true));
			output.print("User Id = ");
			output.print(account.getId());
			output.print(", Name = ");
			output.print(account.getName());
			output.print(", Balance = ");
			output.print(account.getBalance());
			output.println("\n ");

			System.out.println("Account file generation Suscessful !");
			output.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}