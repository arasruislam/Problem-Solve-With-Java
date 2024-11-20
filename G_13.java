/* 
 * Write a Java program to reverse order of words in a given string.
 * 
 */

import java.util.Scanner;

public class G_13 {
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);

      // variable
      System.out.print("Enter a input: ");
      String input = scan.nextLine();

      String[] words = input.split(" ");

      for (int i = words.length - 1; i >= 0; i--) {
         System.out.print(words[i] + " ");

      }
      scan.close();
   }
}
