import java.util.Scanner;

public class CalculatingEnergy {

    public static void main(String[] args){
	
    Scanner input = new Scanner(System.in);
	
    System.out.print( "Enter the amount of water");
    double Weight = input.nextDouble();
    System.out.print("Enter the final temperature");
    double finalTemperature = input.nextDouble();
    System.out.print("Enter the initial temperature");
    double initialTemperature = input.nextDouble();
	
    double Energy = Weight * (finalTemperature - initialTemperature) * 4184;
	
    System.out.printf( "the Energy of %.1f%n", Energy);
	
	
	
	
	}

}

