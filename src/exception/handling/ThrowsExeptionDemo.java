package exception.handling;

import java.io.IOException;

public class ThrowsExeptionDemo {

	// throws : throws keyword is used to declare exception.

	// calling method.
	public static void main(String[] args) {

		try {
			ageValidator(2);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

	// method declaration age validator
	
	public static void ageValidator(int age) throws IOException {
		if (age > 20) {
			System.out.println("Valid age !");
		} else {
			throw new IOException("Not a valid age !");
		}
	}
}