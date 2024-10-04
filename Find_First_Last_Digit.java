/* 
 * Write a Java program to find first and last digit of any number.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Find_First_Last_Digit {
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

      System.out.println("");
      System.out.println("First Digit: " + digits.get(digits.size() - 1) + "\nLast digit: " + digits.get(0));
   }
}
