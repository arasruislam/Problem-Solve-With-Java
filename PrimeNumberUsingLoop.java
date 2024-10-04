/* 
 * write a program to print prime numbers between 1 to n.
 */

import java.util.Scanner;

public class PrimeNumberUsingLoop {
   static boolean isPrime(int n) {
      if (n <= 2) {
         return (n == 2) ? true : false;
      }
      for (int i = 2; i <= Math.sqrt(n); i++) {
         if (n % i == 0) {
            return false;
         }
      }
      return true;
   }

   public static void main(String[] args) {
      // Classes
      Scanner scan = new Scanner(System.in);

      // variable & inputs
      System.out.print("enter a integer value between (1 to n): ");
      int n = scan.nextInt();

      // calculation
      for (int i = 1; i <= n; i++) {
         if (isPrime(i)) {
            System.out.print(i + " ");
         }
      }
      System.out.println("");
   }
}
