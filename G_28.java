/* 
 * write a java program to find first occurrence of a word in a given string.
 */

import java.util.Scanner;

public class G_28 {
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);

      // variable
      System.out.print("Enter an input: ");
      String input = scan.nextLine();

      System.out.println("Enter the word you want to find: ");
      String word = scan.nextLine();

      int index = input.indexOf(word);

      if (index == -1) {
         System.out.println("The word '" + word + "' is not found in the string.");
      } else {
         System.out.println("The word '" + word + "' is found at index: " + index);
      }

      scan.close();
   }
}
