package hw6.music;
import java.util.ArrayList;

public class DiskLength {
	static int diskLength;

	public double allLength(ArrayList<Track> tracks) {
		for (Track track : tracks) {
			diskLength += track.getLength();
		}
		return diskLength;
	}
}