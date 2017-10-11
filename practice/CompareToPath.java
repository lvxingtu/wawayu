package practice;

import java.nio.file.Path;
import java.nio.file.Paths;

public class CompareToPath {

	public static void main(String[] args) {
		/**
		 * 比较两个路径,返回int类型,
		 * 如果是0 则相等
		 * 如果是负数 则字符串长度小于右边
		 * 如果是正数 则字符串长度大于右边
		 */
		String route1 = "/home/deepin/Desktop/test.txt";
		String route2 = "/home/deepin/Desktop/tes.txt";
		Path path1 = Paths.get(route1);
		Path path2 = Paths.get(route2);
		int value = path1.compareTo(path2);
		System.out.println(value);
	}

}
