package hw6.music;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

public class SortTracks {

	public ArrayList<Track> sortByLength(ArrayList<Track> tracks) {
		return (ArrayList<Track>) tracks.stream()
				.sorted((track1, track2) -> Double.compare(track1.getLength(), track2.getLength()))
				.collect(Collectors.toList());
	}

	public ArrayList<Track> filterByLengthRange(ArrayList<Track> tracks, double[] lengthRange) {
		return (ArrayList<Track>) tracks.stream()
				.filter(track -> track.getLength() > lengthRange[0] && track.getLength() < lengthRange[1])
				.collect(Collectors.toList());
	}

	public ArrayList<Track> sortByGenre(ArrayList<Track> arl) {
		arl.sort(Comparator.comparing(Track::getGenre));
		return arl;
	}

}