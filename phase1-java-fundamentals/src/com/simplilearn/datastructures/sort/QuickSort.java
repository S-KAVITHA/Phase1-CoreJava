package datastructures.sort;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {

		int[] inputs = { 20, 35, -15, 5, 55, 2, -18, -22, 65, 88 };

		int start = 0;
		int end = inputs.length;

		System.out.println("Before : " + Arrays.toString(inputs));
		quickSort(inputs, start, end);
		System.out.println("After : " + Arrays.toString(inputs));

	}

	private static void quickSort(int[] inputs, int start, int end) {
		
		// break recursion
		if(end-start<2) {
			return ;
		}
		
		// create a partition based on pivot
		int pivotIndex = partition(inputs,start,end);
		
		// call quickSort for first half
		quickSort(inputs, start, pivotIndex);
		
		// call quick sort for second half
		quickSort(inputs, pivotIndex+1, end);
	}

	private static int partition(int[] inputs, int start, int end) {
		
		int pivot = inputs[start];
		
		int i = start;
		int j = end;
		while(i < j ) {
			// empty body while for element greater than pivot
			while(i<j && inputs[--j] >= pivot);
			
			if(i<j) {
				inputs[i] = inputs[j];
			}
			
			// empty body while loop for element less than pivot
			while(i<j && inputs[++i] <= pivot);

			if(i<j) {
				inputs[j] = inputs[i];
			}
		}
		
		inputs[j] = pivot;
		
		return j;
	}

}