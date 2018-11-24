package hw8.FindFilesByExtension;

import java.io.File;

public class FindFiles {
	public void findFiles(File startFile, String extension, Counter counter) {
		File[] listFiles = startFile.listFiles();
		for (File file : listFiles) {
			if (file.isDirectory()) {
//				System.out.println("Directory: " + file.getAbsolutePath());
				findFiles(file, extension, counter);
			} else if (file.getName().endsWith(extension)) {
				System.out.println("File: " + file.getName());
				counter.add();
			}
		}
	}
}
