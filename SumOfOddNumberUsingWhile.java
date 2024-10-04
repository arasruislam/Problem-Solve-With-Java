/* 
 * Write a java program to print sum of all odd numbers between 1 to n.
 */

import java.util.Scanner;

public class SumOfOddNumberUsingWhile {
   public static void main(String[] args) {
      // Classes
      Scanner scan = new Scanner(System.in);

      // variable & inputs
      int OddNumberSum = 0;
      System.out.print("Enter natural number to get odd number sum: ");
      int n = scan.nextInt();

      // condition
      System.out.println("");
      while (n > 0) {
         if (n % 2 == 1)
            OddNumberSum += n;

         n -= 1;
      }

      // Output
      System.out.println("Output: " + OddNumberSum);
   }
}
