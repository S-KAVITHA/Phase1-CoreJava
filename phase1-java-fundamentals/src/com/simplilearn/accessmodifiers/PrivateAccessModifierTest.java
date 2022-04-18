package accessmodifiers;

public class PrivateAccessModifierTest {

	public static void main(String[] args) {
		
		Account account = new Account();
		
		// private property access  > // compile time error
		// System.out.println(account.id);
		// System.out.println(account.balance);
		// System.out.println(account.username);
		// System.out.println(account.password);
		// account.showBalance() //compile time error
		
		account.showUser();
		account.showId();
		
		

	}

}

class Account {
	
	// data members : properties
	private long id= 100001;
	private double balance =72362.234;
	private String username ="mike123";
	private String password= "mike@123";
	
	// private methods
	private double showBalance() {
		return balance;
	}
	
	public long showId() {
		System.out.println("The user Id :"+id);
		return id;
	}
	
	public void showUser() {
	System.out.println("The user :"+username);
	}
	
	Account() {}
	// private constructor
	// Note : Private Constructor based class can not be instantiated.
	// private Account() {}
}
