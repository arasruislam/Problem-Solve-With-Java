import java.util.Scanner;

public class Nagative_Or_Positive {
    public static void main(String[] args) {
        // classes
        Scanner scan = new Scanner(System.in);

        while (true) {
            // Ask to user
            System.out.println("Enter 1: write a number(Integer)");
            System.out.println("Enter 2: Stop");

            System.out.print("Enter: ");
            int input = scan.nextInt();

            if (input == 1) {
                // variable & inputs
                System.out.println("");
                System.out.print("Enter number: ");
                int number = scan.nextInt();

                if (number > 0) {
                    System.out.println("Output: " + number + " is a positive number");
                    System.out.println("");
                } else if (number == 0) {
                    System.out.println("Output: " + number + " is a zero number");
                    System.out.println("");
                } else {
                    System.out.println("Output: " + number + " is a nagative number");
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
