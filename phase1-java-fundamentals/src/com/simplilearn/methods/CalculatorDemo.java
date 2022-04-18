package methods;

import java.util.Scanner;

public class CalculatorDemo {

	public static void main(String[] args) {

		// step 1. collect input from user console
		Scanner input = new Scanner(System.in);
		System.out.println("--------------------------------");
		System.out.println(" :: Welcome to Arithmatic calulator :: ");
		System.out.println("--------------------------------");
		System.out.println(" :: Enter a number1 vaule :: ");		
		int x = input.nextInt();
		
		System.out.println(" :: Enter a number2 vaule :: ");		
		int y = input.nextInt();
		
		Calculator calculator = new Calculator();
		System.out.println("X is "+x +" Y  is "+y+ " And Addition :"+calculator.add(x, y));
		System.out.println("X is "+x +" Y  is "+y+ " And Substraction :"+calculator.sub(x, y));

		System.out.println("X is " + x + " Y  is " + y + " And Multiplication :" + Calculator.mul(x, y));
		System.out.println("X is " + x + " Y  is " + y + " And Division :" + Calculator.div(x, y));

	}

}

class Calculator {

	// add
	public float add(int num1, int num2) {
		float result = num1 + num2;
		return result;
	}

	// sub
	public float sub(int num1, int num2) {
		float result = num1 - num2;
		return result;
	}

	// div
	public static float div(int num1, float num2) {
		float result = num1 / num2;
		return result;
	}

	// mul
	public static float mul(int num1, float num2) {
		float result = num1 * num2;
		return result;
	}

	// avg
	public float avg(float num1, float num2) {
		float result = (num1 + num2) / 2;
		return result;
	}
}
