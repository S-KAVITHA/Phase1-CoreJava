package serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo {

	public static void main(String[] args) {
		
		// 1. create object
		Employee employee = new Employee(100001, "Eva Smith", "Engineering", 97876.23f);
		
		// 2. create a byte strem.
		
		try {
			// create file output stream.
			FileOutputStream file = new FileOutputStream("file-db.txt");
			
			// create object stream
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			// method to serialize object
			out.writeObject(employee);
			
			System.out.println("Serialization is completed !");
			
			out.close();
			file.close();
			
		} catch(Exception ex) {
			ex.printStackTrace();
		}		

	}

}