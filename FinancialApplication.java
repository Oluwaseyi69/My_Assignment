import java.util.Scanner;

public class FinancialApplication {
	
   public static void main (String[] args){
   
   Scanner input = new Scanner(System.in);
   
   System.out.print("balance; (annualInterestRate/1200);");
   double balance = input.nextDouble();
   double annualInterestRate = input.nextDouble();
   
   double interest = balance * (annualInterestRate/1200);
   
   System.out.printf("the interest of %f", interest); 
   
   
   
   
   
   }
   
}
