package HealthyHearts;
import java.util.Scanner;

//Make a simple calculator that asks the user for their age. Then calculate the healthy heart rate range for that age, and display it.

//Their maximum heart rate should be 220 - their age.
//The target heart rate zone is the 50 - 85% of the maximum.

public class HealthyHearts {

	public static void main(String[] args) {
		System.out.println("What is your age?: ");
		Scanner user_input = new Scanner(System.in);
		int a = user_input.nextInt();
		heartRate(a);
	}

	public static void heartRate(int a) {
		int max_heart_rate = 220 - a;
		int fifty_target = max_heart_rate / 2;
		double eigthyFive_target = 0.85 * max_heart_rate;
		System.out.println("Your maximum heart rate should be " + max_heart_rate + " beats per minute");
		System.out.println("Your target HR Zone is " + fifty_target + " - " + eigthyFive_target + " beats per minute");
	}
}