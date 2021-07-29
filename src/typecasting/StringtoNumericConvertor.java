package typecasting;

public class StringtoNumericConvertor {
			
		public static void main(String[] args) {
			// String to numeric .
			String username = "abcd1234"; //non convertible string
			String price ="123.27";  // convertible string
			String amount ="1277";   // convertible string
			
			// string(non-primitive type)  to int (primitive type)   => Wrapper classes
			int intAmount  = Integer.parseInt(amount);
			
			double doublePrice = Double.parseDouble(price);
			
			// Non convertible string :> NumberFormatException
			// int result = Integer.parseInt(username);
			
			System.out.println("Integer Amount : "+intAmount);
			
			System.out.println("Double Price   : "+doublePrice);
			
		}
}
