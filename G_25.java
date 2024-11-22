/* 
 * write a java program to replace first occurrence of a character with another in a string
 */

import java.util.Scanner;

public class G_25 {
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);

      // variable
      System.out.print("Enter a input: ");
      String input = scan.nextLine();

      System.out.print("Enter a character for find: ");
      String ch = scan.nextLine();

      System.out.print("Enter a character to replace: ");
      String repCh = scan.nextLine();

      int index = input.indexOf(ch);

      if (index != -1) {
         String result = input.substring(0, index) + repCh + input.substring(index + 1);

         System.out.println("Modified string: " + result);
      } else {
         System.out.println("The character '" + ch + "' is not found in the string.");
      }

      scan.close();
   }
}
