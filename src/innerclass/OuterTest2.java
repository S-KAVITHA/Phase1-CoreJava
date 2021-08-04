package innerclass;

public class OuterTest2 {
	
	private static double amount = 9234.234;
	public static String message= "Today is a good day!";
	
	// static inner class 
	static class InnerTest {
		
		private String message2 = "Hello, & Welcome";
		
		public void showData() {
			System.out.println("Outer class data "+ amount);
			System.out.println("Outer class Message "+ message);
			System.out.println("Inner class Message "+ message2);
		}
		
		InnerTest(){}
		
	}
	
	public static void main(String[] args) {

		// create inner class object from outer reference.
		InnerTest inner = new OuterTest2.InnerTest();
		
		inner.showData();
		
		
	}

}