package datastructures.arrays;

public class ArrayDSDemo {

	public static void main(String[] args) {
		
		int[] items = { -15,23,40,34,78,67,50};
		
		display(items);

	}

	private static void display(int[] items) {
		
		for (int index = 0; index < items.length; index++) {
			System.out.println("The index : "+index +" and value : "+items[index]);
		}
		
		for(int item : items) {
			System.out.println("The value : "+item);
		}
		
	}
}


