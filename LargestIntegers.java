import java.util.Scanner;
public class LargestIntegers{

   public static void main(String[] args){
     Scanner input = new Scanner(System.in);
     
     System.out.print("Enter the first number:");
     int num1 = input.nextInt();
     System.out.print("Enter the second number:");
     int num2 = input.nextInt();
     System.out.print("Enter the third number:");
     int num3 = input.nextInt();
     System.out.print("Enter the fourth number:");
     int num4 = input.nextInt();
     System.out.print("Enter the fifth number:");
     int num5 = input.nextInt();
     
     int Largest;
     Largest = num1;
     if (num2 > num1){
      Largest = num2;
     } 
     
     if (num3 > num2){
     Largest = num3;
     }
     
     if (num4 > num3){
     Largest = num4;
     }
     
     if (num5 > num4){
     Largest = num5;
     }
     
     int Smallest;
     Smallest = num1;
     if (num2 < num1){
     Smallest = num2;
     }
     if (num3 < num2){
     Smallest = num3;
     }
     if (num4 < num3){
     Smallest = num4;
     }
     if (num5 < num4){
     Smallest = num5;
     }
     
     System.out.printf("Largest %d%nSmallest %d%n", Largest, Smallest);
}
}
