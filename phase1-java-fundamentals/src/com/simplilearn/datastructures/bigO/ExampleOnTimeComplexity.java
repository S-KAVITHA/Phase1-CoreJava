package datastructures.bigO;

import java.awt.DisplayMode;

public class ExampleOnTimeComplexity {

	
	public static void main(String[] args) {
		int[] items = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120 };
		
		display(items);
	}
	
	
	// This method runs in => O(1+n+1)  => O(2+n) => O(n) => Linear Time Complexity
	private static void display(int[] items) {
		System.out.println(items[0]);
		for(int item:items) {
			System.out.println(item);
		}
		System.out.println(items[5]);
	}
	
	// This method runs in O(1+n+1+n) => O(2+2n)  => O(n) => Linear Time Complexity
	@SuppressWarnings("unused")
	private static void displayATwice(int[] items) {
		System.out.println(items[0]);
		
		for(int item:items) {
			System.out.println(item);
		}
		
		System.out.println(items[5]);
		
		int index=0;
		while(index<items.length) {
			System.out.println(items[index]);
			index++;
		}
	}
	
	// This method runs in O(1+n/2+1) => O(2+n/2) => O(n)
	private static void displayA(int[] items) {
		System.out.println(items[0]);
		int index=0;
		while(index<items.length/2) {
			System.out.println(items[index]);
			index++;
		}
		System.out.println(items[5]);
	}
}