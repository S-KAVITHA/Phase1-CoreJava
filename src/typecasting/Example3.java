package typecasting;


import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {
		// string to number value (byte , short , int, long ,double , float)
      
		
// collect user input from console -> 
		
			Scanner input = new Scanner(System.in);
			System.out.println("---------------------------------------------");
			System.out.println(" :: Welcome to string -> numeric convertor :: ");
			System.out.println("---------------------------------------------");
			
			System.out.println("\n\nEnter a string vaule : ");
			String strInput = input.nextLine();
			//String strInput = "123";
		
			
			long longValue = Long.parseLong(strInput);
			byte byteValue = (byte)longValue;
			short shortValue = (short)longValue;
			int intValue  = (int)longValue;
			
			//byte byteValue = Byte.parseByte(strInput);
			//short shortValue = Short.parseShort(strInput);
			//int intValue  = Integer.parseInt(strInput);
			
			float floatValue = Float.parseFloat(strInput);
			double doubleValue = Double.parseDouble(strInput);
		
		
		System.out.println("Byte Value     : "+byteValue);
		System.out.println("Short Value    : "+shortValue);
		System.out.println("Integer Value  : "+intValue);
		System.out.println("Long Value     : "+longValue);
		System.out.println("Float Value    : "+floatValue);	
		System.out.println("Double Value   : "+doubleValue);
		
	}
}
