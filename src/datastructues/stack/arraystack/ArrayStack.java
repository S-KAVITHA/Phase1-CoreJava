package datastructues.stack.arraystack;

import java.util.EmptyStackException;

public class ArrayStack {

	private Employee[] stack;
	private int top;

	// create stack
	public ArrayStack(int capacity) {
		stack = new Employee[capacity];
	}

	// capacity
	public int capacity() {
		return stack.length;
	}

	// size
	public int size() {
		return top;
	}

	// is empty
	public boolean isEmpty() {
		return top == 0;
	}

	// push => add element
	public void push(Employee data) {
		// stack is full -> auto growable
		if (top == stack.length) {
			// double the size of stack
			Employee[] newArr = new Employee[2 * stack.length];
			System.arraycopy(stack, 0, newArr, 0, stack.length);
			stack = newArr;
		}
		// add value in stack
		stack[top++] = data;
	}

	// pop => remove data from top
	public Employee pop() {
		// verify for stack empty
		if (isEmpty()) {
			throw new EmptyStackException();
		}
		Employee removedNode = stack[--top];
		stack[top] = null;
		return removedNode;
	}

	// peek -> print the top
	public Employee peek() {
		// verify fo stack empty
		if (isEmpty()) {
			throw new EmptyStackException();
		}
		return stack[top-1];
	}
	
	// print stack
	public void printStack() {
		System.out.println(" top => ");
		for (int i = top-1 ; i >= 0; i--) {
			System.out.println(stack[i]);
		}
	}

}