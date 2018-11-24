/*
Part3
Написать класс, который реализует функциональность 
определения наибольшего общего делителя двух целых 
положительных чисел, переданных в приложение как параметры 
командной строки.
 */

public class HW1_task3 {

	public static void main(String[] args) {
		int x = Integer.parseInt(args[0]), y = Integer.parseInt(args[1]);
		int max = 1;
		int z = x;
		while (max == 1 & z > 0) {
			if ((x % z == 0) & (y % z == 0) & (z > max))
				max = z;
			z--;
		}
		System.out.println("max = " + max);
	}
}

// javac HW1_task3.java
// java HW1_task3 10 50
// max = 10

// for (int i = x; i > 1; i--) {
// if ((x % i == 0) & (y % i == 0) & (i > max))
// max = i;
// }