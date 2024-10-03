/* 
 * Write a Java program to check whether a number is even or odd using switch case.
*/

import java.util.Scanner;

public class Even_Or_Odd_Switch_Case {
    public static void main(String[] args) {
        // Classes
        Scanner scan = new Scanner(System.in);

        // variable & inputs
        System.out.print("Enter the number: ");
        int number = scan.nextInt();

        // condition
        int result = (number % 2 == 0) ? 1 : 0;

        switch (result) {
            case 1:
                System.out.println("The number is even");
                break;
            case 0:
                System.out.println("The number is odd");
                break;
            default:
                System.out.println("Enter a valid number");
                break;
        }
    }
}
