/* 
 * Write a Java program to calculate sum of digits of any number.
 */

import java.util.Scanner;

public class Sum_Of_Digits_Of_Number {
   public static void main(String[] args) {
      // Classes
      Scanner scan = new Scanner(System.in);

      // variable and inputs
      int digitSum = 0;

      System.out.print("Enter a number: ");
      int number = scan.nextInt();

      // convert negative number to positive value.
      if (number < 0) {
         number = -number;
      }

      // application
      while (number > 0) {
         digitSum += (number % 10);
         number /= 10;
      }

      System.out.println("sum of digits: "+ digitSum);
   }
}