/* 
 * write a java program to print table of any number.
 */

import java.util.Scanner;

public class PrintTableUsingLoop {
   public static void main(String[] args) {
      // Classes
      Scanner scan = new Scanner(System.in);

      // variable & inputs
      System.out.print("Enter a number to create print table: ");
      int n = scan.nextInt();

      // application of print table
      System.out.println("");
      for (int i = 1; i <= n; i++) {
         System.out.println(n + " * " + i + " = " + (i * n));
      }
   }
}
