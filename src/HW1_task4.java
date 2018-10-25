/*
Part4
Написать класс, который реализует функциональность определения суммы 
цифры целого положительного числа, переданного в приложение как параметр 
командной строки.
 */
public class HW1_task4 {

	public static void main(String[] args) {
		String st = args[0];
		int len = st.length();

		int n = (int) Math.pow(10, len - 1);
		int sum = 0;
		while (len > 0 & n > 0) {
			sum += Integer.parseInt(args[0]) / n % 10;
			n /= 10;
			len -= 1;
		}
		System.out.println(sum);
	}

}

// input 123
// output 6