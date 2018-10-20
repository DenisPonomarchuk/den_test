import java.util.Scanner;

/*
 2. Программа должна подсчитывать и выводить площадь треугольника. 
 Стороны задаются пользователем с консоли.
 */
public class HW2_task2 {

//	public static void main(String[] args) {
//		int a, b, c, p;
//		double S;
//		a = Integer.parseInt(args[0]);
//		b = Integer.parseInt(args[1]);
//		c = Integer.parseInt(args[2]);
//		p = (a + b + c) / 2;
//		S = Math.sqrt(p * (p - a) * (p - b) * (p - c));
//		System.out.println("Area is: " + S);
//	}
//
//}

	// or
	public static void main(String[] args) {
		int a, b, c, p;
		double S;
		System.out.println("Введите три числа: ");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		p = (a + b + c) / 2;
		S = Math.sqrt(p * (p - a) * (p - b) * (p - c));
		System.out.println("Area is: " + S);
		sc.close();
	}
}