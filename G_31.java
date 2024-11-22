/* 
 * write a java program to count occurrences of a word in a given string.
 */

import java.util.Scanner;

public class G_31 {
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);

      // variable
      System.out.print("Enter an input: ");
      String input = scan.nextLine();

      System.out.print("Enter the word you want to count: ");
      String word = scan.nextLine();

      String[] words = input.split("\\s+");
      int count = 0;

      for (String wd : words) {
         if (wd.equals(word)) {
            count++;
         }
      }

      System.out.println("The word '" + word + "' appears " + count + " times in the string.");

      scan.close();
   }
}
