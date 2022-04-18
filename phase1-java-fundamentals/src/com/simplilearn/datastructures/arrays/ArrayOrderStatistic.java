package datastructures.arrays;

import java.util.Arrays;

public class ArrayOrderStatistic {

	public static void main(String[] args) {
		// identify kth smallest & largest element.

		int[] items = { -15, 20, 24, 50, 26, 78, 90 };
		// kth smallest element
		// kth largest element
		int pos = 3;

		int result = findKthSmallest(items, pos);		
		System.out.println("The pos "+pos+" based smallest element "+result);
		
		int result2 = findKthlargest(items, pos);		
		System.out.println("The pos "+pos+" based largest element "+result2);

	}

	private static int findKthSmallest(int[] items, int pos) {

		// sort array in ascending order.
		Arrays.sort(items);
		
		// return kth smallest.
		return items[pos-1];
	}

	private static int findKthlargest(int[] items, int pos) {

		// sort array in ascending order.
		Arrays.sort(items);
		
		System.out.println(Arrays.toString(items)); //[-15, 20, 24, 26, 50, 78, 90]
		// return kth largest.		
		return items[items.length-pos];
	}

}