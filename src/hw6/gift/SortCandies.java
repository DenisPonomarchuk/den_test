package hw6.gift;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class SortCandies {

	public ArrayList<Candy> sortBySugar(ArrayList<Candy> candies) {
		return (ArrayList<Candy>) candies.stream()
				.sorted((candy1, candy2) -> Double.compare(candy1.getSugar(), candy2.getSugar()))
				.collect(Collectors.toList());
	}

	public ArrayList<Candy> sortByWeight(ArrayList<Candy> sweets) {
		return (ArrayList<Candy>) sweets.stream()
				.sorted((candy1, candy2) -> Double.compare(candy1.getWeight(), candy2.getWeight()))
				.collect(Collectors.toList());
	}

	public ArrayList<Candy> filterBySugar(ArrayList<Candy> candies, double[] SugarRange) {
		return (ArrayList<Candy>) candies.stream()
				.filter(candy -> candy.getSugar() > SugarRange[0] && candy.getSugar() < SugarRange[1])
				.collect(Collectors.toList());
	}
}