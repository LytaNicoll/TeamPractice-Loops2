package rosplochOldPrograms;

import java.util.Random;

public class RussianFishing {
	public static void main(String[] args) {
		Random rng = new Random();
		int min = 26;
		int max = 43;
		int kidsOverThree = 0;
		for (int kid = 1; kid <= 248; kid++) {
			if ((min + rng.nextInt(max - min + 1)) > 36) {
				kidsOverThree++;
			}
		}
		System.out.println("Total kids over 3 feet: " + kidsOverThree);
	}
}