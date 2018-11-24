package hw5;

public class BookShelf {
	Book[] arr;

	public BookShelf() {
		arr = new Book[4];
		Book b0 = new Book("Философия", "Ivanov", "AST", 1990, 50, 304, "hard");
		Book b1 = new Book("Азбука", "Petrov", "Polus", 1973, 632, 100, "soft");
		Book b2 = new Book("Очерки", "Ivanov", "AST", 1994, 53, 26, "hard");
		Book b3 = new Book("Программирование на java", "Petrov", "Word", 2005, 1050, 1000, "soft");
		arr[0] = b0;
		arr[1] = b1;
		arr[2] = b2;
		arr[3] = b3;
	}

	public String toString() {
		String ret = "";
		for (Book b : arr) {
			ret += b.toString() + "\n\n";
		}

		return ret;
	}

	public void author(String au) {
		System.out.println(au + ". Books: ");
		for (Book b : arr) {
			if (b.getAuthor().equals(au)) {
				System.out.println("\"" + b.getId() + "\"");
			}
		}
		System.out.println();
	}

	public void pub_house(String ph) {
		System.out.println("Publishing house " + ph + ": ");
		for (Book b : arr) {
			if (b.getPublishing_house().equals(ph)) {
				System.out.println("\"" + b.getId() + "\"" + " " + b.getAuthor());
			}
		}
		System.out.println();
	}

	public void booksOlderThan(int year) {
		System.out.println("Books older than " + year + " year:");
		for (Book b : arr) {
			if (b.getPublishing_year() > year) {
				System.out.println(b.getPublishing_year() + " year - " + "\"" + b.getId() + "\"" + " " + b.getAuthor());
			}
		}
		System.out.println();
	}

}