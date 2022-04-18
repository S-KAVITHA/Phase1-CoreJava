package methods.bank;

public class BankOperations {

	// can pass the object as a parameter to a method:
	public double showBalance(Account account) {
		System.out.println("The account " + account.accNo + " has Balance : "+account.balance);
		return account.balance;
	}
	
	public double withdrawAmount(Account account, double amount) {
		if(amount>0 || amount<account.balance) {
			account.balance -= amount; // account.balance = account.balance - amount;
			return account.balance;
		} else {
			System.out.println("Invalid withdraw amount !");
			return 0;
		}
		
	}
}