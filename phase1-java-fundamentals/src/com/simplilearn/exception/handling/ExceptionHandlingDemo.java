package exception.handling;

public class ExceptionHandlingDemo {

	public static void main(String[] args) {
		
		System.out.println("Program Initiated !");
		try {
			int balance = 2000;
			int amount = 0;
			int result = balance / amount;
			
			System.out.println("Result Avg Balance : "+result);
		} catch(Exception e) {
			System.out.println("Exception Occured and handled ! "+e.getClass());
		} finally {
			System.out.println("Always execute ! ");
		}	
		
		System.out.println("Program is Terminated !");
	}

}
