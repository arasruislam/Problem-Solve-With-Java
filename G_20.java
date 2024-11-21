/* 
 * Write a Java program to count frequency of each character in a string.
 */

import java.util.HashMap;
import java.util.Scanner;

public class G_20 {
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);

      // Input the string
      System.out.print("Enter a string: ");
      String input = scan.nextLine();
      input = input.replaceAll("\\s", "");

      // store value
      HashMap<Character, Integer> data = new HashMap<>();

      // put value
      for (char ch : input.toCharArray()) {
         data.put(ch, data.getOrDefault(ch, 0) + 1);
      }

      for (HashMap.Entry<Character, Integer> entry : data.entrySet()) {
         System.out.println(entry.getKey() + " : " + entry.getValue());
      }

      scan.close();
   }
}
