import java.util.Scanner;

public class Runwaylength{ 
   
   public static void main(String[] args){
   
   Scanner input = new Scanner(System.in);
   
   System.out.print("Enter Speed and Acceleration:  ");
   double Speed = input.nextDouble();
   double Acceleration = input.nextDouble();
   
   double length = (Speed * Speed) / (2 * Acceleration);
   
   System.out.printf("The length of %.3f%n", length);
   
   }
   
}

