package datastructures.sort;

import java.util.Arrays;

public class BubbleSort {
	
	
	public static void main(String[] args) {
		
		int[] inputs = {20, 35, -15, 5,55,2,-18};
		
		System.out.println("Before : "+Arrays.toString(inputs));
		bubbleSort(inputs);
		System.out.println("After : "+Arrays.toString(inputs));
	}

	// Worst time complexity is : O(n^2)
	private static void bubbleSort(int[] inputs) {
		// outer for loop for iterating over unsorted portion.
		for (int lastUnsortedIndex = inputs.length-1 ; lastUnsortedIndex > 0 ; lastUnsortedIndex--) {
			for (int i = 0; i < lastUnsortedIndex; i++) {
				if(inputs[i]> inputs[i+1]) {
					swap(inputs,i , i+1);
				}
			}
		}
		
	}
	
	
	private static void swap(int[] inputs, int a, int b) {
		if(a==b) {
			return;
		}
		int tmp = inputs[a];
		inputs[a] = inputs[b];
		inputs[b] =  tmp;;
		
	}
	
}