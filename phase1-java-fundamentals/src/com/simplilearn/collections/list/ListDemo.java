package collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class ListDemo {

	public static void main(String[] args) {
		
		// List  -> Order collection of data with duplicates elements.
		// List (interface) ->  imp classes -> ArrayList, LinkedList , Vector , Stack
		
		// delecration
		List<String> list1 = new ArrayList<String>();  // backed by dynamic array, not thread safe, read operations
		List<String> list2 = new LinkedList<String>();  //backed by doubly linkedlist ,not thread safe, -> insert, delete,replace
		List<String> list3 = new Vector<String>();  // thread safe collection
		List<String> list4 = new Stack<String>();   // thread safe collection
		
		List<String> namesList = new Vector<String>();
		namesList.add("Bob");
		namesList.add("Mike");
		namesList.add("John");
		namesList.add("Bob");
		namesList.add("Mark");
		
		System.out.println(namesList);
		System.out.println("The element at index 2 : "+namesList.get(2));
		
		System.out.println("----------------");
		namesList.add(2, "Mark");
		System.out.println(namesList);
		System.out.println("The element at index 2 : "+namesList.get(2));
		
		System.out.println("----------------");
		// iteration  on list
		Iterator<String> itr = namesList.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("----------------");
		// enhanced for loop
		for(String name : namesList) {
			System.out.println(name);
		}
		
		System.out.println("----------------");
		// counter for loop
		for(int index=0 ; index< namesList.size() ; index++) {
			System.out.println("The index " + index + " and name : "+namesList.get(index));
		}
	}

}
