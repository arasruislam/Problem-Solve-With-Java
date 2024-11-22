/* 
 * write a java program to search all occurrences of a word in given string.
 */

import java.util.Scanner;

public class G_30 {
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);

      // variable
      System.out.print("Enter an input: ");
      String input = scan.nextLine();

      System.out.print("Enter word to find its all occurrence: ");
      String word = scan.nextLine();

      int index = input.indexOf(word);
      int count = 0;

      while (index != -1) {
         count++;
         index = input.indexOf(word, index + word.length());
      }

      if (count == 0) {
         System.out.println("The word '" + word + "' is not found in the string.");
      } else {
         System.out.println("The word '" + word + "' occurred " + count + " times.");
      }

      scan.close();
   }
}
