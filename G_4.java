/* 
 * Write a Java program to compare two strings.
 */

import java.util.Scanner;

public class G_4 {
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);

      // variable
      System.out.print("Enter a value: ");
      String value = scan.nextLine();

      System.out.print("Enter a another value: ");
      String valueTwo = scan.nextLine();

      if (value.equals(valueTwo)) {
         System.out.println("Both are same");
      } else {
         System.out.println("Not same");
      }
      scan.close();

   }
}
