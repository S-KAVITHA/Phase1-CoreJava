package collections.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		// Set is child interface in Collection
		// Set do not store duplicate values
		// Implementation class : HashSet , LinkendHashSet, TreeSet.

		// Deceleration
		Set<String> set1 = new HashSet<String>(); // when do not want any insertion order to pres
		Set<String> set2 = new LinkedHashSet<String>(); // when want to preserve insertion order.
		Set<String> set3 = new TreeSet<String>(); // arrange set element is ascending / descending order

		// HashSet
		Set<String> setOfUniqueCompanies = new HashSet<>();
		setOfUniqueCompanies.add("DELL");
		setOfUniqueCompanies.add("CISCO");
		setOfUniqueCompanies.add("SIMPLEARN");
		setOfUniqueCompanies.add("DELL");

		System.out.println(setOfUniqueCompanies);

		// enhace for loop
		for (String compName : setOfUniqueCompanies) {
			System.out.println(compName);
		}
		System.out.println("------------------");
		// Linked HashSet
		Set<String> setOfUniqueBrands = new LinkedHashSet<>();
		setOfUniqueBrands.add("Nike");
		setOfUniqueBrands.add("Adidas");
		setOfUniqueBrands.add("Fila");
		setOfUniqueBrands.add("ASICS");
		setOfUniqueBrands.add("Nike");

		System.out.println(setOfUniqueBrands);
		// enhace for loop
		for (String brand : setOfUniqueBrands) {
			System.out.println(brand);
		}
		
		
		// TreeSet
		System.out.println("------------------");
		TreeSet<String> setOfUniqueName = new TreeSet<>();
		setOfUniqueName.add("John");
		setOfUniqueName.add("Mike");
		setOfUniqueName.add("William");
		setOfUniqueName.add("Bob");
		setOfUniqueName.add("Mark");

		System.out.println(setOfUniqueName);
		System.out.println(setOfUniqueName.descendingSet());
	}

}