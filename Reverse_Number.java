/* 
 * Write a Java program to enter any number and print its reverse.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Reverse_Number {
   public static void main(String[] args) {
      // Classes
      Scanner scan = new Scanner(System.in);
      ArrayList<Integer> digits = new ArrayList<Integer>();

      // Variable & inputs
      System.out.print("enter a number: ");
      int number = scan.nextInt();

      // application
      while (true) {
         if (number % 10 == 0)
            break;

         digits.add(number % 10);
         number /= 10;
      }

      // swap number
      int swapNumber = 0;
      for (int i = 0; i < digits.size(); i++) {
         swapNumber *= 10;
         swapNumber += digits.get(i);
      }
      // Output
      System.out.println("Reverse Number: " + swapNumber);
   }
}
