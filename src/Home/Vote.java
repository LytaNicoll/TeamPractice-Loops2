package Home;
import java.util.Scanner;
public class Vote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int age = -999;
int yearsVote = -999;
Scanner input = new Scanner(System.in);
System.out.println("What is your age?");
age = input.nextInt();
yearsVote =18-age;
System.out.println(yearsVote + " you can vote");

	}

}
