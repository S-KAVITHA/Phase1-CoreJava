package datastructures.linkedlist;

import java.util.LinkedList;

public class LinkedListDemo {
	
	public static void main(String[] args) {
		
		Employee employee1= new Employee(10001, "Mike Smith", "Engineering", 634345);
		Employee employee2= new Employee(10002, "Ava Smith", "Engineering", 8934345);
		Employee employee3= new Employee(10003, "Mark Smith", "Engineering", 634345);
		Employee employee4= new Employee(10004, "William Smith", "Engineering", 134345);
		
		LinkedList<Employee> emLinkedList = new LinkedList<>();
		emLinkedList.add(employee1);
		emLinkedList.add(employee2);
		
		emLinkedList.addFirst(employee3);
		emLinkedList.addLast(employee4);
		
		System.out.println(emLinkedList );
	}
}