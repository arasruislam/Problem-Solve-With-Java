/* 
 * Write a Java program to print day of week name using switch case.
 */

import java.util.Scanner;

public class DaysOfWeek_With_Switch_Case {
    public static void main(String[] args) {
        // Classes
        Scanner scan = new Scanner(System.in);

        // variable & inputs
        System.out.print("Enter a number between 1 to 7 to display week day name: ");
        int day = scan.nextInt();

        // condition
        switch (day) {
            case 1:
                System.out.print("Week Name: Saturday\n");
                break;
            case 2:
                System.out.print("Week Name: Sunday\n");
                break;
            case 3:
                System.out.print("Week Name: Monday\n");
                break;
            case 4:
                System.out.print("Week Name: Tuesday\n");
                break;
            case 5:
                System.out.print("Week Name: Wednesday\n");
                break;
            case 6:
                System.out.print("Week Name: Thursday\n");
                break;
            case 7:
                System.out.print("Week Name: Friday\n");
                break;

            default:
                System.out.println("Invalid input! Please enter a number between 1 and 7.");
                break;
        }
    }
}
