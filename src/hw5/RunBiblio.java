package hw5;

public class RunBiblio {
	public static void main(String[] args) {
		BookShelf bs1 = new BookShelf();
		bs1.author("Petrov");
		bs1.pub_house("AST");
		bs1.booksOlderThan(1990);
		System.out.println(bs1);
	}
}