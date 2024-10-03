import java.util.Scanner;

public class Check_Character {
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
                int dec = (int) letter;

                if ((dec >= 65 && dec <= 90) || (dec >= 97 && dec <= 122)) {
                    System.out.println("This is an Alphabet.");
                    System.out.println("");
                } else if (dec >= 48 && dec <= 57) {
                    System.out.println("This is an Number.");
                    System.out.println("");
                } else {
                    System.out.println("This is an Special Character.");
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
