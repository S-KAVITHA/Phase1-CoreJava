
package multithreading.exercise;

class Account {
	 
	// properties & methods
		Long acctNumber = 10023456L ;
		String acctName = "Joe Thomas";
		double acctbalance = 500d ;
		
		// showBalance, Withdraw , deposit etc.
		
		public void showData()
		{
			System.out.println("-------------------------------------------------------");
			System.out.println("            :Account details:       ");
			System.out.println("-------------------------------------------------------");
			
			System.out.println("Account Number  :  "+ acctNumber);
			System.out.println("Account Name    :  "+ acctName);
			System.out.println("Account Balance :  "+ acctbalance);
		}	
		
		/*public double withdrawAmount(double amount)
		{
			if(amount>0 || amount<acctbalance) 
			{
				acctbalance -= amount; // account.balance = account.balance- amount;
				
				System.out.println("-------------------------------------------------------");
				System.out.println("            :Withdrawal:            ");
				System.out.println("-------------------------------------------------------");
				
				System.out.println("You withdrew     : "+amount);
				System.out.println("Account balance  : "+acctbalance);
				
				return acctbalance;
				
			} else
			{
				System.out.println("Invalid withdraw amount !");
				return 0;
			}
		}*/
	
		
		/*//public double depositAmount(double amount)
		{
				acctbalance += amount; // account.balance = account.balance - amount;
			
				System.out.println("-------------------------------------------------------");
				System.out.println("            :Deposits:              ");
				System.out.println("-------------------------------------------------------");
				
				System.out.println("You deposited    : "+amount);
				System.out.println("Account balance  : "+acctbalance);
				return acctbalance;
		}*/
	 }




