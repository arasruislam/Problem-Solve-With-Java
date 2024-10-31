import java.util.Scanner;

public class PowerOfAnyNumberUsingLoop {
   public static void main(String[] args) {
      // classes
      Scanner scan = new Scanner(System.in);

      // Variable and inputs
      int base, power, result;

      System.out.print("Enter the base number: ");
      base = scan.nextInt();
      System.out.print("Enter the power: ");
      power = scan.nextInt();

      // Calculation
      result = 1;

      for (int i = 1; i <= power; i++) {
         result *= base;
      }

      System.out.println("The Value is: " + result);
   }
}
