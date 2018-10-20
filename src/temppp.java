import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class temppp {

	public static void main(String[] args) {
		// int a = -1;
		// double d = 1.0;
		// System.out.println(Math.sqrt(a));
		// System.out.println(d / 0);

		// byte b = 0b1001;
		// byte b2 = (byte) ~b;
		// String bin = Integer.toBinaryString((int) b2);
		// char[] c1 = bin.toCharArray();
		// for (int i = 28; i < 32; i++) {
		// System.out.print(c1[i]);
		// }
		// System.out.println("");
		// System.out.println(b2);

		// for(char c2:c1){
		// System.out.print(c2);
		// }
		// System.out.println(bin);

		// String st1, st2;
		// st1 = "hello";
		// st2 = new String("hello");
		// System.out.println((st1 == st2) + "" + st1.equals(st2));

		// StringBuffer sb = new StringBuffer();
		// System.out.println("длина Ч> " + sb.length());
		// System.out.println("размер Ч>" + sb.capacity());
		// // sb = "Java"; // ошибка, только дл€ класса String
		// sb.append("Java");
		// System.out.println("строка Ч> " + sb);
		// System.out.println("длина Ч> " + sb.length());
		// System.out.println("размер Ч> " + sb.capacity());
		// sb.append("Internationalization");
		// System.out.println("строка Ч> " + sb);
		// System.out.println("длина Ч> " + sb.length());
		// System.out.println("размер Ч> " + sb.capacity());
		// System.out.println("реверс Ч> " + sb.reverse());

		// int i = 4;
		// System.out.println((float) Math.round((Math.exp(i) * 10)) / 10);
		// System.out.println((float) Math.round((Math.getExponent(i) * 10)) /
		// 10);
		// System.out.println((float) Math.round((Math.scalb(i, 3) * 10)) / 10);
		// Arrays.

		String[] arr = { "2fasdf s df", "3 dfsfsd", "1fasdf fdsf sdf asf s",
				"4dfs" };
		Arrays.sort(arr, (str1, str2) -> {
			return str1.length() - str2.length();
		});
		System.out.println(Arrays.toString(arr));

		// System.out.println(Arrays.toString(arr));
		// double t;
		// String[]arr2= new String[arr.length];

		// System.out.println(Arrays.toString(arr));
		// Arrays.sort(arr, Comparator.comparingInt(Vertex::getCost));
		// for (int i2 = 0; i2 < arr.length; i++)
		// for (int j = i2 + 1; j < arr.length; j++)
		// if (arr[j] < arr[i2]) {
		// t = arr[i2];
		// arr[i2] = arr[j];
		// arr[j] = t;
		// }

		// public int compareTo(String [] mas) {
		// давайте будем сортировать объекты Employee по значению пол€ id от
		// меньшего к большему
		// будем возвращать отрицательное число, 0 или положительное число по
		// каждому сравнению объектов
		// здесь мы просто отнимаем значение пол€ одного объекта от значени€
		// пол€
		// другого объекта
		// в результате получим 1 из 3 вариантов описанных выше вариантов
		// return (this.id - emp.id);
		// }

	}
}
