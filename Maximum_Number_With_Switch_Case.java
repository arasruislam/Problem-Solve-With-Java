/* 
 * Write a Java program to find maximum between two numbers using switch case.
 */

import java.util.Scanner;

public class Maximum_Number_With_Switch_Case {
    public static void main(String[] args) {
        // Classes
        Scanner scan = new Scanner(System.in);

        // variable & inputs
        System.out.print("Enter first number: ");
        int num_1 = scan.nextInt();

        System.out.print("Enter second number: ");
        int num_2 = scan.nextInt();

        // condition
        int result = (num_1 > num_2) ? 1 : (num_1 < num_2) ? -1 : 0;

        switch (result) {
            case 1:
                System.out.println(num_1 + " is maximum number");
                break;
            case -1:
                System.out.println(num_2 + " is maximum number");
                break;
            case 0:
                System.out.println("Both number are equal");
                break;
        }
    }
}
