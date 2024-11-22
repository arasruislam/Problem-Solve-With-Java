/* 
 * write a java program to find last occurrence of a word in a given string.
 */

import java.util.Scanner;

public class G_29 {
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);

      // variable
      System.out.print("Enter an input: ");
      String input = scan.nextLine();

      System.out.print("Enter word to find its last occurrence: ");
      String word = scan.nextLine();

      int index = input.lastIndexOf(word);

      if (index == -1) {
         System.out.println("The word '" + word + "' is not found in the string.");
      } else {
         System.out.println("The word '" + word + "' is found at index: " + index);
      }

      scan.close();
   }
}
