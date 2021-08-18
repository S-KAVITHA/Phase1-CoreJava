package filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFileDemo {

	public static void main(String[] args) {
		
		readFile("test.txt");

	}

	
	private static void readFile(String filename) {
		try {
			@SuppressWarnings("resource")
			FileInputStream fileInputStream = new FileInputStream(filename);
			
			int count = 0;
			while((count=fileInputStream.read()) !=-1) {
				System.out.print((char)count);
			}
			// int i = fileInputStream.read();
			//System.out.println((char)i);
			
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found Exception !");
		} catch (IOException e) {
			System.out.println("File Read Exception !");
		}
	}
}