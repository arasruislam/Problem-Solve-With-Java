/* 
 * Write a Java program to count total number of words in a string.
 */

import java.util.Scanner;

public class G_10 {
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);

      // variable
      System.out.print("Enter a input: ");
      String input = scan.nextLine();

      int wordCount = input.split(" ").length;

      System.out.println("Total Word: "+wordCount);

      scan.close();
   }
}
