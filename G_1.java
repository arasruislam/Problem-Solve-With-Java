/* 
 * Write a Java program to find length of a string.
 */

import java.util.Scanner;

public class G_1 {
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);

      // variable
      System.out.print("Enter a value: ");
      String value = scan.nextLine();

      System.out.println("Length: " + value.length());
      scan.close();
   }
}
