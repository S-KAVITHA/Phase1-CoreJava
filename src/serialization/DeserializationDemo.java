package serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializationDemo {
	
	public static void main(String[] args) {
		
		
		try {
			// 1. read a file
			FileInputStream file = new FileInputStream("file-db.txt");
			
			// 2. create a input strem object
			ObjectInputStream in = new ObjectInputStream(file);
			
			// 3. method to de-serialized object
			Employee employee = (Employee) in.readObject();
			
			System.out.println(" De serialization completed !");
			System.out.println("Emp Id : "+employee.getId());
			System.out.println("Emp Name : "+employee.getName());
			System.out.println("Emp Dept : "+employee.getDept());
			System.out.println("Emp Salary : "+employee.getSalary());
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}