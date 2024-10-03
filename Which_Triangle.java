/* 
 * Write a Java program to check whether the triangle is equilateral, isosceles or scalene
   triangle.
*/

import java.util.Scanner;

public class Which_Triangle {
    public static void main(String[] args) {
        // Classes
        Scanner scan = new Scanner(System.in);

        while (true) {
            // Ask to user
            System.out.println("");
            System.out.println("Enter 1: Find triangle using sides");
            System.out.println("Enter 2: Find triangle using angle");
            System.out.println("Enter 3: Stop");

            System.out.print("Enter: ");
            int input = scan.nextInt();

            if (input == 1) {
                // inputs sides of angle
                System.out.println("");
                System.out.print("Enter first sides value: ");
                int x = scan.nextInt();
                System.out.print("Enter second sides value: ");
                int y = scan.nextInt();
                System.out.print("Enter third sides value: ");
                int z = scan.nextInt();

                if ((x + y > z) && (y + z > x) && (x + z > y)) {
                    System.out.println("The triangle is valid.");

                    if (x == y && y == z) {
                        System.out.println("This is a Equilateral Triangle");
                        System.out.println("");
                    } else if (x == y || y == z || x == z) {
                        System.out.println("This is a Isosceles Triangle");
                        System.out.println("");
                    } else {
                        System.out.println("This is a Scalene Triangle");
                        System.out.println("");
                    }

                } else {
                    System.out.println("The triangle is not valid.");
                    System.out.println("");
                }

            } else if (input == 2) {
                // inputs angles
                System.out.println("");
                System.out.print("Enter first angle: ");
                int firstAngle = scan.nextInt();
                System.out.print("Enter second angle: ");
                int secondAngle = scan.nextInt();
                System.out.print("Enter third angle: ");
                int thirdAngle = scan.nextInt();

                int sumTotalAngle = firstAngle + secondAngle + thirdAngle;

                if (sumTotalAngle == 180) {
                    if (firstAngle == secondAngle && secondAngle == thirdAngle) {
                        System.out.println("This is a Equilateral Triangle");
                        System.out.println("");
                    } else if (firstAngle == secondAngle || secondAngle == thirdAngle) {
                        System.out.println("This is a Isosceles Triangle");
                        System.out.println("");
                    } else {
                        System.out.println("This is a Scalene Triangle");
                        System.out.println("");
                    }
                } else {
                    System.out.println("Trianle is not valid.");
                    System.out.println("");
                }

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
