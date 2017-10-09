package practice;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileCreate {
	public static void main(String[] args) {
		Path target = Paths.get("/home/deepin/Desktop/test.txt");
		try {
			Path file = Files.createFile(target);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
