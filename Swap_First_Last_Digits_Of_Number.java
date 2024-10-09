/* 
 * Write a Java program to swap first and last digits of any number.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Swap_First_Last_Digits_Of_Number {
   public static void main(String[] args) {
      // Classes
      Scanner scan = new Scanner(System.in);
      ArrayList<Integer> digits = new ArrayList<Integer>();

      // Variable & inputs
      System.out.print("enter a number: ");
      int number = scan.nextInt();

      // convert negative number to positive value.
      boolean isNegative = number < 0;
      if (isNegative) {
         number = -number;
      }

      // application
      while (true) {
         if (number % 10 == 0)
            break;

         digits.add(number % 10);
         number /= 10;
      }

      // Swap the first and last digits in the array
      if (digits.size() > 1) {
         int temp = digits.get(0);
         digits.set(0, digits.get(digits.size() - 1));
         digits.set(digits.size() - 1, temp);
      }

      // swap value
      int swappedNumber = 0;
      for (int i = digits.size() - 1; i >= 0; i--) {
         swappedNumber = swappedNumber * 10 + digits.get(i);
      }

      if (isNegative) {
         swappedNumber = -swappedNumber;
      }

      System.out.println("Number after swapping first and last digits: " + swappedNumber);
   }
}
