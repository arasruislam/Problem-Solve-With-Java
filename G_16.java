/* 
 * Write a Java program to search all occurrences of a character in given string.
 */

import java.util.Scanner;

public class G_16 {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      // Input the string
      System.out.print("Enter a string: ");
      String input = scanner.nextLine();

      // Input the character to search
      System.out.print("Enter a character to find: ");
      char character = scanner.next().charAt(0);

      // Flag to check if the character is found
      boolean found = false;

      // Search for all occurrences
      System.out.println("The character '" + character + "' is found at the following indices:");
      for (int i = 0; i < input.length(); i++) {
         if (input.charAt(i) == character) {
            System.out.print(i + " ");
            found = true;
         }
      }

      // If no occurrence found
      if (!found) {
         System.out.println("The character '" + character + "' is not found in the string.");
      }

      scanner.close();
   }
}
