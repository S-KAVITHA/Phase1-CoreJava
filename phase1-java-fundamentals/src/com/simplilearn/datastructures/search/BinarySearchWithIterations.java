package datastructures.search;

public class BinarySearchWithIterations {

	public static void main(String[] args) {
		
		int[] inputs = {-22,-15,-3,-1,7,9,20,35,55};
		
		//search value.
		int value = -1;
		
		int searchIndex = binarySearch(inputs,value);
		if(searchIndex>=0)
		System.out.println("The Element : "+value +" is found at index : "+searchIndex);
		else
		System.out.println("Element does not exist.");

	}

	// This methods runs in : Logarithmic Time Complexity O(log n) 
	private static int binarySearch(int[] inputs, int value) {
		
		int start =0;
		int end = inputs.length-1;
		
		while(start<=end) {
			// middpoint
			int middpoint = (start+ end) / 2;
			
			// midpoint is the search value
			if(inputs[middpoint]==value) {
				return middpoint;
			}
			// search in righ half
			else if(inputs[middpoint] < value) {
				start = middpoint+1;
			}
			// search in left half
			else {
				end= middpoint-1;
			}
			
		}	
		return -1;
	}

}