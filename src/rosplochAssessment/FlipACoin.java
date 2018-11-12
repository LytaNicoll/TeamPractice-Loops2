package rosplochAssessment;

import java.util.Random;

public class FlipACoin {
	public static void main(String[] args) {
		Random generator = new Random();
		double heads = 0;
		double LPH = Double.MAX_VALUE;
		double HPH = Double.MIN_VALUE;
		for (int trials = 1; trials <= 10000; trials++) {
			for (int flips = 1; flips <= 1000; flips++) {
				if (1 == (1 + generator.nextInt(2))) {
					heads++;
				}
			}
			double HP = (heads / 1000.0);
			if (HP > HPH) {
				HPH = HP;
			} else {
				if (HP < LPH) {
					LPH = HP;
				}
			}
			heads = 0;
		}
		System.out.println("Maximum percntage of heads flipped: " + (HPH * 100) + "%");
		System.out.println("Minumum percntage of heads flipped: " + (LPH * 100) + "%");
	}
}