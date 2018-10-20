import java.util.Scanner;

public class chujoe_popravit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("¬ведите высоту: ");
		int a = sc.nextInt();
		StringBuilder sb = new StringBuilder("");
		for (int i = 0; i <= a*2; i++) {
			if (i <= a) {
				sb = sb.append("*");
				System.out.println(sb);
			}

			 else {
			 sb.deleteCharAt(0);
			 System.out.println(sb);
			 }

		}
//		for (int i = a; i >0 ; i--) {
//			if (i < a) {
//				sb = sb.append("*");
//				System.out.println(sb);
//			}
//		}
		sc.close();
	}
}