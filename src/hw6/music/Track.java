package hw6.music;

public class Track {
	private String name;
	private int length;
	private String genre;

	public Track(String name, int length, String genre) {
		this.name = name;
		this.length = length;
		this.genre = genre;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getLength() {
		return length;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getGenre() {
		return genre;
	}

	public String printInfo() {
		String str = "Track: " + getName() + ". Length: " + getLength() + " sec. Genre: " + getGenre();
		return str;
	}
}