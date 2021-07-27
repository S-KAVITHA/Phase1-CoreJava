package accessmodifiersB;

// to access public Calculator in accessmodifier package. import the class.
import accessmodifiers.Calculator;

public class calcdemo {
	public static void main(String[] args) {
	
		int x=10;
		int y=20;
		
//create instance for the public class and access the public properties and methods>
	Calculator calculator = new Calculator();
	System.out.println("SUM : "+calculator.add(x,y));
	System.out.println("PRODUCT : "+calculator.product(x,y));
		
	}
	
}
