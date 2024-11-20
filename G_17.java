/* 
 * Write a Java program to count occurrences of a character in given string.
 */

import java.util.Scanner;

public class G_17 {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      // Input the string
      System.out.print("Enter a string: ");
      String input = scanner.nextLine();

      // Input the character to count
      System.out.print("Enter a character to count: ");
      char character = scanner.next().charAt(0);

      // Initialize counter
      int count = 0;

      // Count occurrences of the character
      for (int i = 0; i < input.length(); i++) {
         if (input.charAt(i) == character) {
            count++;
         }
      }

      // Output the result
      System.out.println("The character '" + character + "' appears " + count + " times in the string.");

      scanner.close();
   }
}
