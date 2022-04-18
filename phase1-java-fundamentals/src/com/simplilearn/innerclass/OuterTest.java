package innerclass;

public class OuterTest {
	
	private double amount = 9234.234;
	public String message= "Today is a good day!";
	
	// non static inner class 
	class InnerTest {
		
		private String message2 = "Hello, & Welcome";
		
		public void showData() {
			System.out.println("Outer class data "+ amount);
			System.out.println("Outer class Message "+ message);
			System.out.println("Inner class Message "+ message2);
		}	
		
	}
	
	public static void main(String[] args) {
		
		// create outer class object
		OuterTest outer = new OuterTest();
		
		// create inner class object from outer reference.
		InnerTest inner = outer.new InnerTest();
		
		inner.showData();
		
		
	}

}