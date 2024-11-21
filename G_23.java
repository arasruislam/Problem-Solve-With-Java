/* 
 * Write a Java program to remove all occurrences of a character from string.
 */

import java.util.Scanner;

public class G_23 {
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);

      // variable
      System.out.print("Enter a input: ");
      String input = scan.nextLine();

      System.out.print("Enter a character for find: ");
      char ch = scan.next().charAt(0);

      boolean found = false;

      for (int i = 0; i < input.length(); i++) {
         if (input.charAt(i) == ch) {
            input = input.substring(0, i) + input.substring(i+1);
            found = true;
         }
      }

      if (!found) {
         System.out.println("The character '" + ch + "' is not found in the string.");
      }

      System.out.println("After remove '" + ch + "' all occurrence the result is: " + input);

      scan.close();
   }
}
