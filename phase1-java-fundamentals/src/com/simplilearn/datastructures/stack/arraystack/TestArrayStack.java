package datastructures.stack.arraystack;


public class TestArrayStack {

	public static void main(String[] args) {
		
		Employee employee1= new Employee(10001, "Mike Smith", "Engineering", 634345);
		Employee employee2= new Employee(10002, "Ava Smith", "Engineering", 8934345);
		Employee employee3= new Employee(10003, "Mark Smith", "Engineering", 634345);
		Employee employee4= new Employee(10004, "William Smith", "Engineering", 134345);

		ArrayStack stack = new ArrayStack(2);
		
		System.out.println("Stack size : "+stack.size());
		System.out.println("Stack Capacity : "+stack.capacity());
		System.out.println("Stack is empty : "+stack.isEmpty());
		System.out.println("--------------------");
		
		stack.push(employee1);
		stack.push(employee2);		
		stack.push(employee3);
		stack.push(employee4);
		
		System.out.println("Stack size : "+stack.size());
		System.out.println("Stack Capacity : "+stack.capacity());
		System.out.println("Stack is empty : "+stack.isEmpty());
		
		System.out.println("--------------------");
		System.out.println("Stack top : "+stack.peek());
		
		System.out.println("--------------------");
		stack.printStack();
		
		System.out.println("Removed Stack top : "+stack.pop());
		
		System.out.println("--------------------");
		stack.printStack();
	}

}