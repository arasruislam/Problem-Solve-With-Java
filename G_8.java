/* 
 * Write a Java program to find total number of alphabets, digits or special character in a string.
 */

import java.util.Scanner;

public class G_8 {
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);

      // variable
      System.out.print("Enter a input: ");
      String input = scan.nextLine();

      int alphabets = 0, digits = 0, special = 0;

      for (int i = 0; i < input.length(); i++) {
         char ch = input.charAt(i);

         if (ch >= 48 && ch <= 57) {
            digits++;
         } else if ((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122)) {
            alphabets++;
         } else {
            special++;
         }
      }

      System.out.println("Total Alphabet: "+ alphabets + "\nTotal Digits: "+ digits + "\nTotal Special: "+ special);

      scan.close();
   }
}
