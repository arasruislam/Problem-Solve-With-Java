/* 
 * Write a Java program to check whether a character is uppercase or lowercase
   alphabet.
 */

import java.util.Scanner;

public class Uppercase_Or_Lowercase {
    public static void main(String[] args) {
        // classes
        Scanner scan = new Scanner(System.in);

        while (true) {
            // Ask to user
            // System.out.println("");
            System.out.println("Enter 1: Start to input value");
            System.out.println("Enter 2: Stop");

            System.out.print("Enter: ");
            int input = scan.nextInt();

            if (input == 1) {
                // varibale & inputs
                System.out.println("");
                System.out.print("Enter the alphabet: ");

                char letter = scan.next().charAt(0);
                int dec = (int) letter;

                if (dec >= 65 && dec <= 90) {
                    System.out.println("This is an uppercase alphabet.");
                    System.out.println("");
                } else if (dec >= 97 && dec <= 122) {
                    System.out.println("This is an lowercase alphabet.");
                    System.out.println("");
                } else {
                    System.out.println("Unexpected character input");
                    System.out.println("");
                }

            } else if (input == 2) {
                System.out.println("\n");
                System.out.println("Stop.");
                break;
            } else {
                System.out.println("Invalid Input");
                System.out.println("");
            }
        }
    }
}
