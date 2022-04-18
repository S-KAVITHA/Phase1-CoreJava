package collections.queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {

		// Queue is a data structure which works in first in first out order.

		Queue<String> peopleQueue = new ArrayDeque<>();

		peopleQueue.add("John");
		peopleQueue.add("Mike");
		peopleQueue.add("William");
		peopleQueue.add("David");
		peopleQueue.add("Jeet");
		
		// peek element
		System.out.println("Head : " + peopleQueue.peek());
		System.out.println("Head : " + peopleQueue.element());

		// print and remove from queue
		System.out.println("Removed Head : " + peopleQueue.poll());
		System.out.println("Head : " + peopleQueue.element());

		// iterate over queue
		for (String person : peopleQueue) {
			System.out.println("Name : " + person);
		}
		
		
		System.out.println("------------------");
		// PriorityQueue : does not maintains the FIFO order.
		Queue<String> banKQueue = new PriorityQueue<String>();
		banKQueue.add("John");
		banKQueue.add("Smith");
		banKQueue.add("Parul");
		banKQueue.add("Jeet");
		banKQueue.add("Mike");

		// iterate over queue
		for (String person : banKQueue) {
			System.out.println("Data : " + person);
		}
		
		
		System.out.println("------------------");
		Deque<Integer> dequeue = new ArrayDeque<Integer>();
		
		dequeue.add(100);
		dequeue.add(200);
		dequeue.add(300);
		dequeue.add(400);
		
		dequeue.addFirst(90);
		
		dequeue.addLast(500);
		
		for(Integer elem : dequeue) {
			System.out.println("Element : "+elem);
		}
	}

}