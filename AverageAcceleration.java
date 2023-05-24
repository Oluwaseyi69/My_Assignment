import java.util.Scanner;

public class AverageAcceleration {

  public static void main (String[] args){
  
  
    Scanner input = new Scanner(System.in);
  
  System.out.print( "Enter v0, v1 and t:  ");
  double startingVelocity = input.nextDouble();
  double endingVelocity = input.nextDouble();
  double time = input.nextDouble();
  
  double average = (endingVelocity - startingVelocity) / time; */
  
  System.out.print( "Enter your name: ");
  String air = input.nextLine();
  
  System.out.printf("The average of %.4f%n", average);
  System.out.printf("the %.1f average %.2f%n of %.3f%n", average, average, average);
  
  System.out.printf("My name is %s", air);
  System.out.printf("%s is My name. %n", air);
  }

}
