import java.util.Scanner;

public class HelloWorld{

  public static void main(String[] args){
  
  Scanner input = new Scanner(System.in);
  
  double num1 = input.nextInt();
  double num2 = input.nextInt();
  
  double multiplication = num1 + num2; 
  
   System.out.printf("%n Hello World. %n Welcome to semicolon %n Where you'll be able write your first code and be a better person for yourself and the society,%n  %f%n", multiplication);
  
  
  }
}
