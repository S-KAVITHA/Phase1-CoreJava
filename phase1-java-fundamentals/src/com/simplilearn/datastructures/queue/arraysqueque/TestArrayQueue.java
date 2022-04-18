package datastructures.queue.arraysqueque;


public class TestArrayQueue {

	public static void main(String[] args) {
		
		Employee employee1= new Employee(10001, "Mike Smith", "Engineering", 634345);
		Employee employee2= new Employee(10002, "Ava Smith", "Engineering", 8934345);
		Employee employee3= new Employee(10003, "Mark Smith", "Engineering", 634345);
		Employee employee4= new Employee(10004, "William Smith", "Engineering", 134345);

		ArrayQueue queue = new ArrayQueue(2);
		
		System.out.println("Stack size : "+queue.size());
		System.out.println("Stack Capacity : "+queue.capacity());
		System.out.println("--------------------");
		
		queue.add(employee1);
		queue.add(employee2);	
		queue.add(employee3);	
		queue.add(employee4);	
		
		System.out.println("Stack size : "+queue.size());
		System.out.println("Stack Capacity : "+queue.capacity());
		System.out.println("--------------------");
		
		System.out.println("--------------------");
		System.out.println("Stack top : "+queue.peek());
		
		queue.remove();
		
		queue.printQueue();

	}

}