/*
 * реализовать метод, который вернет количество слов в строке текста
 * */

//import java.util.regex.Matcher;
//import java.util.regex.Pattern;

public class HW4_task4_words_in_string {

	public static void words(String Str) {
//		Pattern p = Pattern.compile("\\s*\\w+");

//	Matcher m = p.matcher(Str);
//	System.out.println(m.matches());

		int sum = 0;
//	for (String retval : Str.split("(\\s+\\w)")) {
		for (String retval : Str.split("\\s*\\s+")) {
//	for (String retval : Str.split("(\\s\\w)")) {

//	for (String retval : Str.split(Pattern.quote("."))) {
			sum += 1;
			System.out.println(retval);
		}
		System.out.println("Number of words in string is: " + sum);
	}

	public static void main(String[] args) {
		String Str = new String("gsdf gsdffdf   fgd  dfgsd ff ffffss  ");
		words(Str);
//			
	}

}