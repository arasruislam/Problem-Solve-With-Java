/* 
 * write a java program to replace last occurrence of a character with another in a string.
 */

import java.util.Scanner;

public class G_26 {
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);

      // variable
      System.out.print("Enter an input: ");
      String input = scan.nextLine();

      System.out.print("Enter a character to find: ");
      char oldCh = scan.next().charAt(0);

      System.out.print("Enter a character to replace last occurrence: ");
      char newCh = scan.next().charAt(0);

      int index = input.lastIndexOf(oldCh);

      if (index != -1) {
         String result = input.substring(0, index) + newCh + input.substring(index + 1);

         System.out.println("Modified: " + result);
      } else {
         System.out.println("The character '" + oldCh + "' is not found in the string.");
      }


      scan.close();
   }
}
