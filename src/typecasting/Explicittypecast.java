package typecasting;

public class Explicittypecast {
	public static void main(String[] args) {
		// Explicit typecast : does not happen automatically.
		/**
		 * Narrowing : Converts data of incompatible type 
		 * Convert data from higher range value to lower range value.
		 * double => float => long => int => short => byte.
		 */
		
		double price = 1550.77d;
		
		long bigPrice = (long) price;  // narrowing => double -> long
		
		int intPrice = (int) bigPrice;  // narrowing => long -> int
		
		short shortPrice = (short) bigPrice; // narrowing  =>  long => short
		
		byte bytePrice = (byte) price;  // narrowing => double -> byte
		
		System.out.println("Double Price  : "+price);
		System.out.println("Long Price    : "+bigPrice);
		System.out.println("Integer Price : "+intPrice);
		System.out.println("Short Price   : "+shortPrice);
		System.out.println("Byte Price    : "+bytePrice);		

	}

}
