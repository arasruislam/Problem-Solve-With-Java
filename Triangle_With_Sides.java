
/* 
 * Write a Java program to input all sides of a triangle and check whether triangle is
   valid or not.
 */
import java.util.Scanner;

public class Triangle_With_Sides {
    public static void main(String[] args) {
        // Classes
        Scanner scan = new Scanner(System.in);

        while (true) {
            // Ask to user
            System.out.println("");
            System.out.println("Enter 1: To start");
            System.out.println("Enter 2: Stop");

            System.out.print("Enter: ");
            int input = scan.nextInt();

            if (input == 1) {
                // varibale & inputs
                System.out.println("");
                System.out.print("Enter first sides value: ");
                int x = scan.nextInt();
                System.out.print("Enter second sides value: ");
                int y = scan.nextInt();
                System.out.print("Enter third sides value: ");
                int z = scan.nextInt();

                if ((x + y > z) && (y + z > x) && (x + z > y)) {
                    System.out.println("The triangle is valid.");
                    System.out.println("");
                } else {
                    System.out.println("The triangle is not valid.");
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
