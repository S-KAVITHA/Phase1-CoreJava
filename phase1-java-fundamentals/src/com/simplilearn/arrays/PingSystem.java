package arrays;

import java.util.Scanner;

public class PingSystem 
{
	static boolean until = true;
	
	public static void main(String[] args)
	{
				
		// single dimensional arrays to hold list of ip address values.
			
			String[] ipAddresses = { "192.168.0.1", "127.0.0.1", "133.192.31.42", "192.342.0.5", "145.154.42.58" };
						
			// step 1. collect input from user console
			
			Scanner input = new Scanner(System.in);
			System.out.println("-----------------------------------------");
			System.out.println("    :: Welcome to Ping System :: ");
			System.out.println("-----------------------------------------");
			System.out.println("1 --> Ping Ip Address");
		    System.out.println("2 --> Replace Ip Address");
		    System.out.println("3 --> Terminate");
		    
		   		    
			while (until) 
			{
		//get the choice from the user
			
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
			
		 // get the ip address to be searched from the user
		    
			System.out.println("Enter a Ip Address : ");			
						
			Scanner myObj = new Scanner(System.in);
			String userIp = myObj.nextLine();
			
			//call the method to process the show and update functionality based on ip address.
			
			findIpaddress(ipAddresses,userIp,choice);
			
			}
	}
	
	public static void findIpaddress(String[] ipAddresses, String userIp,int choice)
	{
			int match = 0;
			
			// find the email address in the list of ip addresses (ipAddresses).
			
			for (int index = 0; index < ipAddresses.length; index++)
			{
				// match user given email id  with existing ips.
				// if choice is 1 the ping ip message displayed.
				// if choice is 2 the get new ip and update the corresponding ip with new ip.
				
				if (ipAddresses[index].equals(userIp)) 
				{
					switch(choice) 
					{
					case 1:
						System.out.println("Ping " +ipAddresses[index]);
						match++;
						break;
						//until = false;
					
					case 2:
						//System.out.println("Enter a Ip Address : ");			
						//String userIp = input.nextLine();
						//Scanner input = new Scanner(System.in);
						System.out.println("Enter a new Ip Address : ");
						Scanner input = new Scanner(System.in);
						String newuserIp = input.nextLine();
						ipAddresses[index] = newuserIp ;
						System.out.println("Ip Address "+userIp +" replaced with " +ipAddresses[index]);		
						match++;
						break;
						//until = false;
					default:
					   break;
					   					
					}
									
				}
			}

			//if ip entered by the user is not found then display the below error message.
			
			if (match == 0) 
			{
				System.out.println("Ip Address not found  : " + userIp);
			}
	}
	
}		



