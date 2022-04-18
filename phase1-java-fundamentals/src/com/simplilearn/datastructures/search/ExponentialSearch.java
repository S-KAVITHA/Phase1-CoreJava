package datastructures.search;

import java.util.Arrays;

public class ExponentialSearch {

	public static void main(String[] args) {

		int[] inputs = { -22, -15, -3, -1, 5, 9, 20, 35, 55 };

		// search value
		int value = 55;

		int searchIndex = exponentialSearch(inputs, value);

		if (searchIndex >= 0)
			System.out.println("The Element : " + value + " is found at index : " + searchIndex);
		else
			System.out.println("Element does not exist.");
	}

	// Best time complexity O(1) and worst time complexity is O(log2 n)
	private static int exponentialSearch(int[] inputs, int value) {

		// start with 0 index -> if search value present at index 0.
		if (inputs[0] == value) {
			return 0;
		}

		// 2. doubling method
		int i = 1;
		while (i < inputs.length && inputs[i] <= value) {
			i = i * 2;
		}

		// 3. binary search
		return Arrays.binarySearch(inputs, i / 2, Math.min(i, inputs.length), value);

	}

}