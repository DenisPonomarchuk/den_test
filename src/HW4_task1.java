/*
 * ������� �� ����� ����� �� 5 ���, � ������ ������ ������ ���������� ������ ����� �������. 
 * � ������ ������ - 1, � ��������� - 5.
 * */
public class HW4_task1 {

	public static void main(String[] args) {
		for (int i = 1; i < 6; i++) {
			String s1 = "%." + i + "f";
			String formattedDouble = String.format(s1, Math.PI);
			System.out.println(formattedDouble);
		}
	}
}
