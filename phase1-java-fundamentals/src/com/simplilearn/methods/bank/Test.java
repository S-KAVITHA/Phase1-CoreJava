package methods.bank;

public class Test {

	public static void main(String[] args) {
		
		BankOperations operations = new BankOperations();
		
		Account account = new Account(1000001, 5000, "John Smith", "Iron Bank");
		
		operations.showBalance(account);
		operations.withdrawAmount(account, 3000);
		operations.showBalance(account);

	}

}
