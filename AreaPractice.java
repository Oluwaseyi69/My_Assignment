import java.util.Scanner;

public class AreaPractice{

  public static void main(String[] args){
  
  Scanner input = new Scanner(System.in);
  
  System.out.print("Enter radius: ");
  double radius = input.nextDouble();
  
  double Area = (22 * radius * radius) / 7;
  
  System.out.printf("Area %.2f%n", Area);

}
}
