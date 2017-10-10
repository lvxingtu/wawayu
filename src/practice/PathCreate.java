package practice;

import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathCreate {
	public static void main(String[] args) {
		/**
		 * 两种方式都可以,实际上第一种方式本质上就是第二种方式
		 */
		String route = "/home/deepin/Desktop/text.txt";
		Path path = Paths.get(route);
		Path path2 = FileSystems.getDefault().getPath(route);
	}
}
