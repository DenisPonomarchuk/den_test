package hw6.gift;

import java.util.ArrayList;
import java.util.Random;

public class Gift {
	Random random = new Random();
	ArrayList<Candy> present = new ArrayList<Candy>();

	public ArrayList<Candy> creatingGift() {

		for (int i = 0; i < 5; i++) {
			if (i % 2 == 0)
				present.add(new ChocolateCandy("Chocolate Candy" + " " + i, random.nextInt(100 - 1) + 1,
						random.nextInt(100 - 1)));
			else
				present.add(new CaramelCandy("Caramel Candy" + "   " + i, random.nextInt(100 - 1) + 1,
						random.nextInt(100 - 1)));
		}

		return present;
	}

	public static void printGift(ArrayList<Candy> candys) {
		for (Candy candy : candys) {
			System.out.println(candy.getName() + " Sugar: " + candy.getSugar() + " Weight: " + candy.getWeight() + " g.");
		}
	}
	
}
