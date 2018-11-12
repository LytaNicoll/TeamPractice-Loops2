package Home;

public class RandomCoins {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int count=0;
int max=2;
int min=1;
int rand=0;
int heads=0;
int tails=0;
while (count<100000){
	count++;
	rand=min+((int)(Math.random()*(max-min+1)));
	if (rand==1){
		heads++;
	}
	else{
		tails++;
	}
}
System.out.print("You have " +heads+ " Heads and "+tails+" Tails");
	}

}
