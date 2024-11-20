/* 
 * Write a Java program to check whether a string is palindrome or not.
 */

import java.util.Scanner;

public class G_12 {
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);

      // variable
      System.out.print("Enter a input: ");
      String input = scan.nextLine();

      int flag = 0;

      for (int i = 0; i < input.length() / 2; i++) {
         if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
            flag++;
            break;
         }
      }

      if (flag == 0) {
         System.out.println("Palindrome");
      } else {
         System.out.println("Not palindrome");
      }

      scan.close();
   }
}
