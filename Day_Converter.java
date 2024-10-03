/* 
 * Write a Java program to convert days into years, weeks and days.
 */

import java.util.Scanner;

public class Day_Converter {
    public static void main(String[] args) {
        // scanner
        Scanner scanner = new Scanner(System.in);

        // unchange variable
        final int DAYS_IN_YEAR = 365;
        final int DAYS_IN_MONTH = 30;
        final int DAYS_IN_WEEK = 7;

        // variable & inputs
        int months, years, weeks;

        System.out.print("enter your days number: ");
        int days = scanner.nextInt();

        // calculation
        years = days / DAYS_IN_YEAR;
        months = days / DAYS_IN_MONTH;
        weeks = days / DAYS_IN_WEEK;

        // output
        System.out.println("Years: " + years + ", Months " + months + ", Weeks: " + weeks + ", Days " + days);
    }
}
