/* 
 * Write a Java program to toggle case of each character of a string.
 */

import java.util.Scanner;

public class G_7 {
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);

      // variable
      System.out.print("Enter a input: ");
      String input = scan.nextLine();

      String toggle = toggleCase(input);
      System.out.println("Output: " + toggle);
   }

   public static String toggleCase(String input) {
      StringBuilder sb = new StringBuilder();

      for (int i = 0; i < input.length(); i++) {
         char ch = input.charAt(i);

         if (Character.isUpperCase(ch)) {
            sb.append(Character.toLowerCase(ch));
         } else if (Character.isLowerCase(ch)) {
            sb.append(Character.toUpperCase(ch));
         } else {
            sb.append(ch);
         }
      }

      return sb.toString();
   }
}
