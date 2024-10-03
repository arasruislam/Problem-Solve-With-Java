import java.util.Scanner;

public class Vowel_Consonent {
    public static void main(String[] args) {
        // classes
        Scanner scan = new Scanner(System.in);

        while (true) {
            // Ask to user
            // System.out.println("");
            System.out.println("Enter 1: Start to input value");
            System.out.println("Enter 2: Stop");

            System.out.print("Enter: ");
            int input = scan.nextInt();

            if (input == 1) {
                // varibale & inputs
                System.out.println("");
                System.out.print("Enter the alphabet: ");
                char letter = scan.next().charAt(0);

                if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u' || letter == 'A'
                        || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U') {
                    System.out.println("It's a vowel");
                    System.out.println("");
                } else {
                    System.out.println("It's a consonent");
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
