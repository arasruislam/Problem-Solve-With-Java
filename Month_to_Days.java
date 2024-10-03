/* 
 * Write a Java program to input month number and print number of days in that month.
*/

import java.util.Scanner;

public class Month_to_Days {
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
                System.out.print("Enter the month number (1-12): ");
                int monthNumber = scan.nextInt();

                if (monthNumber == 1) {
                    System.out.println("Number of days in month 1(January): 31 Days");
                    System.out.println("");
                } else if (monthNumber == 2) {
                    System.out.print("Enter the year: ");
                    int year = scan.nextInt();

                    // Check if it's a leap year
                    if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                        System.out.println("Number of days in month 2(Februrary): 29 Days ! Because of leap year");
                    } else {
                        System.out.println("Number of days in month 2(February): 28 Days");
                    }
                } else if (monthNumber == 3) {
                    System.out.println("Number of days in month 3(March): 31 Days");
                    System.out.println("");
                } else if (monthNumber == 4) {
                    System.out.println("Number of days in month 4(April): 30 Days");
                    System.out.println("");
                } else if (monthNumber == 5) {
                    System.out.println("Number of days in month 5(May): 31 Days");
                    System.out.println("");
                } else if (monthNumber == 6) {
                    System.out.println("Number of days in month 6(June): 30 Days");
                    System.out.println("");
                } else if (monthNumber == 7) {
                    System.out.println("Number of days in month 7(July): 31 Days");
                    System.out.println("");
                } else if (monthNumber == 8) {
                    System.out.println("Number of days in month 8(August): 31 Days");
                    System.out.println("");
                } else if (monthNumber == 9) {
                    System.out.println("Number of days in month 9(September): 30 Days");
                    System.out.println("");
                } else if (monthNumber == 10) {
                    System.out.println("Number of days in month 7(October): 31 Days");
                    System.out.println("");
                } else if (monthNumber == 11) {
                    System.out.println("Number of days in month 7(November): 30 Days");
                    System.out.println("");
                } else if (monthNumber == 12) {
                    System.out.println("Number of days in month 12(December): 31 Days");
                    System.out.println("");
                } else {
                    System.out.println("Invalid input! Please enter a number between 1 and 2.");
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
