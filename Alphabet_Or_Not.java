import java.util.Scanner;

public class Alphabet_Or_Not {
    public static void main(String[] args) {
        // classes
        Scanner scan = new Scanner(System.in);

        while (true) {
            // Ask to user
            System.out.println("Enter 1: Go to write alphabet");
            System.out.println("Enter 2: Stop");

            System.out.print("Enter: ");
            int input = scan.nextInt();

            if (input == 1) {
                // variable & inputs
                System.out.println("");
                System.out.print("Enter your alphabet: ");
                char charecter = scan.next().charAt(0);

                String result = (charecter >= 'a' && charecter <= 'z') || (charecter >= 'A' && charecter <= 'Z')
                        ? " is an alphabet"
                        : " is not an alphabet";

                System.out.println("Output: " + charecter + result);
                System.out.println("");

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