//Part5
//Exel. Перевод из номера ячейки в буквенное обозначение
//Exel. Перевод из буквенного обозначения ячейки в номер
//Exel. Ячейка справа от текущего обозначения
public class HW1_task5 {

	public static int chars2digits(String number) {
		int num = 0;
		for (int i = 1, j = number.length(); j > 0; i++, j--) {
			num += (int) (number.charAt(number.length() - i) - 64)
					* Math.pow(26, number.length() - j);

		}
		return num;
	}

	public static String digits2chars(int number) {
		String char1 = "";
		String charsMirror = "";
		int modul;
		int divident = number;
		while (divident != 0) {
			modul = divident % 26;
			if (modul == 0) {
				char1 += "Z";
				divident = (divident - 1) / 26;
			} else {
				char1 += (char) (modul + 64);
				divident = (divident - modul) / 26;
			}
		}
		for (int i = 0; i < char1.length(); i++)
			charsMirror += char1.charAt(char1.length() - i - 1);
		return charsMirror;

	}

	public static String rightColumn(String number) {
		int i = chars2digits(number);
		i++;
		String st1 = digits2chars(i);
		return st1;
	}

	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		String st1 = String.valueOf(args[1]);
		String st2 = String.valueOf(args[2]);
		System.out.println(num + " is " + HW1_task5.digits2chars(num));
		System.out.println(st1 + " is " + HW1_task5.chars2digits(st1));
		System.out.println(st2 + " >> 1 = " + HW1_task5.rightColumn(st2));
	}

}