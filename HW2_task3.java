import java.util.Scanner;

/*
 3. Программа должна вывести длину окружности. 
 Радиус задается пользователем с консоли.
 */
public class HW2_task3 {

//	public static void main(String[] args) {
//		int r = Integer.parseInt(args[0]);
//		double L = 2 * Math.PI * r;
//		float i = (float) (Math.round(L * 10)) / 10;
//		System.out.println("Circle length is: " + i);
//	}

	// }

// or
	public static void main(String[] args) {
		System.out.print("Введите число: ");
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		double L = 2 * Math.PI * r;
		float i = (float) (Math.round(L * 10)) / 10;
		System.out.println("Circle length is: " + i);
		sc.close();
	}
}