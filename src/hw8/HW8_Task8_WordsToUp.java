package hw8;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.stream.Stream;

public class HW8_Task8_WordsToUp {

	public static void main(String[] args) {
		File file = new File("text.txt");
		try {
			Stream<String> stream = Files.lines(file.toPath());
			stream.forEach(string -> System.out.println(string = stringUpper(string)));
		} catch (IOException e) {
			System.out.println(e);
		}
	}

	static public String wordUpper(String word) {
		Character c1 = ' ';
		c1 = c1.toUpperCase(word.charAt(0));
		String newWord = new String(c1 + word.substring(1, word.length()));

		return newWord;
	}

	static public String stringUpper(String stringToUp) {
		stringToUp = stringToUp.trim();
		String[] array = stringToUp.split("\\s");
		String newString = "";
		for (int i = 0; i < array.length;) {
			newString += wordUpper(array[i]);
			if (++i >= array.length) {
				break;
			} else
				newString += " ";
		}
		return newString;
	}
}
