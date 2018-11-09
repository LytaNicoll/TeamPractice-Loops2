package Home;

public class CoinFlip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int min = 1;
		int max = 2;

		int rand = 0;

		double heads = 0.0;

		int count = 0;
		int count2 = 0;

		double minheads = 100000.0;
		double maxheads = 0.0;

		for (count2 = 1; count2 < 100; count2++) {
			for (count = 1; count < 100000; count++) {
				rand = min + ((int) (Math.random() * (max - min + 1)));
				if (rand == 1) {
					heads++;
				}
			}
			if (heads > maxheads) {
				maxheads = heads;
			} else if (heads < minheads) {
				minheads = heads;
			}
			heads = 0.0;
		}
		System.out.println("Maximum heads: " + ((maxheads / 100000) * 100) + "%");
		System.out.println("Minimum heads: " + ((minheads / 100000) * 100) + "%");

	}
}