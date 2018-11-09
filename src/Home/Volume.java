package Home;
import java.util.Scanner;

public class Volume {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
double base = -999.9;
double height = -999.9;
double width = -999.9;
double volume = -99.9;
Scanner input = new Scanner(System.in);
System.out.println("What is the base of the box?");
base = input.nextDouble();
System.out.println("What is the height of the box?");
height = input.nextDouble();
System.out.println("What is the width of the box?");
width = input.nextDouble();
volume = base * height * width;
System.out.println("the volume of the box is " + volume + " units cubed");


	}

}
