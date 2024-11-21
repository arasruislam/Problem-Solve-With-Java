/* 
 *  Write a Java program to find highest frequency character in a string.
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class G_18 {
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);

      // Input the string
      System.out.print("Enter a string: ");
      String input = scan.nextLine();
      input = input.replaceAll("\\s", "");

      // store frequency data
      Map<Character, Integer> data = new HashMap<>();

      for (int i = 0; i < input.length(); i++) {
         data.put(input.charAt(i), data.getOrDefault(input.charAt(i), 0) + 1);
      }

      // assume value
      char maxChar = '\0';
      int maxValue = 0;

      // way-1 : entry set

      for (Map.Entry<Character, Integer> entry : data.entrySet()) {
         if (entry.getValue() > maxValue) {
            maxValue = entry.getValue();
            maxChar = entry.getKey();
         }
      }

      System.out.println("Highest frequency character: '" + maxChar + "' with frequency: " + maxValue);

      scan.close();

   }
}
