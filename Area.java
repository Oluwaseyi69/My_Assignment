import java.util.Scanner;

public class Area{
   public static void main(String[] args){
   
   Scanner input = new Scanner(System.in);
   
   System.out.print("Enter the radius:  ");
   double radius = input.nextDouble();
   
   double Area = (22 * radius * radius) / 7;
   
   System.out.printf("the Area: %.4f%n ", Area);
   
   
   
   
   }
   
}
