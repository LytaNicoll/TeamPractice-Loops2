package Home;
import java.util.Scanner;
public class Dice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Scanner input=new Scanner(System.in)){
double ones=0;
double twos=0;
double threes=0;
double fours=0;
double fives=0;
double sixes=0;
int count=0;
int max=6;
int min=1;
int rand=0;
System.out.println("How many times is this die rolled?");
double times=input.nextDouble();
while (count<times){
	count++;
	rand=min+((int)(Math.random()*(max-min+1)));
	if(rand==1){
		ones++;
	}
	if(rand==2){
		twos++;
	}
	if(rand==3){
		threes++;
	}
	if(rand==4){
		fours++;
	}
	if(rand==5){
		fives++;
	}
	if(rand==6){
		sixes++;
	}
}System.out.println("There were "+(int)ones+ " ones, "+(int)twos+" twos, "+(int)threes+" threes, "+(int)fours+" fours, "+(int)fives+" fives, and "+(int)sixes+" sixes.");
	System.out.println("Percent ones: "+(int)((ones/times)*100)+"%");
	System.out.println("Percent twos: "+(int)((twos/times)*100)+"%");
	System.out.println("Percent threes: "+(int)((threes/times)*100)+"%");
	System.out.println("Percent fours: "+(int)((fours/times)*100)+"%");
	System.out.println("Percent fives: "+(int)((fives/times)*100)+"%");
	System.out.println("Percent sixes: "+(int)((sixes/times)*100)+"%");
	}

}
}