package hw6.music;

import java.util.ArrayList;

import hw6.gift.Candy;
import hw6.gift.ChocolateCandy;

public class Disk {
	ArrayList<Track> tracks = new ArrayList<Track>();

	public ArrayList<Track> creatingDisk() {
		tracks.add(new Track("Its my life", 725, "rock"));
		tracks.add(new Track("Mutter", 225, "metall"));
		tracks.add(new Track("some rap", 825, "noise"));
		tracks.add(new Track("Spring", 125, "classic"));
		tracks.add(new Track("Sesons of the year", 325, "classic"));
		return tracks;
	}

	public int diskLength() {
		int length = 0;
		for (Track tr : tracks) {
			length += tr.getLength();
		}
		return length;
	}

	public static void printDisk(ArrayList<Track> tracks) {
		for (Track track : tracks) {
			System.out.println(
					"Track: " + track.getName() + " Length: " + track.getLength() + "sec. Genre: " + track.getGenre());
		}
	}

}
