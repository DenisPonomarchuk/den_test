/*
 1. ��������� ������ ������� � ������� �����, ������� ������ ������������
  � ������� ������ ����� � ����� ������.

 */
import java.util.Scanner;

public class HW2_task1 {

	public static void main(String[] args) {

		System.out.print("������� �����: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		String st1 = Integer.toString(num);
		int[] intArr = new int[st1.length()];
		for (int i = 0; i < st1.length(); i++) {
			System.out.println(intArr[i] = st1.charAt(i) - '0');
		}
		sc.close();
	}
}