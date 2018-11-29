package hw8;

import java.util.Map;
import java.util.TreeMap;

public class HW8_Task6 {

	public static void main(String[] args) {
		String string = "vasdfvm,erbbpospovamo weo awm,p a;. j [=q[ f faa,aclkfhmbjynbmscc,;ile";
		Map<Character, Integer> treeMap = new TreeMap<Character, Integer>();

		for (int i = 97; i <= 122; i++) {
			Character ch = (char)i; // 'a'-'z' 97-122
			long lettersCount = string
					.toLowerCase()
					.chars()
					.filter(Character::isLetter)
					.filter(c1 -> c1 == ch)
					.count();
			treeMap.put(ch, (Integer)(int)lettersCount);
		}
		
		treeMap.entrySet().stream()
	        .sorted(Map.Entry.<Character, Integer>comparingByValue()) 
	        .forEach(System.out::println);
	}

}
