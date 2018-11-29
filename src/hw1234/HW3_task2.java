/*
 * 2) Вывести только простые числа от 1 до 100
 * */
package hw1234;

public class HW3_task2 {
	static boolean elem(int i1) {
		boolean b = true;
		int d1 = (int) Math.sqrt(i1);
		for (int i = 2; i <= d1; i++) {
			if (i1 % i == 0) {
				b = false;
				break;
			}
		}
		return b;
	}

	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			if (elem(i))
				System.out.println(i);
		}
	}
}
