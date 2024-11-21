/* 
 * Write a Java program to find lowest frequency character in a string.
 */

import java.util.HashMap;
import java.util.Scanner;

public class G_19 {
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);

      // Input the string
      System.out.print("Enter a string: ");
      String input = scan.nextLine();
      input = input.replaceAll("\\s", "");

      // store value
      HashMap<Character, Integer> data = new HashMap<>();

      for (char ch : input.toCharArray()) {
         data.put(ch, data.getOrDefault(ch, 0) + 1);
      }

      // assume that
      char lowestChar = '\0';
      int lowestValue = 5;

      for (HashMap.Entry<Character, Integer> entry : data.entrySet()) {
         if (entry.getValue() < lowestValue) {
            lowestValue = entry.getValue();
            lowestChar = entry.getKey();
         }
      }

      System.out.println("Lowest frequency character: '" + lowestChar + "' with frequency: " + lowestValue);

      scan.close();
   }
}
