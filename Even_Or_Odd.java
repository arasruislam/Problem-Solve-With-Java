import java.util.Scanner;

public class Even_Or_Odd {
    public static void main(String[] args) {
        // class
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Enter 1: Start Program");
            System.out.println("Enter 2: To stop the program.");

            System.out.print("enter: ");
            int input = scan.nextInt();

            if (input == 1) {
                // variable & inputs
                System.out.print("enter the value: ");
                int val = scan.nextInt();

                // calculation
                boolean flag = (val % 2) == 0 ? true : false;

                // output
                if (flag)
                    System.out.println(val + " is an even number\n");
                else
                    System.out.println(val + " is an odd number\n");
            } else if (input == 2) {
                System.out.println("Stop.");
                break;
            } else {
                System.out.println("Invalid input\n");
            }
        }
    }
}
