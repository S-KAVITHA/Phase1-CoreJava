package datastructures.linkedlist.singlylinkedlist;

public class SinglyLinkedList {
	
	// head node
	private Node head;
	private int size;
	
	//linked list operations
	
	// size
	public int getSize() {
		return size;
	}
	
	// isEmpty
	public boolean isEmpty() {
		return head == null;
	}
	
	// add element
	public void add(Employee data) {
		// create a node
		Node node = new Node(data);
		// set next node reference
		node.setNext(head);
		// set head as new node.
		head = node;
		size++;
	}
	
	// remove element
	public Node remove() {
		// verify linked empty
		if(isEmpty()) {
			return null;
		}
		// set removed node
		Node removedNode = head;
		// set next node in the list as head
		head = head.getNext();
		size--;
		
		//nullify the removed node
		removedNode.setNext(null);
		return removedNode;		
	}
	
	// print list
	public void printList() {
		
		Node current = head;
		System.out.println("Head -> ");
		while(current != null) {
			System.out.println(current.getData());
			System.out.println("=>");
			current = current.getNext();
		}
		System.out.println("Null");
	}
	
	
}