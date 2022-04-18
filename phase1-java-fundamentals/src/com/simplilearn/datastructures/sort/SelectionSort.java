package       datastructures.sort;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		
		int[] inputs = {20, 35, -15, 5,55,2,-18};
		
		System.out.println("Before : "+Arrays.toString(inputs));
		selectionSort(inputs);
		System.out.println("After : "+Arrays.toString(inputs));

	}

	// Worst time complexity O(n^2).
	private static void selectionSort(int[] inputs) {
		
		// iterate over unsorted partition
		for (int lastUnsortedIndex = inputs.length-1 ; lastUnsortedIndex > 0 ; lastUnsortedIndex--) {
			int largest =0;
			for(int i=1; i<=lastUnsortedIndex; i++) {
				if(inputs[i]>inputs[largest])
				 largest = i;
			}
			swap(inputs,largest,lastUnsortedIndex);
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