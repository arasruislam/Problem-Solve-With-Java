/* 
 * Write a Java program print total number of days in a month using switch case.
 */

import java.util.Scanner;

public class Days_in_Month_With_Switch_Case {
    public static void main(String[] args) {
        // Classes
        Scanner scan = new Scanner(System.in);

        // variable & inputs
        System.out.print("Enter the month number (1-12): ");
        int month = scan.nextInt();

        // condition
        switch (month) {
            case 1:
                System.out.println("Total number of days (January): 31");
                break;
            case 2:
                System.out.println("Total number of days (February): 28 or 29");
                break;
            case 3:
                System.out.println("Total number of days (March): 31");
                break;
            case 4:
                System.out.println("Total number of days (April): 30");
                break;
            case 5:
                System.out.println("Total number of days (May): 31");
                break;
            case 6:
                System.out.println("Total number of days (June): 30");
                break;
            case 7:
                System.out.println("Total number of days (July): 31");
                break;
            case 8:
                System.out.println("Total number of days (August): 31");
                break;
            case 9:
                System.out.println("Total number of days (September): 30");
                break;
            case 10:
                System.out.println("Total number of days (October): 31");
                break;
            case 11:
                System.out.println("Total number of days (November): 30");
                break;
            case 12:
                System.out.println("Total number of days (December): 31");
                break;
            default:
                System.out.println("Invalid month number! Please enter a number between 1 and 12.");
                break;
        }
    }
}
