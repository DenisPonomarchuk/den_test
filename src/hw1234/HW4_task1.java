/*
 * Вывести на экран число пи 5 раз, в каждой строке разное количество знаков после запятой. 
 * В первой строке - 1, в последней - 5.
 * */
package hw1234;

public class HW4_task1 {

	public static void main(String[] args) {
		for (int i = 1; i < 6; i++) {
			String s1 = "%." + i + "f";
			String formattedDouble = String.format(s1, Math.PI);
			System.out.println(formattedDouble);
		}
	}
}
