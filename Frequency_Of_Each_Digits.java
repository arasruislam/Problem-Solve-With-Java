/* 
 * Write a Java program to find frequency of each digit in a given integer.
 */

import java.util.Scanner;

public class Frequency_Of_Each_Digits {
   public static void main(String[] args) {
      // Classes
      Scanner scan = new Scanner(System.in);

      // Array
      int[] frequency = new int[10];

      // variable & inputs
      System.out.println("");
      System.out.print("enter a number: ");
      int number = scan.nextInt();

      // convert negative number to positive number
      if (number < 0) {
         number = -number;
      }

      // application
      while (true) {
         if (number % 10 == 0)
            break;

         int digit = number % 10;
         frequency[digit]++;
         number /= 10;
      }

      // Output the frequencies of each digit
      System.out.println("");
      System.out.println("Digit frequencies: ");
      for (int i = 0; i < frequency.length - 1; i++) {
         if (frequency[i] > 0) {
            System.out.println(i + ": " + frequency[i] + " times");
         }
      }

   }
}
