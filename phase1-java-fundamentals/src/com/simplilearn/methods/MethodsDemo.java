package methods;

public class MethodsDemo {

	public static void main(String[] args) {
		
		// for non static 
		//MethodsDemo demo = new MethodsDemo();
		//demo.showMessage();
		//demo.displayAuthor("John Smith");
		//demo.displayDetails("john.smith@gmail.com", "Fullstack developer.");
		
		// for static methods
		MethodsDemo.showMessage();
		MethodsDemo.displayAuthor("John Smith");
		MethodsDemo.displayDetails("john.smith@gmail.com", "Fullstack developer.");
		
		
	}

	// user defined methods : 1) parameterized methods 2) non-parameterized methods

	// non-parameterized / zero params methods
	public static void showMessage() {
		System.out.println(" :: Welcome to Java methods ::");
	}

	// one parameterized method
	public static void displayAuthor(String name) {
		System.out.println(" :: @Author :: " + name);
	}

	// two parameterized method
	public static void displayDetails(String email, String description) {
		System.out.println(" :: @Author  email :: " + email +" description :"+description);
	}

}