package Home;

public class ramonOddPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  /*
         * for (int couner = 1; counter <= (5); counter++) {
         * System.out.print((1 * counter)); }
         */
        int counter = 1;
        int counter2 = 1;
        int j = 0;
        while (counter <= 5) {
            
            counter++;
            j++;
            for (counter2 = j; counter2 <= (5); counter2++) {
                System.out.print((1 * counter2));
                }
                
                
            System.out.print((counter-1));
            System.out.println();

        }
}
}