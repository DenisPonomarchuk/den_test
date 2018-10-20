public class Mat {

	public static void main(String[] args) {
		Integer number = 123456;
		int len = number.toString().length();
		int n = (int) Math.pow(10, len - 1);

		while (len > 0 & n > 0) {
			System.out.println(number / n % 10);
			n /= 10;
			len -= 1;
		}
	}

}