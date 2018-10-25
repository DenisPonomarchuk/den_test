/*
 * написать метод, который принимает массив строк и возвращает 
 * массив строк в которых больше 3 символов (стрим, фильтер)
 * */
import java.util.Arrays;

public class HW4_task5 {
	public static void stream_my(String[] arr) {
		Object[] arr2 = Arrays.stream(arr).filter(str -> str.length() > 3).toArray();
		System.out.println(Arrays.toString(arr2));
	}

	public static void main(String[] args) {
		String[] arr = { "hello", "fasd", "gsdfgsdfg", "sd", "hsd" };
		stream_my(arr);
	}
}
