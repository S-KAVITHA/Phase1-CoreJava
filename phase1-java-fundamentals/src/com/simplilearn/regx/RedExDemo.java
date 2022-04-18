package regx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RedExDemo {

	public static void main(String[] args) {
		
		// step1 : defined a data string.
		String data = "Pn";
		
		// step2 : defined a pattern
		Pattern pattern = Pattern.compile(".n");
		
		//step3 : defined a matcher
		Matcher matcher = pattern.matcher(data);
		
		// step4 : match the pattern
		boolean result = matcher.matches();
		
		System.out.println("Result : "+result);
		
		
		// shorter syntax 
		boolean result2 = Pattern.compile(".n").matcher(data).matches();
		System.out.println("Result2 : "+result2);
		
		// shortest syntax
		boolean result3 = Pattern.matches(".n", data);
		System.out.println("Result3 : "+result3);

	}

}