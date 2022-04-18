package multithreading.exercise;
import java.util.Scanner;

class Accountdemo extends Thread 
{
	
	// properties & methods
	
	Long acctNumber = 10023456L ;
	String acctName = "Joe Thomas";
	double acctbalance = 50000d ;
			
	public synchronized void showData()
	{
		System.out.println("-------------------------------");
		System.out.println("       :Account details:       ");
		System.out.println("-------------------------------");
		
		System.out.println("Account Number  :  "+ acctNumber);
		System.out.println("Account Name    :  "+ acctName);
		System.out.println("Account Balance :  "+ acctbalance);
	}	
	
	public synchronized double withdrawAmount(double amount)
	{
		if(amount>0 || amount<acctbalance) 
		{
			acctbalance -= amount; // account.balance = account.balance- amount;
			
			System.out.println("--------------");
			System.out.println("Withdrawal:               ");
			System.out.println("--------------");
			
			System.out.println("You withdrew     : "+amount);
			System.out.println("Account balance  : "+acctbalance);
			
			return acctbalance;
			
		} else
		{
			System.out.println("Invalid withdraw amount !");
			return 0;
		}
	}

	
	public synchronized double depositAmount(double amount)
	{
			acctbalance += amount; // account.balance = account.balance - amount;
		
			System.out.println("------------");
			System.out.println("Deposits:                  ");
			System.out.println("------------");
			
			System.out.println("You deposited    : "+amount);
			System.out.println("Account balance  : "+acctbalance);
			return acctbalance;
	
	}			
   
	public void run()
    {
        try {
            // Displaying the thread that is running

    		System.out.println("--------------------------------");
            System.out.println("Thread " + Thread.currentThread().getId() + " is running");
           
            // call the methods inside run()
            
            showData();
            
           
			//Scanner input = new Scanner(System.in);
           // System.out.println("Enter a deposit amount :: ");			
			//int depamount = input.nextInt();
			
            withdrawAmount(500);
            depositAmount(1000);
            
            }
        catch (Exception e) {
            // Throwing an exception
        	
            System.out.println("Exception is caught");
        }
    }
}
 
// Main Class

public class Bankdemo 
{
	
    public static void main(String[] args)
    {
        int n = 3; // Number of threads
        
        for (int i = 0; i < n; i++) {
        	
        	Accountdemo object = new Accountdemo();
            object.start();
        }
    }
}