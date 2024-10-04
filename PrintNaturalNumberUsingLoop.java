/* 
 * write a java program to enter any number and calculate sum of all natural numbers between 1 to n.
 */

import java.util.Scanner;

public class PrintNaturalNumberUsingLoop {
   public static void main(String[] args) {
      // Classes
      Scanner scan = new Scanner(System.in);

      // variable & inputs
      int sum = 0;

      System.out.print("Enter any integer number: ");
      int n = scan.nextInt();

      // application of program
      System.out.println("");
      while (n > 0) {
         sum += n;
         n -= 1;
      }
      System.out.println(sum);
   }
}
