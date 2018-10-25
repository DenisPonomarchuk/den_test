/*
Part2
Написать класс, который реализует функциональность сложения двух чисел,
 переданных в приложение как параметры командной строки.
 */
public class HW1_task2 {

	public static void main(String[] args) {
		System.out.println(Integer.parseInt(args[0])
				+ Integer.parseInt(args[1]));
	}

}

// javac HW1_task2.java
// java HW1_task2 5 9