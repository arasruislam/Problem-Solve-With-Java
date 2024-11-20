/* 
 * Write a Java program to find first occurrence of a character in a given string.
 */

import java.util.Scanner;

public class G_14 {
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);

      // variable
      System.out.print("Enter a input: ");
      String input = scan.nextLine();

      System.out.print("Enter a character for find: ");
      String ch = scan.nextLine();

      int index = input.indexOf(ch);

      if (index != -1) {
         System.out.println("The first occurrence is '" + ch + "' is at index: " + index);
      } else {
         System.out.println("The character '" + ch + "' is not found in the string.");
      }

      scan.close();
   }
}
