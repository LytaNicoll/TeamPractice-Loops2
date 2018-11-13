package Home;

public class ramonYahtzee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max = 6;
		int min = 1;
		int randomNum = 0;
		int one = 0;
		int two = 0;
		int three = 0;
		int four = 0;
		int five = 0;
		int rollscount = 0;
		int yahtzee = 0;
		do {
			for (int counter = 0; counter <= 5; counter++) {
				randomNum = min + (int) Math.random() * (max - min + 1);
			}
			if (randomNum == 1) {
				one++;
			}
			if (randomNum == 2) {
				two++;
			}
			if (randomNum == 3) {
				three++;
			}
			if (randomNum == 4) {
				four++;
			}
			if (randomNum == 5) {
				five++;
			}

			if (one == 5 || two == 5 || three == 5 || four == 5 || five == 5) {
				yahtzee = 1;
				rollscount++;
				System.out.println("Yahztee!");
			} else {
				System.out.println("roll again");
				rollscount++;
			}
		} while (yahtzee != 1);
		System.out.println(rollscount + "rolls");
	}

}
