/* 
 * write a java program to remove first occurrence of a word from string.
 */

import java.util.Scanner;

public class G_32 {
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);

      // variable
      System.out.print("Enter an input: ");
      String input = scan.nextLine();

      System.out.print("The word want to remove from first occurrence: ");
      String removeWord = scan.nextLine();
      int index = input.indexOf(removeWord);

      String[] words = input.split("\\s+");
      String newStr = "";
      // StringBuilder builder = new StringBuilder();

      // for (int i = 0; i < input.length(); i++) {
      //    builder.append(input.charAt(i));
      // }

      for(String w: words){
         if (!w.equals(removeWord)) {
            newStr = words + " ";
         }
      }

      // builder.delete(index, index + removeWord.length() + 1);

      System.out.println("Output: " + newStr.toString());

      scan.close();
   }
}
