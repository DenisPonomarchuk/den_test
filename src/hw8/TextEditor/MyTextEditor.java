package hw8.TextEditor;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
//import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MyTextEditor {

	public static void main(String[] args) {
		try {
			myEditor();
		} catch (IOException e) {
			System.out.println(e);
		}

	}

	public static void myEditor() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str[] = new String[100];
		File file = new File("text.txt");
		file.createNewFile();
		Path path = file.toPath();

		System.out.println("Enter lines of text.");
		System.out.println("Enter \"exit\" to quit.");

		int stringLength = 0;
		int maxVowels = 0;
		int wordCounter = 0;
		long stringNumber = 0;
		char[] vowels = { 'a', 'e', 'i', 'o', 'u' };

		for (int strings = 0; strings < 100; strings++) {
			str[strings] = br.readLine();
			if (str[strings].equals("exit")) {
				break;
			}
			wordCounter += str[strings].split("[ ,.!?\r\n]").length;

			str[strings] = new String(str[strings] + "\r");
			int countVowels = 0;
			for (int n1 = 0; n1 < str[strings].length(); n1++) {
				char ch = str[strings].charAt(n1);
				for (char ch2 : vowels) {
					if (ch == ch2) {
						countVowels++;
						if (countVowels > maxVowels) {
							maxVowels = countVowels;
//							try (Stream<String> lines = Files.lines(path, Charset.defaultCharset())) {
//								stringNumber = lines.count();
//								}
							stringNumber = (strings + 1);
						}
						break;
					}
					if (countVowels > maxVowels) {
						maxVowels = countVowels;
					}
				}
			}
			stringLength += str[strings].length();

			Files.write(path, str[strings].getBytes(), StandardOpenOption.APPEND);
		}
		System.out.println("\nHere is your file: ");
		try (Stream<String> fStream = Files.lines(path)) {
			fStream.forEach(System.out::println);
		}

		System.out.println("\nOverall number of symbols (with '\\r' and ' ' ): " + stringLength);
		System.out.println("maxVowels: " + maxVowels);
		System.out.println("Number of added string with max vowels: " + stringNumber);
		System.out.println("Words added: " + wordCounter);
	}// myEditor
}// class
