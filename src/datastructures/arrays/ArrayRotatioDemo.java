package datastructures.arrays;

import java.awt.ItemSelectable;
import java.util.Arrays;

public class ArrayRotatioDemo {

	public static void main(String[] args) {
		int[] items = { -15, 20, 24, 50, 36, 26, 78, 90 };

		/*System.out.println("Before Rotation : ");
		System.out.println(Arrays.toString(items));
		rotateRight(items, 3);
		System.out.println("After Rotation : ");
		System.out.println(Arrays.toString(items));
*/
		System.out.println("-------------");
		System.out.println("Before Rotation : ");
		System.out.println(Arrays.toString(items));
		rotateLeft(items, 3);
		System.out.println("After Rotation : ");
		System.out.println(Arrays.toString(items));

	}

	// right to left
	@SuppressWarnings("unused")
	private static void rotateRight(int[] items, int cRotate) {

		if (cRotate > items.length)
			cRotate = cRotate % items.length;

		int temp[] = new int[items.length];

		// shift element into temp array.
		for (int i = 0; i < cRotate; i++) {
			temp[i] = items[items.length - cRotate + i];
		}

		System.out.println(Arrays.toString(temp));
		// rotate actual array.
		int j = 0;
		for (int i = cRotate; i < items.length; i++) {
			temp[i] = items[j];
			j++;
		}

		System.out.println(Arrays.toString(temp));
		System.arraycopy(temp, 0, items, 0, items.length);
		;
	}

	private static void rotateLeft(int[] items, int cRotate) {

		// create a new temp array
		int temp[] = new int[cRotate];

		// copy element element which need to be rotated
		for (int i = 0; i < cRotate; i++) {
			temp[i] = items[i];
		}
	System.out.println(Arrays.toString(temp));
		// shift / move actual array
		for (int i = cRotate; i < items.length; i++) {
			items[i - cRotate] = items[i];
		}
		System.out.println(Arrays.toString(items));
		// copy the temp element in actual array.
		for (int i = 0; i < cRotate; i++) {
			items[i + items.length - cRotate] = temp[i];
		}
	}
}