import java.util.Scanner;

public class ComparingIntegers{

   public static void main(String[] args){
   
   Scanner input = new Scanner(System.in);
   
   System.out.print("Enter first Integer:");
   int number1 = input.nextInt();
   int Square = number1 * number1;
   int plus = Square + number1;
   
   if (plus > 100){
   System.out.printf("%d is greater than 100. %n", plus);
   }
   if (plus < 100){
   System.out.printf("%d is less than 100. %n", plus);
   }
   if (plus == 100){
   System.out.printf("%d is equal to 100. %n", plus);
   }
   if (plus != 100){
   System.out.printf("%d is not equal to 100. %n", plus);
   }
   
   
  }	
}
