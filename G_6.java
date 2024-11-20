/* 
 * Write a Java program to convert uppercase string to lowercase.
 */

import java.util.Scanner;

public class G_6 {
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);

      // variable
      System.out.print("Enter a uppercase value to get lowercase: ");
      String value = scan.nextLine();

      String updatedValue = value.toLowerCase();

      System.out.println("Updated Value: " + updatedValue);
      scan.close();
   }
}
