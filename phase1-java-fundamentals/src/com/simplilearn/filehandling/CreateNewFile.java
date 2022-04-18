package filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class CreateNewFile {

	public static void main(String[] args) {
		
		createFileUsingFileClass("data.txt");
		
		createFileUsingFileOutStream("test.txt");
	}
	
	
	// create a file using File class
	private static void createFileUsingFileClass(String filename) {
		// File 
		File file = new File(filename);
		
		try {
			if(file.createNewFile() ) {
				System.out.println("File is created !");
			} else {
				System.out.println("File already exist !");
			}
			
			// Write content to file  -> FileWriter -> Character stream
			FileWriter  fileWriter = new FileWriter(file);
			fileWriter.write("Test Data to file !");
			fileWriter.close();
			
		} catch (IOException e) {
			System.out.println("File Creation Failed !");
		}
		
	}
	
	private static void createFileUsingFileOutStream(String filename) {
		
		try {
			String data ="Today is a wonderful day!";
			
			FileOutputStream out = new FileOutputStream(filename);
			
			// write data with output stream
			out.write(data.getBytes());
			System.out.println("File is created and data is Written !");
			
			out.close();
		} catch (FileNotFoundException e) {
			System.out.println("File Operation is Failed !");
		} catch (IOException e) {
			System.out.println("File Operation is Failed !");
		}
	}

}

