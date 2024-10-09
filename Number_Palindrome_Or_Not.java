/* 
 * Write a Java program to enter any number and check whether the number is palindrome or not.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Number_Palindrome_Or_Not {
   public static void main(String[] args) {
      // Classes
      Scanner scan = new Scanner(System.in);
      ArrayList<Integer> digits = new ArrayList<Integer>();

      while (true) {
         // Ask to user
         System.out.println("");
         System.out.println("Enter 1: Start to input value");
         System.out.println("Enter 2: Stop");

         System.out.print("Enter: ");
         int input = scan.nextInt();

         if (input == 1) {
            // Variable & inputs
            System.out.println("");
            System.out.print("enter a number: ");
            int number = scan.nextInt();
            int temp = number;

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

            if (swapNumber == temp) {
               System.out.println("The number is palindrome.");
            } else {
               System.out.println("The number is not palindrome.");
            }

         } else if (input == 2) {
            System.out.println("");
            System.out.println("Stop.");
            break;
         } else {
            System.out.println("Invalid Input");
            System.out.println("");
         }
      }
   }
}
