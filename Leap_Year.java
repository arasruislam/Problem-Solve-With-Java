import java.util.Scanner;

public class Leap_Year {
    public static void main(String[] args) {
        // classes
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Enter 1: Write year ");
            System.out.println("Enter 2: Stop ");
            System.out.print("Enter: ");
            int input = scan.nextInt();

            if (input == 1) {
                // variable & inputs
                System.out.println("\n");
                System.out.print("Enter the year: ");
                int year = scan.nextInt();

                // calculation apply
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    System.out.println("Output: " + year + " is a leap year");
                    System.out.println("\n");
                } else {
                    System.out.println("Output: " + year + "  is not an leap year");
                    System.out.println("\n");
                }
            } else if (input == 2) {
                System.out.println("\n");
                System.out.println("Stop.");
                break;
            } else {
                System.out.println("\n");
                System.out.println("Invalid Credential\n");
            }
        }
    }
}