package hw8;

import java.util.Scanner;

public class HW8_Task11_DegreesBetweenHands {

	public static void main(String[] args) {
		Scanner scanner;
		String time;
		String[] strTime;
		int hours = -1;
		int minutes = -1;

		while (hours < 0 | hours > 24 | minutes < 0 | minutes > 59) {
			System.out.println("Enter the time in format hh:mm -> ");
			scanner = new Scanner(System.in);
			time = scanner.next();
			strTime = time.split(":");
			try {
				hours = Integer.parseInt(strTime[0]);
				if (hours < 0 | hours > 24) {
					scanner.close();
					throw new NumberFormatException("Hours is not correct");
				}
				hours = hours % 12;
				minutes = Integer.parseInt(strTime[1]);
				if (minutes < 0 | minutes > 59) {
					scanner.close();
					throw new NumberFormatException("Minutes is not correct");
				}
				int degreesHours = (hours * 30);
				int degreesMinutes = (minutes * 6);
				System.out.println("hours: " + hours);
				System.out.println("minutes: " + minutes);
				System.out.println(degrees(degreesHours, degreesMinutes) + " degrees between "
							+ "the hour" + " and minute hands.");
				scanner.close();
				break;
			} catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
				System.out.println(e);
				System.out.println("Wrong format\n");
			}
		}
	}

	public static int degrees(int degreesHours, int degreesMinutes) {
		int result = degreesMinutes - degreesHours;
		if (result < 0)
			result += 360;
		return result;
	}
}