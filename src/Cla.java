import java.util.Scanner;

public class Cla {

	public static void main(String[] args) {
		// byte b = 127;
		// b += 1;
		// System.out.println(b);

		System.out.print("Введите число плиз: ");
		Scanner sc = new Scanner(System.in);
		int nextInt = sc.nextInt();
		// String s = Integer.toString(nextInt);
		System.out.println("Вы ввели число " + nextInt);
		sc.close();
		// System.out.println(s.length());

		// int guess = 12345;
		//
		// String temp = Integer.toString(guess);
		// int[] newGuess = new int[temp.length()];
		// for (int i = 0; i < temp.length(); i++) {
		// System.out.println(newGuess[i] = temp.charAt(i) - '0');
		// }

		// int guess = 12345;
		//
		// String temp = Integer.toString(guess);
		// int[] newGuess = new int[temp.length()];
		// for (int i = 0; i < temp.length(); i++) {
		// System.out.println(newGuess[i] = temp.charAt(i) - '0');
		// }
	}

}