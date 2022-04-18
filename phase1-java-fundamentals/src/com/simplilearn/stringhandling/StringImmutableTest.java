package stringhandling;

public class StringImmutableTest {

	public static void main(String[] args) {

		// In java, string objects are immutable.
		// Immutable simply means unmodifiable or unchangeable values.
		
		String username = "John";
		
		username.concat(" Snow");
		
		// concat to string is done. print will still refer to old value because strings are immutable.
		System.out.println(username); // old name -> old string 
		
		
		
// two objects are created but user.name reference variable still refers to "John" not to "John Snow".
// explicitly assign it to the reference variable, it will refer to "John Snow" object.
		String reponse = username.concat(" Snow");
		
		username = reponse;
		
		System.out.println(reponse);
		System.out.println(username);// new name  -> new String

	}

}
