package methods.bank;

public class Account {
	
	long accNo;
	double balance;
	String userName;
	String bankName;
	
	// constructor
	Account(){ }
	
	// one parameter constructor
	Account(long accNo){
		this.accNo = accNo;
	}
	
	Account(long accNo,double balance){
		this.accNo = accNo;
		this.balance = balance;
	}
	
	Account(long accNo,double balance,String userName, String bankName){
		this.accNo = accNo;
		this.balance = balance;
		this.userName = userName;
		this.bankName = bankName;
	}
	
	
}