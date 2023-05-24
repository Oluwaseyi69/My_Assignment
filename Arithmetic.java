import java.util.Scanner;

public class Arithmetic{

   public static void main(String[] args){
   
   Scanner input = new Scanner(System.in);
   
   System.out.print("Enter first number:");
   int number1 = input.nextInt();
   System.out.print("Enter second number: ");
   int number2 = input.nextInt();
      
   
   int Square1 = (number1 * number1);
   int Square2 = (number2 * number2);
   int Sum = (Square1 + Square2);
   int Difference = (Square2 - Square1);
   
   System.out.printf("Square1 %d%nSquare2 %d%nsum %d%ndifference %d%n", Square1, Square2, Sum, Difference);
   
   }
}
