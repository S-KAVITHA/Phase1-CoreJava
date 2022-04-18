package datastructures.bigO;

public class LinearTimeComplexity {

	public static void main(String[] args) {
		// ordered static data
		int[] items = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120 };
		
		displayAll(items);

	}

	// This method in O(n)  time complexity  => Linear Time Complexity
	private static void displayAll(int[] items) {
		for(int item: items) {
			System.out.println(item);
		}
		
	}

}