/* 
 * Write a Java program to find sum of first and last digit of any number.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Sum_Of_First_Last_Digit {
   public static void main(String[] args) {
      // Classes
      Scanner scan = new Scanner(System.in);
      ArrayList<Integer> digits = new ArrayList<Integer>();

      // Variable & inputs
      System.out.print("enter a number: ");
      int number = scan.nextInt();

      // convert negative number to positive value.
      if (number < 0) {
         number = -number;
      }

      // application
      while (true) {
         if (number % 10 == 0)
            break;

         digits.add(number % 10);
         number /= 10;
      }

      // first and last digits sum
      int sum = digits.get(0) + digits.get(digits.size() - 1);

      // Output
      System.out.println("Sum of first and last digits: " + sum);
   }
}
