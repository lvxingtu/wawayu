package practice;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileCreate {
	public static void main(String[] args) {
		String route = "/home/deepin/Desktop/test.txt";
		Path target = Paths.get(route);
		try {
			Path file = Files.createFile(target);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
