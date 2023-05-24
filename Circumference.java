import java.util.Scanner;

public class Circumference{

   public static void main(String[] args){
   
   Scanner input = new Scanner(System.in);
   
   System.out.print("Enter the radius: ");
   int radius = input.nextInt();
   
   int Circumference = (2 * 22 * radius) / 7;
   System.out.printf("Circumference:%d%n", Circumference);
   
   }
}
