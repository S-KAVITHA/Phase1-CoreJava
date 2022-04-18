package regx;

import java.util.regex.Pattern;

public class RegExPatterRealExample {

	public static void main(String[] args) {
		
		// WA pattern for that accepts alphanumeric characters only for username.
		String username = "azhar705";
		String regex1 = "[a-zA-Z0-9]+";
		
		System.out.println(Pattern.matches(regex1, username));	
		
		
		// WA pattern  for that accepts alphanumeric characters  but only of length 10.
		String username2 = "wahid74747";
		String regex2 = "[a-zA-Z0-9]{10}";
		System.out.println(Pattern.matches(regex2, username2));	
		
		
		// WA pattern for firstName where only small alphabets allowed up to 6 char
		String firstName ="eva";
		String regex3 = "[a-z]{0,6}";
		System.out.println(Pattern.matches(regex3, firstName));	
		
		// WA pattern for email where only small alphabets with number allowed up to 15 char
		String email = "azhar12gmailcom";
		String regex4 = "[a-z0-9]{0,15}";
		System.out.println(Pattern.matches(regex4, email));		
		
		// WA pattern for email where only small alphabets with number and @ special allowed up to 15 char
		String email2 = "azhar##12@gmail.com";
		String regex5 = "\\a[a-z0-9_!#$%&'*+/=?`{|}~^.-]+@[A-Z0-9.-]+";
		System.out.println(Pattern.matches(regex5, email2));

	}

}