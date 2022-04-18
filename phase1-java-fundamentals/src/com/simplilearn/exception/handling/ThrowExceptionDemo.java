package exception.handling;

import java.io.IOException;

public class ThrowExceptionDemo {

	public static void main(String[] args) {

		// throw :: throw keyword is used to throw an exception.

		ageValidator(20);
		try {
			ageValidator(10);
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}
		ageValidator(100);

		System.out.println("-----------------");
		stringValidator("John Smith");
		stringValidator(null);
		stringValidator("");
	}

	private static void ageValidator(int age) {
		if (age > 18) {
			System.out.println("Your age is a valid age, You can vote !");
		} else {
			throw new RuntimeException("Your age is a invalid age !");
		}
	}

	private static void stringValidator(String str) {
		if (str != null && str.length() > 0) {
			System.out.println("Valid String !..");
		} else {
			try {
				throw new IOException("Not a valid string");
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}
	}

}