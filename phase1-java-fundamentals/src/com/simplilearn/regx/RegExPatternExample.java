package regx;

import java.util.regex.Pattern;

public class RegExPatternExample {

	public static void main(String[] args) {
		
		System.out.println(Pattern.matches(".n", "Yn"));  // true -> 1st char can be any value but 2nd char should be 'n'
		System.out.println(Pattern.matches(".m", "Hmm"));  // false -> only two char allowed
		System.out.println(Pattern.matches(".m", "Hx"));  // false -> 2nd char should be 'm'
		System.out.println(Pattern.matches("..m", "Ynm"));  // true -> 1st & 2nd char can be any value but 3rd char should be 'm'
		System.out.println(Pattern.matches("..m", "Ynx"));  // false -> 1st & 2nd char can be any value but 3rd char should be 'm'
		System.out.println(Pattern.matches("n.", "nY"));  // true -> 2nd char can be any value but 1st char should be 'n'
		System.out.println(Pattern.matches("n..", "nYx"));  // true
		System.out.println(Pattern.matches(".n.", "YnY"));  // true -> 2nd should be 'n' remaining can be anything	
		
	}

}