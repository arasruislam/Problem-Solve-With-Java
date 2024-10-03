import java.util.Scanner;

public class Prime_Number {
    public static void main(String[] args) {
        // class
        Scanner scan = new Scanner(System.in);

        while (true) {
            // Ask to user
            System.out.println("Enter 1: Start");
            System.out.println("Enter 2: Stop");

            System.out.print("Enter: ");
            int input = scan.nextInt();

            if (input == 1) {
                // varibale & inputs
                System.out.println("");
                System.out.print("Enter a number: ");
                int value = scan.nextInt();

                if (isPrime(value, 3)) {
                    System.out.println("Output: " + value + " is a prime number.");
                    System.out.println("");
                } else {
                    System.out.println("Output: " + value + " is not a prime number.");
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

    static boolean isPrime(int val, int i) {
        // base case
        if (val <= 1)
            return false;

        // calculation
        if (val == 2 || val == 3)
            return true;
        if (val % 2 == 0 || val % i == 0)
            return false;
        if (i * i > val) {
            return true;
        }

        return isPrime(val, i + 2);
    }
}