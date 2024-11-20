/* 
 * Write a Java program to copy one string to another string.
 */

import java.util.Scanner;

public class G_2 {
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);

      // variable
      System.out.print("Enter a value: ");
      String value = scan.nextLine();
      String copyOne = value;

      System.out.println("Copy Value: " + copyOne);

      scan.close();
   }
}
