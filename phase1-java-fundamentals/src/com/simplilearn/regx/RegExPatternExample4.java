package regx;

import java.util.regex.Pattern;

public class RegExPatternExample4 {
	
	public static void main(String[] args) {
		
		
		System.out.println(Pattern.matches("[a-z]*", "azhar"));  // true -> it matches zero or more value match out of a-z
		System.out.println(Pattern.matches("[a-z]*", "x"));  // true -> it matches zero or more value match out of a-z
		System.out.println(Pattern.matches("[a-z]*", ""));  // true -> it matches zero or more value match out of a-z
		
		System.out.println(Pattern.matches("[a-z]+", "x"));  // true -> it matches one or more value match out of a-z
		System.out.println(Pattern.matches("[a-z]+", ""));  // false -> it matches one or more value match out of a-z
		System.out.println(Pattern.matches("[a-z]+", "pqr"));  // true -> it matches one or more value match out of a-z
		System.out.println(Pattern.matches("[a-z]+", "azhar"));  // true -> it matches one or more value match out of a-z
		
		System.out.println(Pattern.matches("[A-Z]+", "x"));  // false -> it matches one or more value match out of A-Z
		System.out.println(Pattern.matches("[A-Z]+", "XYZ"));  // true -> it matches one or more value match out of A-Z
		System.out.println(Pattern.matches("[A-Z]+", "XYZ123"));  // false -> it matches one or more value match out of A-Z
		System.out.println(Pattern.matches("[A-Z]+", "xxXYZ"));  // false -> it matches one or more value match out of A-Z
		
		System.out.println("-----");
		System.out.println(Pattern.matches("[a-zA-Z]+", "mknPQR"));  // true -> it matches one or more value match out of a-zA-Z
		System.out.println(Pattern.matches("[a-zA-Z0-9]+", "mknPQR123"));  // true -> it matches one or more value match out of a-zA-Z
		System.out.println(Pattern.matches("[a-zA-Z0-9]+", "mkn"));  // true -> it matches one or more value match out of a-zA-Z
		System.out.println(Pattern.matches("[a-zA-Z0-9]+", "1213"));  // true -> it matches one or more value match out of a-zA-Z
	
		System.out.println("-----");
		System.out.println(Pattern.matches("\\d", "mkd"));  // false (only digit 0-9)
		System.out.println(Pattern.matches("\\d", "1"));  // one match true (only digit 0-9)
		System.out.println(Pattern.matches("\\d+", "1323"));  // true (only digit 0-9)
		System.out.println(Pattern.matches("\\D", "p"));  // true (no digit 0-9)
		System.out.println(Pattern.matches("\\D", "8"));  // false (no digit 0-9)
		System.out.println(Pattern.matches("\\D+", "pmker"));  // true (no digit 0-9)
	}
}