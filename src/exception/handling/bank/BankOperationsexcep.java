package exception.handling.bank;

import java.util.ArrayList;
import java.util.List;

public class BankOperationsexcep {

	public static void main(String[] args) {
		
		// account list
		List<Account> accounts = new ArrayList<Account>();
		accounts.add( new Account(10001,"Tony Stark", 9875434));
		accounts.add( new Account(10002,"Eva Smith", 9875434));
		accounts.add( new Account(10003,"Mark Zen", 9875434));
		accounts.add( new Account(10004,"Amith Sha", 9875434));
		accounts.add( new Account(10005,"Azhar Farooq", 9875434));
		accounts.add( new Account(10006,"Mike Stark", 9875434));
		
		showBalance(10003,accounts);
		showBalance(10007,accounts);
		
		System.out.println("-----------------");
		try {
			depositAmount(10003,accounts,10000);
		} catch (InvalidTxException e) {
			System.out.println(e);
		}
		
		System.out.println("-----------------");
		try {
			depositAmount(10007,accounts,0);
		} catch (InvalidTxException e) {
			System.out.println(e);
		}
	}
	
	// show balance
	private static Account showBalance(int accNo, List<Account> accounts) {
		try {
			int count = 0;
			for(Account acc: accounts) {
				if(acc.accNo==accNo) {
					System.out.println("The Account : "+acc.accNo +" & user "+ acc.name + " has balance "+acc.balance);
					count++;
					return acc;
				}
			}
			if(count==0) {
				throw new AccountNotFoundException("Account does not exist with accNo : "+accNo);
			}
		} catch (AccountNotFoundException e) {
			System.out.println(e);
		}
		return null;
	}
	
	//deposit 
	private static void depositAmount(int accNo, List<Account> accounts, int depositAmount) throws InvalidTxException {
		Account fetchedAccount = showBalance(accNo,accounts);
		if(fetchedAccount != null && depositAmount >0 ) {
			fetchedAccount.balance += depositAmount;
			showBalance(accNo,accounts);
		} else {
			throw new InvalidTxException("Invalid Deposit Amount !");
		}
	}
	//withdraw
	//calculate on balance.
	
	

}
