import java.util.Scanner;

public class Conversion {
  
   public static void main (String[] args){

   Scanner input = new Scanner (System.in);
   
   System.out.print("pounds:  ");
   double pounds = input.nextDouble();
   
   double kilogram = pounds * 0.454;
   
   System.out.printf("the %.1f pounds is %.3f", pounds,kilogram);
   
   
   
   
   
   
   


   }

}
