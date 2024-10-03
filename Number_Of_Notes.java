import java.util.Scanner;

public class Number_Of_Notes {

    public static void main(String[] args) {
        // classes
        Scanner scan = new Scanner(System.in);

        // array
        int notes[] = { 1000, 500, 200, 100, 50, 20, 10, 5, 2, 1 };
        int[] countNotes = new int[notes.length];

        // continue looping
        while (true) {
            // Ask to user
            System.out.println("");
            System.out.println("Enter 1: Start to input amount");
            System.out.println("Enter 2: See notes");
            System.out.println("Enter 3: Stop");

            System.out.print("Enter: ");
            int input = scan.nextInt();

            if (input == 1) {
                // varibale & inputs
                System.out.println("");
                System.out.print("Enter the amount: ");
                int money = scan.nextInt();

                for (int i = 0; i < notes.length; i++) {
                    countNotes[i] = 0;
                    if (money >= notes[i]) {
                        countNotes[i] = money / notes[i];
                        money %= notes[i];
                    }
                }

            } else if (input == 2) {
                System.out.println("");
                System.out.println("Here is the result: ");
                for (int i = 0; i < notes.length; i++) {
                    if (countNotes.length != 0) {
                        System.out.println(notes[i] + " : " + countNotes[i]);
                    } else {
                        System.out.println("No not found!");
                        break;
                    }
                }
                System.out.println("");

            } else if (input == 3) {
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