/* 
 * Write a Java program to count number of digits in any number.
 */

import java.util.Scanner;

public class Count_Digits_Of_Number {
   public static void main(String[] args) {
      // Classes
      Scanner scan = new Scanner(System.in);

      // Variable & inputs
      int digitCount = 0;

      System.out.print("Enter a number: ");
      int number = scan.nextInt();

      // convert negative number to positive value.
      if (number < 0) {
         number = -number;
      }
      // application
      while (number > 0) {
         digitCount++;
         number /= 10;
      }

      System.out.println("Total digits: "+digitCount);
   }
}
