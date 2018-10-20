public class Arr {

	public static void main(String[] args) {
		int num = 12345;
		String st = Integer.toString(num);
		int[] arr = new int[st.length()];
		for (int i = 0; i < st.length(); i++) {
			System.out.println(arr[i] = st.charAt(i) - '0');
		}
		// char c = '0';
		// c-=1;
		// System.out.println("\n" + c);
	}
}