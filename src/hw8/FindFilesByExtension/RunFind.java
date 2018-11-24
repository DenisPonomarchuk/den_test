package hw8.FindFilesByExtension;

import java.io.File;

public class RunFind {
	public static void main(String[] args) {
		String extension = "java";
		String path = "src";
		File startPath = new File(path);
		Counter counter = new Counter();
		FindFiles findFil = new FindFiles();
		if (startPath.isDirectory()) {
			findFil.findFiles(startPath, extension, counter);
		} else {
			System.out.println("Wrong path");
		}
		System.out.println(counter.returnCount() + " " + extension + " files");
	}
}
