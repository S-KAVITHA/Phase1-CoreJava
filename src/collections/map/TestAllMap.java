package collections.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestAllMap {

	public static void main(String[] args) {
		
		Map<String,Double> mapOfItems = new HashMap<String, Double>();
		
		mapOfItems.put("Orange", 87.3);
		mapOfItems.put("Apple", 99.3);
		mapOfItems.put("Kiwi", 101.3);
		mapOfItems.put("Banana", 34.3);
		mapOfItems.put("Mango", 99.3);
		
		System.out.println(mapOfItems);
		System.out.println(mapOfItems.get("Kiwi"));
		
		System.out.println("----------");
		Map<String, Integer> mapOfCities = new LinkedHashMap<String, Integer>();
		
		mapOfCities.put("Alaska", 393833);
		mapOfCities.put("New Maxico", 444655);
		mapOfCities.put("Virginia", 232433);
		mapOfCities.put("Kansas", 455983);
		
		System.out.println(mapOfCities);
		
		System.out.println("------------");
		TreeMap<Integer, String> mapOfEmployees = new TreeMap<>();
		mapOfEmployees.put(105, "Marry Smith");
		mapOfEmployees.put(101, "John Smith");
		mapOfEmployees.put(102, "Mike Smith");
		mapOfEmployees.put(103, "Ava Smith");
		mapOfEmployees.put(103, "Mark Smith");
		
		System.out.println(mapOfEmployees);
		
		System.out.println(mapOfEmployees.descendingMap());
		
		

	}

}