/* 
 * 9) Write a Java program to count total number of vowels and consonants in a string.
 */

import java.util.Scanner;

public class G_9 {
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);

      // variable
      System.out.print("Enter a input: ");
      String input = scan.nextLine();

      int vowels = 0, consonants = 0;

      for (int i = 0; i < input.length(); i++) {
         char ch = input.charAt(i);

         if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
               || ch == 'O' || ch == 'U') {
            vowels++;
         } else {
            consonants++;
         }

      }

      System.out.println("Total vowels: " + vowels + "\nTotal consonants: " + consonants);

      scan.close();
   }
}
