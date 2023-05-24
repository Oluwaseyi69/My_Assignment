import java.util.Scanner;

public class Diameter{
   public static void main(String[] args){
    
   Scanner input = new Scanner(System.in);
   
   System.out.print("Enter the radius: ");
   int radius = input.nextInt();
   
   int Diameter = (2 * radius);
   System.out.printf("Diameter:%d%n", Diameter);
   }
   
}   
