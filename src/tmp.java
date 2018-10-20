public class tmp {

	public static void main(String[] args) {
		
		System.out.println(chars2digits("AA"));
		System.out.println(digits2chars(52));
		System.out.println(rightColumn("ABA"));
						
	}
	
	public static int chars2digits (String letter) {
		int number = 0;
		int j = 0;
		int pow = 0;		
		for (int i = letter.length() - 1; i >= 0; i--) {			
			j = (letter.charAt(i) - 64) % 26;			
			if (j == 0)
				j = 26;	
			number += j * Math.pow(26, pow);
			pow++;
		}				
		return number;
	}

	public static String digits2chars (int number) {
		StringBuilder letters = new StringBuilder();
		
		while (number > 0) {
			int j = number % 26;
				if (j == 0) {
					letters.append('Z');
					number = number / 26 - 1;
				}
				else {
					letters.append((char)(j + 64));
					number = number / 26;
				}
		}
						
		return letters.reverse().toString();
	}
	
	 public static String rightColumn(String letter) {		 
		 String rightLetter = digits2chars(chars2digits(letter) + 1);		 
		 return rightLetter;
	 }
}