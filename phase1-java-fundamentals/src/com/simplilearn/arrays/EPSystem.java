package arrays;

import java.util.Scanner;

public class EPSystem 
{
	static boolean until = true;
	
	public static void main(String[] args)
	{
				
	// single dimensional arrays to hold list of email address and password values.
			
		String[] emails = { "test@gmail.com", "demo@gmail.com", "sample@gmail.com", "run@gmail.com" };
		String[] passwords = { "Test100&", "Demo200&", "Sample300&", "Run400!" };
						
			// step 1. collect input from user console
			
			Scanner input = new Scanner(System.in);
			System.out.println("-----------------------------------------");
			System.out.println("    :: Welcome to Security System :: ");
			System.out.println("-----------------------------------------");
			System.out.println("1 --> Show password");
		    System.out.println("2 --> Replace password");
		    System.out.println("3 --> Terminate");
		    
		    
			while (until) 
			{
						
		    System.out.println("Enter choice [1-3]: ");
		    int choice = input.nextInt();
		 
		    // if invalid choice value is entered display prompt for valid entry.
		    
		    if (choice != 1 && choice != 2 && choice != 3 )
		    {
		    	System.out.println("Invalid choice");
		    	continue;
	    	
		    }
		     
		    //if choice value is 3 then terminate the program else continue.
		    
		    if (choice == 3 ) 
		    {
		    	System.out.println("Terminated");
                until = false;
		    	return;
		    				
		    }
			
			// get the email address to be searched from the user
		    
			System.out.println("Enter an email address : ");			
						
			Scanner myObj = new Scanner(System.in);
			String useremail = myObj.nextLine();
			
			//call the method to process the show and update functionality based on email address.
			
			findemailaddress(emails,passwords,useremail,choice);
			
			}
	}
	
	public static void findemailaddress(String[] emails, String[] passwords, String useremail,int choice)
	{
			int match = 0;
			
			// find the email address in the list of emails (emails).
			
			for (int index = 0; index < emails.length; index++)
			{
				// match user given email id  with existing email ids.
				// if choice is 1 the show the corresponding password.
				// if choice is 2 the get new password and update the password.
				
				if (emails[index].equals(useremail)) 
				{
					switch(choice) 
					{
					case 1:				
					System.out.println("Email address  : " +emails[index]);
					System.out.println("Password       : " +passwords[index]);
						match++;
						break;
											
					case 2:
						System.out.println("Enter a new password : ");
						Scanner input = new Scanner(System.in);
						String newuserpw = input.nextLine();
						passwords[index] = newuserpw ;
						System.out.println("Password succesfully updated" );
						System.out.println("Email address     : " +emails[index]);
						System.out.println("Updated password  : " +passwords[index]);
						match++;
						break;
						
					default:
					   break;
					   					
					}
									
				}
			}
			//if email id entered by the user is not found then display the below error message.
			
			if (match == 0) 
			{
				System.out.println("Email Address not found  : " + useremail);
			}
	}
	
}		



