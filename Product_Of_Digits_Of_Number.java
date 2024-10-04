/* 
 * Write a Java program to calculate product of digits of any number.
 */

import java.util.Scanner;

public class Product_Of_Digits_Of_Number {
   public static void main(String[] args) {
      // Classes
      Scanner scan = new Scanner(System.in);

      // variable and inputs
      int product = 1;

      System.out.print("Enter a number: ");
      int number = scan.nextInt();

      // convert negative number to positive value.
      if (number < 0) {
         number = -number;
      }

      // application
      if (number == 0)
         product = 0;
      while (number > 0) {
         product *= (number % 10);
         number /= 10;
      }

      System.out.println("sum of digits: " + product);
   }
}
