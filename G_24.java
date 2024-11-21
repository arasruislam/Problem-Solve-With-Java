/* 
 * Write a Java program to remove all repeated characters from a given string.
 */

import java.util.HashSet;
import java.util.Scanner;

public class G_24 {
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);

      // variable
      System.out.print("Enter a input: ");
      String input = scan.nextLine();

      // hash set for track unique value
      HashSet<Character> data = new HashSet<>();
      StringBuilder finalData = new StringBuilder();

      for (char ch : input.toCharArray()) {
         if (!data.contains(ch)) {
            data.add(ch);
            finalData.append(ch);
         }
      }

      System.out.println("Final Output: " + finalData);

      scan.close();
   }
}
