package regx;

import java.util.regex.Pattern;

public class RegExPatternExample2 {

	public static void main(String[] args) {
		
		// one char match sequence
		System.out.println(Pattern.matches("[xyz]", "a"));  // false -> it matches one value out of x,y,z
		System.out.println(Pattern.matches("[xyz]", "x"));  // true -> it matches one value out of x,y,z
		System.out.println(Pattern.matches("[xyz]", "xy"));  // false -> it matches one value out of x,y,z
		System.out.println(Pattern.matches("[xyz]", "xyz"));  // false -> it matches one value out of x,y,z		
		System.out.println(Pattern.matches("[xyz]", "y"));  // true -> it matches one value out of x,y,z
		System.out.println(Pattern.matches("[xyz]", "X"));  // false -> it matches one value out of x,y,z
		
		System.out.println(Pattern.matches("[xyz][xyz]", "xy"));  // true -> it matches one value out of x,y,z
		System.out.println(Pattern.matches("[xyz][xyz][xyz]", "xyz"));  // true -> it matches one value out of x,y,z
		
		System.out.println("-----------------------");
		// more than one char sequence match
		System.out.println(Pattern.matches("[xyz]+", "xy"));  // true -> it matches one or more than one value out of x,y,z
		System.out.println(Pattern.matches("[xyz]+", "xyz"));  // true -> it matches one or more than one value out of x,y,z

		System.out.println("-----------------------");
		System.out.println(Pattern.matches("[xyz]?", "x"));  // true -> it matches one or zero value match out of x,y,z
		System.out.println(Pattern.matches("[xyz]?", ""));  // true -> it matches one or zero value match out of x,y,z
		System.out.println(Pattern.matches("[xyz]?", "xy"));  // false -> it matches one or zero value match out of x,y,z
		System.out.println(Pattern.matches("[xyz]?", "pqr"));  // false -> it matches one or zero value match out of x,y,z
		
		System.out.println("-----------------------");
		System.out.println(Pattern.matches("[xyz]*", "x"));  // true -> it matches zero or more value match out of x,y,z
		System.out.println(Pattern.matches("[xyz]*", ""));  // true -> it matches zero or more value match out of x,y,z
		System.out.println(Pattern.matches("[xyz]*", "azhar"));  // false -> it matches zero or more value match out of x,y,z

		
	}

}