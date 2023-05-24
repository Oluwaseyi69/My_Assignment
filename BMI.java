import java.util.Scanner;

public class BMI {

  public static void main(String[] args){
  
  Scanner input = new Scanner (System.in);

  System.out.print("input weight in pounds: ");
  double pound = input.nextDouble();
  System.out.print("input height in inches: ");
  double inches = input.nextDouble();
  
  double aPound = 0.45359237;
  double anInch = 0.0254;
  
  double newPound = 0.45359237 * pound;
  double newInches = 0.0254 * inches;
  double height = newInches * newInches;
  
  double BodyMassIndex = newPound / height;
  
  System.out.printf("The Body Mass Index is %.4f%n", BodyMassIndex);  
  
  }
  
}
