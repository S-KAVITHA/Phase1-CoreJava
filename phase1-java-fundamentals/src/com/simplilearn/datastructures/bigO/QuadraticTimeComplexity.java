package datastructures.bigO;

public class QuadraticTimeComplexity {

	public static void main(String[] args) {

		int[] items = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120 };

		displayAllPairs(items);
		
		displayAllPairsThree(items);
	}

	// This method runs in O(n * n) => O(n^2) -> Quadratic Time Complexity
	private static void displayAllPairs(int[] items) {

		for (int first : items) {
			for (int second : items) {
				System.out.println(first + "  " + second);
			}
		}

	}
	// This method run in O(n*n*n)  => O(n^3) => O(n^2) => Exponential / Quadratic Time Complexity
	private static void displayAllPairsThree(int[] items) {

		for (int first : items) {
			for (int second : items) {
				for (int third : items) {
					System.out.println(first + "  " + second +" "+third);
				}
			}
		}

	}

}