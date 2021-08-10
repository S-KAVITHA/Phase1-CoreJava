package multithreading.exercise;

// Accountthread class implements Runnable interface.


public class Accountthread implements Runnable
{
	
	Account account = new Account(); //create object for Account class.
		
	// @Override run method to call the Account class methods with the object.
	public void run() 
	{
		
		account.showData();
		account.withdrawAmount(100);
		account.depositAmount(2000);
	}
}
