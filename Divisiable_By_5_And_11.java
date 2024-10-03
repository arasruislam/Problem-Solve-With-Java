import java.util.Scanner;

public class Divisiable_By_5_And_11 {
    public static void main(String[] args) {
        // classes
        Scanner scan = new Scanner(System.in);

        while (true) {
            // Ask to user
            System.out.println("Enter 1: Start program");
            System.out.println("Enter 2: Stop");

            System.out.print("Enter: ");
            int input = scan.nextInt();

            if (input == 1) {
                // variable & inputs
                System.out.println("");
                System.out.print("Enter a number: ");
                int number = scan.nextInt();

                boolean isTrue = (number % 5 == 0) && (number % 11 == 0) ? true : false;

                if (isTrue) {
                    System.out.println(number + " number is divisible by 5 and 11");
                    System.out.println("");
                } else {
                    System.out.println(number + " number is not divisible by 5 and 11");
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
