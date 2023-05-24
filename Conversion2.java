import java.util.Scanner;

public class Conversion2 {

  public static void main(String[] args){
  
  Scanner input = new Scanner (System.in);
  
  System.out.print("Feet:  ");
  double Feet = input.nextDouble();
  
  double Meters = Feet * 0.305;
  
  System.out.printf("the %.1f Feet is %.3f", Feet,Meters);
  
  
  
  
  
  
  
  }
  
}
