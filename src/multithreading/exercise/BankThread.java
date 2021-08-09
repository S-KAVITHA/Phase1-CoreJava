package multithreading.exercise;

public class BankThread {

	public static void main(String args[])
	{
		Accountthread acctthread = new Accountthread();
		Thread first = new Thread(acctthread);
		Thread second = new Thread(acctthread);
		Thread third = new Thread(acctthread);
		
		first.start();
		second.start();
		third.start();
		
		
	}
	
	
}
