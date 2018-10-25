
/*
 * написать метод, который рисует прямоугольник из плюсиков. 
 * Входными параметрами будут два числа - ширина и высота
 * */
import java.util.Scanner;

public class HW4_task3 {
	public static void scan() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rectengle width:");
		int width = sc.nextInt();
		System.out.println("Enter rectengle height:");
		int height = sc.nextInt();
		sc.close();

		StringBuffer sBuffer = new StringBuffer("");
		for (int j = 0; j < width; j++) {
			sBuffer.append("+");
		}
		for (int i = 0; i < height; i++) {
			System.out.println(sBuffer);
		}
	}

	public static void main(String[] args) {
		scan();
	}
}