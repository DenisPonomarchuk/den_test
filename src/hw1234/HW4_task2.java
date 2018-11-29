/*
 * написать метод, который принимает массив целых чисел и 
 * возвращает максимальное
 * */
package hw1234;

public class HW4_task2 {
	public static int max(int[] mas) {
		int max = mas[0];
		for (int i = 1; i < mas.length; i++) {
			if (mas[i] > max)
				max = mas[i];
		}
		return max;
	}

	public static void main(String[] args) {
		int[] mas = { 53, 3, 7, -6, 63, 2, 44, 2, 72, 4, 25 };
		System.out.println(max(mas));
	}
}
