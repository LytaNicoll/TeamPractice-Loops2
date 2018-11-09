package rosplochOldPrograms;

import java.util.Random;
import java.util.Scanner;

public class RollADiev1 {
	public static void main(String[] args) {
		Random generator = new Random();
		Scanner input = new Scanner(System.in);
		System.out.println("How many faces does the die have?");
		int faces = input.nextInt();
		if (faces < 1) {
			faces = 2;
		}
		System.out.println("How many rolls?");
		int rolls = input.nextInt();
		if (rolls < 0) {
			rolls = 1;
		}
		while (rolls != 0) {
			System.out.println("You rolled a: " + (1 + generator.nextInt(faces - 1 + 1)));
			rolls--;
		}
		input.close();
	}
}