package multithreading.exercise;


public class Accountthread implements Runnable
{
	
		Account account = new Account();
		


	@Override
	public void run() {
		
		account.showData();
	}
}
