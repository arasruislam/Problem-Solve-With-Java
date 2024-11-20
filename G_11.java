/* 
 * Write a Java program to find reverse of a string.
 */

import java.util.Scanner;

public class G_11 {
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);

      // variable
      System.out.print("Enter a input: ");
      String input = scan.nextLine();

      StringBuilder str = new StringBuilder();

      for (int i = input.length() - 1; i >= 0; i--) {
         str.append(input.charAt(i));
      }

      System.out.println("Reverse: " + str.toString());

      scan.close();
   }
}
