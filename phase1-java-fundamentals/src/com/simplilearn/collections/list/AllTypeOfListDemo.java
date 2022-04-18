package collections.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class AllTypeOfListDemo {

	public static void main(String[] args) {
		
		// Array List
		
		List<String> listOfCompanies = new ArrayList<String>();
		listOfCompanies.add("DELL");
		listOfCompanies.add("SIMPLILEARN");
		listOfCompanies.add("WIPRO");
		listOfCompanies.add("DELL");		
		System.out.println(listOfCompanies);
		
		//Linked List
		
		List<String> listOfCities = new LinkedList<String>();
		listOfCities.add("New York");
		listOfCities.add("LA");
		listOfCities.add("New York");
		listOfCities.add("Mumbai");		
		System.out.println(listOfCities);
		
		//Vector  -> thread safe
		
		List<String>  listOfFruits = new Vector<String>();
		listOfFruits.add("Apple");
		listOfFruits.add("Orange");
		listOfFruits.add("Banana");
		listOfFruits.add("Mango");
		listOfFruits.add("Kiwi");
		System.out.println(listOfFruits);
		
		List varients = new ArrayList();
		varients.add("xyz");
		varients.add(2323);
		varients.add(55.98);
		System.out.println(varients);
	}

}