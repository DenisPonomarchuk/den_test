package hw6.music;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

import hw6.gift.Candy;
import hw6.gift.Gift;
import hw6.gift.SortCandies;

import java.io.IOException;

//import java.util.ArrayList;

public class RunMusic {
	static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	static double[] lenghRange = new double[2];

	public static void main(String[] args) throws NumberFormatException, IOException {
		ArrayList<Track> disk1 = new ArrayList<Track>(new Disk().creatingDisk());
		Disk.printDisk(disk1);

		System.out.println("\nLength of disk = " + new DiskLength().allLength(disk1) + " sec.\n");

		Disk.printDisk(new SortTracks().sortByGenre(disk1));
//		disk1.sort(Comparator.comparing(Track::getGenre));
//		Disk.printDisk(disk1);

		System.out.println("\nEnter the min length :");
		lenghRange[0] = Integer.parseInt(reader.readLine());
		System.out.println("\nEnter the max length:");
		lenghRange[1] = Integer.parseInt(reader.readLine());
		Disk.printDisk(new SortTracks().filterByLengthRange(disk1, lenghRange));

	}
}
