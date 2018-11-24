package hw5;

public class Book {
	private String Id;
	private String author;
	private String publishing_house;
	private int publishing_year;
	private int pages;
	private int cost;
	private String binding;

	public Book() {
	}

	public Book(String Id1) {
		Id = Id1;
	}

	public Book(String Id1, String author1, String publishing_house1, int publishing_year1, int pages1, int cost1,
			String binding1) {
		Id = Id1;
		author = author1;
		publishing_house = publishing_house1;
		publishing_year = publishing_year1;
		pages = pages1;
		cost = cost1;
		binding = binding1;
	}

	public String getId() {
		return this.Id;
	}

	public String getAuthor() {
		return this.author;
	}

	public String getPublishing_house() {
		return this.publishing_house;
	}

	public int getPublishing_year() {
		return this.publishing_year;
	}

	public void setId(String id1) {
		this.Id = id1;
	}

	public void setAuthor(String au) {
		this.author = au;
	}

	public void setPublishing_house(String ph) {
		this.publishing_house = ph;
	}

	public void setPublishing_year(int year) {
		this.publishing_year = year;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public void setBinding(String binding) {
		this.binding = binding;
	}

	public String toString() {
		String ret = "Name: \"" + getId() + "\"\nAuthor: " + getAuthor() + "\nPublishing house: "
				+ getPublishing_house() + "\nPublishing year:" + getPublishing_year();
		return ret;
	}
}