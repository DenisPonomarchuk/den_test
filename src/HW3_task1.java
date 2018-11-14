import java.util.Scanner;

/*
1)
C помощью циклов нарисовать такую фигуру:
*
**
***
****
***
**
*
Максимальная высота вводится с клавиатуры
*/

public class HW3_task1 {
	public static void main(String[] args) {
		System.out.print("Введите высоту фигуры: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();

		for (int j = 0; j < num; j++) {
			for (int k = 0; k <= j; k++) {
				System.out.print("*");
			}
			System.out.println("");
		}

		for (int j = num - 1; j > 0; j--) {
			for (int k = j; k > 0; k--) {
				System.out.print("*");
			}
			System.out.println("");
		}

	}
}
