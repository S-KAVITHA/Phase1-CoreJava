package collections.list.employee;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EmployeeList {

	public static void main(String[] args) {
		
		Employee employee1 = new Employee(1001, "John Smith", "Engineering", 9834.234f);
		Employee employee2 = new Employee(1002, "Marry Smith", "Engineering", 239834.234f);
		Employee employee3 = new Employee(1003, "David Miller", "Operations", 349834.234f);
		Employee employee4 = new Employee(1004, "Mark joes", "HR", 239834.234f);
		Employee employee5 = new Employee(1005, "Tony Stark", "HR", 239834.234f);
		
		// create list of employee
		List<Employee> listOfEmployees = new ArrayList<Employee>();
		
		// insert
		listOfEmployees.add(employee3);
		listOfEmployees.add(employee1);
		listOfEmployees.add(employee2);
		
		
		// insert data at index
		listOfEmployees.add(0, employee4);
		
		// replace 
		listOfEmployees.set(1, employee5);
		System.out.println(listOfEmployees);
		
		System.out.println("---");
		//iterate over list
		Iterator<Employee> itr = listOfEmployees.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("---");
		for(Employee emp : listOfEmployees) {
			System.out.println(emp);
		}
		
		
		listOfEmployees.get(0).name ="Noman";
		
		System.out.println("---");
		for(Employee emp : listOfEmployees) {
			System.out.println(emp.name);
		}

	}

}