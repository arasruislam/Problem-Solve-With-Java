/* 
 * Write a Java program to input angles of a triangle and check whether triangle is valid
   or not.
 */

import java.util.Scanner;

public class Triangle_With_Angle {
    public static void main(String[] args) {
        // Classes
        Scanner scan = new Scanner(System.in);

        while (true) {
            // Ask to user
            System.out.println("");
            System.out.println("Enter 1: Start to enter value");
            System.out.println("Enter 2: Stop");

            System.out.print("Enter: ");
            int input = scan.nextInt();

            if (input == 1) {
                // varibale & inputs
                System.out.println("");
                System.out.print("Enter first angle: ");
                int firstAngle = scan.nextInt();
                System.out.print("Enter second angle: ");
                int secondAngle = scan.nextInt();
                System.out.print("Enter third angle: ");
                int thirdAngle = scan.nextInt();

                if (firstAngle <= 0 || firstAngle >= 180 || secondAngle <= 0 || secondAngle >= 180 || thirdAngle <= 0
                        || thirdAngle >= 180) {
                    System.out.println("each angle must be more then 0 and less then 180");
                    System.out.println("");
                } else {
                    int sumTotalAngle = firstAngle + secondAngle + thirdAngle;
                    if (sumTotalAngle == 180) {
                        System.out.println("Trianle is valid.");
                        System.out.println("");
                    } else {
                        System.out.println("Trianle is not valid.");
                        System.out.println("");
                    }
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
