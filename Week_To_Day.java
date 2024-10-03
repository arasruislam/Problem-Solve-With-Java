/* 
 * Write a Java program to input week number and print week day.
*/

import java.util.Scanner;

public class Week_To_Day {
    public static void main(String[] args) {
        // Classes
        Scanner scan = new Scanner(System.in);

        while (true) {
            // Ask to user
            System.out.println("");
            System.out.println("Enter 1: Start to enter value");
            System.out.println("Enter 2: Stop");

            System.out.print("Enter: ");
            int input = scan.nextInt();

            if (input == 1) {
                // varibale & inputs
                System.out.println("");
                System.out.print("Enter the week number (1-7): ");
                int weekNumber = scan.nextInt();

                if (weekNumber == 1) {
                    System.out.println("Saturday");
                    System.out.println("");
                } else if (weekNumber == 2) {
                    System.out.println("Sunday");
                    System.out.println("");
                } else if (weekNumber == 3) {
                    System.out.println("Monday");
                    System.out.println("");
                } else if (weekNumber == 4) {
                    System.out.println("Tuesday");
                    System.out.println("");
                } else if (weekNumber == 5) {
                    System.out.println("Wednesday");
                    System.out.println("");
                } else if (weekNumber == 6) {
                    System.out.println("Thursday");
                    System.out.println("");
                } else if (weekNumber == 7) {
                    System.out.println("Friday");
                    System.out.println("");
                } else {
                    System.out.println("Invalid input! Please enter a number between 1 and 7.");
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
