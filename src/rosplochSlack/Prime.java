package rosplochSlack;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Give me a number");
		Scanner input = new Scanner(System.in);
		int i = input.nextInt();
		int j = 999999;
		for (int counter = 2; counter <= i; counter++) {
			while (i % counter == 0) {
				if (counter <= j) {
					j = counter;
					System.out.print(j + ", ");
				}
				i = i / counter;
			}
			j = 99999;
		}
		input.close();
	}
}