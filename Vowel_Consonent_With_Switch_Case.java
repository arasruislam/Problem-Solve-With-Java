/* 
 * Write a Java program to check whether an alphabet is vowel or consonant using
   switch case.
 */

import java.util.Scanner;

public class Vowel_Consonent_With_Switch_Case {
    public static void main(String[] args) {
        // Classes
        Scanner scan = new Scanner(System.in);

        // variable & inputs
        System.out.print("Enter alphabet: ");
        char alphabet = scan.next().charAt(0);

        switch (alphabet) {
            case 'a':
                System.out.println("It's an alphabet");
                break;
            case 'e':
                System.out.println("It's an alphabet");
                break;
            case 'i':
                System.out.println("It's an alphabet");
                break;
            case 'o':
                System.out.println("It's an alphabet");
                break;
            case 'u':
                System.out.println("It's an alphabet");
                break;
            default:
                System.out.println("It's an consonant");
                break;
        }
    }
}
