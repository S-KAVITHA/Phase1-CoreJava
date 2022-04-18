package datastructures.linkedlist.singlylinkedlist;


public class TestSiglyLinkedList {

	public static void main(String[] args) {
		
		Employee employee1= new Employee(10001, "Mike Smith", "Engineering", 634345);
		Employee employee2= new Employee(10002, "Ava Smith", "Engineering", 8934345);
		Employee employee3= new Employee(10003, "Mark Smith", "Engineering", 634345);
		Employee employee4= new Employee(10004, "William Smith", "Engineering", 134345);
		
		// create singly list instance
		SinglyLinkedList slList = new SinglyLinkedList();
		
		System.out.println("List is empty : "+slList.isEmpty());
		System.out.println("List size : "+slList.getSize());
		
		System.out.println("-----------------------");
		
		slList.add(employee1);
		slList.add(employee2);
		slList.add(employee3);
		slList.add(employee4);
		
		System.out.println("List is empty : "+slList.isEmpty());
		System.out.println("List size : "+slList.getSize());
		
		System.out.println("-----------------------");
		
		Node removedNode = slList.remove();
		
		System.out.println("Removed node :" +removedNode);
		
		slList.printList();

	}

}