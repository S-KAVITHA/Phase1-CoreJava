package multithreading;

class Customer {

	double balance = 1000.0;

	synchronized void deposit(double amount) {
		System.out.println(" Going to deposit ...");
		balance += amount; // balance = balance+amount;
		System.out.println(" Deposit completed ! &  new balance : " + balance);

		notify();
	}

	synchronized void withdraw(double amount) {
		if (balance < amount) {
			System.out.println("Insufficient funds ! ");
			try {
				wait(20000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} else {
			balance -= amount;
			System.out.println("Withdraw is completed ! & new balance : " + balance);
		}
	}

	synchronized void showBalance() {
		System.out.println("The account balance : " + balance);
	}
}

public class ThreadWithWait {

	public static void main(String[] args) {

		// create customer object
		Customer customer = new Customer();

		// create thread for bank operations
		Thread t1 = new Thread(() -> {
			customer.withdraw(3000);
		});

		Thread t2 = new Thread(() -> {
			customer.showBalance();
		});

		Thread t3 = new Thread(() -> {
			customer.deposit(50000);
		});

		t1.start();
		t2.start();
		t3.start();
	}

}
