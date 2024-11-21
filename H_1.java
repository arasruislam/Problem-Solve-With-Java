/* 
 * write a java program to find cube of any number using function.
 */

import java.util.Scanner;

public class H_1 {
   static double CubeValue(int val) {
      return Math.pow(val, 3);
   }

   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);

      // variable
      System.out.print("Enter a number to get its cube: ");
      int value = scan.nextInt();

      int result = (int) CubeValue(value);
      System.out.println("Result: " + result);

      scan.close();
   }
}
