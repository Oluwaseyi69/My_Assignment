import java.util.Scanner;

public class CostOfDriving {

	public static void main (String[] args ){
	
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter the driving distance");
	double drivingDistance = input. nextDouble();
	System.out.print("Enter the miles per gallon");
	double milesPerGallon = input. nextDouble();
	System.out.print("Enter the price per gallon");
	double pricePerGallon = input. nextDouble();
	
	double CostOfDriving = drivingDistance*(pricePerGallon/milesPerGallon);
	System.out.printf(" The cost of driving is %.2f%n", costOfDriving);
	
	
	
	
	
	
	
	}
	
}
