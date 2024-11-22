/* 
 * write a java program to replace all occurrences of a character with another in a string.
 */

import java.util.Scanner;

public class G_27 {
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);

      // variable
      System.out.print("Enter an input: ");
      String input = scan.nextLine();

      System.out.print("Enter a character to find: ");
      char ch = scan.next().charAt(0);

      System.out.print("Enter a character to replace all occurrence: ");
      char repCh = scan.next().charAt(0);

      for (int i = 0; i < input.length(); i++) {
         if (input.charAt(i) == ch) {
            input = input.substring(0, i) + repCh + input.substring(i + 1);
         }
      }

      System.out.println("Updated Result: " + input);

      scan.close();

   }
}
