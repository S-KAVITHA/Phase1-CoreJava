package datastructures.queue.arraysqueque;



public class ArrayQueue {

	private Employee[] queue;
	private int front;
	private int rear;

	public ArrayQueue(int capacity) {
		queue = new Employee[capacity];
	}

	// size
	public int size() {
		return rear - front;
	}

	// capacity
	public int capacity() {
		return queue.length;
	}

	// add => add element
	public void add(Employee data) {
		// queue is full -> auto growable
		if (rear == queue.length) {
			// double the size of stack
			Employee[] newArr = new Employee[2 * queue.length];
			System.arraycopy(queue, 0, newArr, 0, queue.length);
			queue = newArr;
		}
		// add value in queue
		queue[rear++] = data;
	}

	// remove => remove data from front end in queue
	public Employee remove() {
		// verify for stack empty
		if (size() == 0) {
			rear = 0;
			front = 0;
			return null;
		}
		Employee removedNode = queue[front];
		queue[front] = null;
		front++;
		return removedNode;
	}

	// peek -> print the top
	public Employee peek() {
		// verify fo stack empty
		if (size() == 0) {
			rear = 0;
			front = 0;
			return null;
		}
		return queue[front];
	}

	// print stack
	public void printQueue() {
		System.out.println(" front  => ");
		for (int i = front; i < rear; i++) {
			System.out.println(queue[i]);
		}
		System.out.println(" <= rear ");
	}
}