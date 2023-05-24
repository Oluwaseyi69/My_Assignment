import java.util.Scanner;

public class ArithmeticSmallest{

   public static void main(String[] args){
   
   Scanner input = new Scanner(System.in);
   
   System.out.print("Enter first number: ");
   int number1 = input.nextInt();
   System.out.print("Enter second number: ");
   int number2 = input.nextInt();
   System.out.print("Enter third number: ");
   int number3 = input.nextInt();
   
   int sum = (number1 + number2 + number3);
   int average = (number1 + number2 + number3) / 3;
   int product = (number1 * number2 * number3);
   
   int Smallest;
   Smallest = number1;
   if (number2 < number1){
   Smallest = number2;
   }
   if (number3 < number2){
   Smallest = number3;
   }
   
   int Largest;
   Largest = number1;
   if (number2 > number1){
   Largest = number2;
   }
   if (number3 > number2){
   Largest = number3;
   }
   
   System.out.printf("Sum: %d%nAverage: %d%nProduct: %d%nLargest: %d%nSmallest %d%n", sum, average, product, Largest, Smallest);
   }
}
