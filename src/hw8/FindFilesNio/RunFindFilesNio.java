package hw8.FindFilesNio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RunFindFilesNio {

	public static void main(String[] args) {
		try {
			findFiles();
		} catch (IOException e) {
			System.out.println(e);
		}
	}

	private static void findFiles() throws IOException {
		Path start = Paths.get("src");
		int maxDepth = 2;
		try (Stream<Path> stream = Files.find(start, maxDepth,
				(path, attr) -> String.valueOf(path).endsWith(".java"))) {
			String joined = stream
					.sorted()
					.map(String::valueOf)
					.collect(Collectors.joining("; "));
			System.out.println("Found: " + joined);
		}

	}
}
