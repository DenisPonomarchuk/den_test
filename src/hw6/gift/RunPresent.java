package hw6.gift;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class RunPresent {
	static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	static double[] SugarRange = new double[2];

	public static void main(String[] args) throws NumberFormatException, IOException {
		ArrayList<Candy> gift1 = new ArrayList<Candy>(new Gift().creatingGift());

		Gift.printGift(gift1);
		System.out.println("Weight of childrens gift = " + new WeightCounter().allWeight(gift1));

		System.out.println("\nSort by sugar:\n");

		Gift.printGift(new SortCandies().sortBySugar(gift1));


		System.out.println("\nEnter the range of sugar (0-100):\n From:");
		SugarRange[0] = Integer.parseInt(reader.readLine());
		System.out.println(" To:");
		SugarRange[1] = Integer.parseInt(reader.readLine());

		Gift.printGift(new SortCandies().filterBySugar(gift1, SugarRange));
	}
}
