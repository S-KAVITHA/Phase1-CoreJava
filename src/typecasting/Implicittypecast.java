package typecasting;

public class Implicittypecast 
{
	
	public static void main(String[] args) {
		// Implicit Typecast : Automatically type cast.
			/**
			 * Widening Typecast : Converts data from lower range value to higher range type.
			 * byte  -> short  -> int  -> long -> float  -> double.
			 */
	         byte smallCount = -128;   // -128 to 127  => 1 byte = 8bit
	         
	         int intCount = smallCount; // widening => byte -> int
	         
	         long bigCount = intCount; // widening => int => long
	         
	              	         
	         float floatCount = intCount; // widening => int => float
	         
	         double decimalCount = bigCount;  // widening => long => double
	         
	         float fCount= bigCount; // widening => long => float
	         
	         System.out.println("Byte Count    : " + smallCount) ;
	         System.out.println("Intger Count  : " + intCount) ;
	         System.out.println("Long Count    : " + bigCount) ;
	         System.out.println("Float Count   : " + floatCount) ;
	         System.out.println("Float2 Count  : " + fCount) ;
	         System.out.println("Double Count  : " + decimalCount) ;  

		}
}
