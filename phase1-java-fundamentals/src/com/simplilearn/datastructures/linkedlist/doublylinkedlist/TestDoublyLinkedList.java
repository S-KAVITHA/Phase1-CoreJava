package datastructures.linkedlist.doublylinkedlist;


public class TestDoublyLinkedList {

	public static void main(String[] args) {
		
		Employee employee1= new Employee(10001, "Mike Smith", "Engineering", 634345);
		Employee employee2= new Employee(10002, "Ava Smith", "Engineering", 8934345);
		Employee employee3= new Employee(10003, "Mark Smith", "Engineering", 634345);
		Employee employee4= new Employee(10004, "William Smith", "Engineering", 134345);
		
		// create singly list instance
		DoublyLinkedList dlList = new DoublyLinkedList();
		
		System.out.println("List is empty : "+dlList.isEmpty());
		System.out.println("List size : "+dlList.getSize());
		
		System.out.println("-----------------------");
		dlList.addToFront(employee1);
		dlList.addToFront(employee2);
		dlList.addToFront(employee3);
		dlList.addToEnd(employee4);
		
		dlList.removeFromFront();
		dlList.removeFromEnd();
		
		System.out.println("List is empty : "+dlList.isEmpty());
		System.out.println("List size : "+dlList.getSize());
		
		System.out.println("-----------------------");
		
		dlList.printList();

	}

}
