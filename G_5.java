/* 
 * Write a Java program to convert lowercase string to uppercase.
 */

import java.util.Scanner;

public class G_5 {
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);

      // variable
      System.out.print("Enter a lowercase value to get uppercase: ");
      String value = scan.nextLine();

      String updatedValue = value.toUpperCase();

      System.out.println("Updated Value: " + updatedValue);
      scan.close();
   }

}
