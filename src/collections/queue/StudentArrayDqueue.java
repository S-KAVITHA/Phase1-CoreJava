package collections.queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class StudentArrayDqueue {

	public static void main(String[] args) {
		
		Student student1 = new  Student(1001, "Mike William", 1, "Xyz College");
		Student student2 = new  Student(1002, "John smith", 2, "Xyz College");
		Student student3 = new  Student(1003, "Amy Smith", 3, "Xyz College");
		Student student4 = new  Student(1004, "Ava Joes", 4, "Xyz College");
		
		Queue<Student> studentQueue = new ArrayDeque<Student>();
		
		studentQueue.add(student1);
		studentQueue.add(student2);
		studentQueue.add(student3);
		studentQueue.add(student4);
		
		System.out.println(studentQueue);
		
		for(Student s : studentQueue) {
			System.out.println("Student : "+ s.getId());
		}
		

	}

}