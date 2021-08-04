package  collections.map;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
		
		Map<String, Long> phoneBook = new HashMap<String, Long>();
		
		phoneBook.put("John", 8989898989L);
		phoneBook.put("Mike", 8989898981L);
		phoneBook.put("Ava", 8989898982L);
		phoneBook.put("Marry", 8989898983L);
		phoneBook.put("Emma", 8989898984L);
		phoneBook.put("Xyz", 8989898985L);

		System.out.println(phoneBook);
		
		System.out.println("Find Ava Numbers : "+phoneBook.get("Ava"));
		System.out.println("Find Emma Numbers : "+phoneBook.get("Emma"));
		
		//iterate map
		for(Map.Entry<String, Long> entry : phoneBook.entrySet()) {
			System.out.println("Key : "+entry.getKey());
			System.out.println("Value : "+entry.getValue());
			System.out.println("------");
		}
		
	}

}