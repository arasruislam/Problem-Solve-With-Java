/* 
 * Write a Java program to concatenate two strings.
 */

import java.util.Scanner;

public class G_3 {
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);

      // variable
      System.out.print("Enter a value: ");
      String value = scan.nextLine();

      System.out.print("Enter a another value: ");
      String valueTwo = scan.nextLine();

      String concati = value + valueTwo;
      // String concatiWayTwo = value.concat(valueTwo);

      System.out.println(concati);
      scan.close();
   }
}
