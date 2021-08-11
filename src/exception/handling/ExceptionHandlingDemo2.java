package exception.handling;

public class ExceptionHandlingDemo2 {

	static int balance = 1000;

	public static void main(String[] args) {

		trasaction(10);
		trasaction(0); // Exception Occurred and handled.
		trasaction(20);
		trasaction(50);

		System.out.println("----------");
		strLenghtCalculator("Hello");
		strLenghtCalculator(null);
		strLenghtCalculator("Today is a good day!");
		
		System.out.println("----------");
		numberConvertor("45345");
		numberConvertor("45345abc");
		numberConvertor("98745");
	}

	private static void trasaction(int amount) {
		try {
			float result = balance / amount;
			System.out.println(" Result Amount :> " + result);
		} catch (ArithmeticException e) {
			System.out.println("Exception Occures : " + e.getClass());
			System.out.println("Exception Message : " + e.getMessage());
		}
	}

	private static void strLenghtCalculator(String str) {
		try {
			int length = str.length();
			System.out.println("Input String length : " + length);
		} catch (NullPointerException e) {
			System.out.println("Exception Occures : " + e.getClass());
			System.out.println("Exception Message : " + e.getMessage());
		}

	}
	
	private static void numberConvertor(String input) {
		try {
			int result = Integer.parseInt(input);
			System.out.println("Interger Result :> "+result);
		} catch (NumberFormatException e) {
			System.out.println("Exception Occures : " + e.getClass());
			System.out.println("Exception Message : " + e.getMessage());
		}		
		
	}
}