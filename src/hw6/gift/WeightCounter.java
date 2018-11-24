package hw6.gift;

import java.util.ArrayList;

public class WeightCounter {
	static double presentWeight;

	public double allWeight(ArrayList<Candy> candies) {
		for (Candy candy : candies) {
			presentWeight += candy.getSugar();
		}
		return presentWeight;
	}
}
