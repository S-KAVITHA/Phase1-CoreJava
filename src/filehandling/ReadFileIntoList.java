package filehandling;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

public class ReadFileIntoList {

	static String path ="/home/evergreenkavigm/eclipse-workspace/phase1-java-07-24-2021/";
	public static void main(String[] args) {
	
		List<String> lines = readFileIntoList("test.txt");	
		for(String line : lines) {
			System.out.println(line);
		}
	}

	private static List<String> readFileIntoList(String filename){
		
		List<String> lines = Collections.emptyList();
		// read file
		try {
			lines = Files.readAllLines(Paths.get(path+filename), StandardCharsets.UTF_8);
		} catch (IOException e) {
			System.out.println("File Not Exception !");
		}
		return lines;
	}
}