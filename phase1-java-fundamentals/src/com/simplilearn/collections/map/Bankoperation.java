package collections.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class Bankoperation 
{

	public static void main(String[] args) 
	{
		
		Account account1 = new Account(1001, "Ava green", 788987.24);
		Account account2 = new Account(1002, "Jeet Kumar", 7898987.24);
		Account account3 = new Account(1003, "Emma Kim", 5468987.24);
		Account account4 = new Account(1004, "David Miller", 898987.24);
		Account account5 = new Account(1005, "Tony Stark", 5678987.24);
		
		Map<Long, Account> accountMap = new LinkedHashMap<Long, Account>();
		
		accountMap.put(7000001L, account1);
		accountMap.put(7000002L, account2);
		accountMap.put(7000003L, account3);
		accountMap.put(7000004L, account4);
		accountMap.put(7000005L, account5);
		
		
		accountMap.remove(7000003L);
		
		for(Map.Entry<Long, Account> entry : accountMap.entrySet()) {
			System.out.println("-----------------");
			System.out.println("Account Number : "+entry.getKey());
			System.out.println("Account Details : "+entry.getValue());
		}

		System.out.println(accountMap.get(7000001L));
		
		showbalance(accountMap);
	}

	
	public void showbalance(Map.Entry<Long, Account> accountMap)
	{}
}
