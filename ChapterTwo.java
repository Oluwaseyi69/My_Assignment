import java.util.Scanner;

public class ChapterTwo{

  public static void main(String[] arg){
  
   Scanner input = new Scanner(System.in);
   
   System.out.print("Enter num1");
   double num1 = input.nextDouble();
   System.out.print("Enter num2");
   double num2 = input.nextDouble();
   System.out.print("Enter num3");
   double num3 = input.nextDouble();
   
   double Average = (num1 + num2 + num3) / 3;
   
   System.out.printf("the Average of %f%n", Average);
  
  }

}
