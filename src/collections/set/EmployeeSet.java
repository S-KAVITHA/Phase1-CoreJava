package collections.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class EmployeeSet {

	public static void main(String[] args) {
		
		Employee employee1 = new Employee(1001, "John Smith", "Engineering", 9834.234f);
		Employee employee2 = new Employee(1002, "Marry Smith", "Engineering", 239834.234f);
		Employee employee3 = new Employee(1003, "David Miller", "Operations", 349834.234f);
		Employee employee4 = new Employee(1004, "Mark joes", "HR", 239834.234f);
		Employee employee5 = new Employee(1005, "Tony Stark", "HR", 239834.234f);
		
		Set<Employee> employees = new LinkedHashSet<>();
		
		//insert
		employees.add(employee1);
		employees.add(employee2);
		employees.add(employee3);
		employees.add(employee4);
		
		System.out.println(employees);
		
		// enhanced for loop
		for(Employee emp : employees) {
			System.out.println(emp.id);
			System.out.println(emp.name);
			System.out.println(emp.dept);
			System.out.println(emp.salary);
			System.out.println("---------");
		}

	}

}