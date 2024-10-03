/* 
 * Write a Java program to find all roots of a quadratic equation.
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class Roots_Of_Quadratic_Equation {
    public static void main(String[] args) {
        System.out.println("Find all roots of a quadratic equation: ");

        // Classes
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");

        while (true) {
            // Ask to user
            System.out.println("");
            System.out.println("Enter 1: Start");
            System.out.println("Enter 2: Stop");

            System.out.print("Enter: ");
            int input = scan.nextInt();

            if (input == 1) {
                // variable & inputs
                System.out.println("");
                System.out.print("Enter coefficient value of a: ");
                double a = scan.nextDouble();

                System.out.print("Enter coefficient value of b: ");
                double b = scan.nextDouble();

                System.out.print("Enter coefficient value of c: ");
                double c = scan.nextDouble();

                // Discriminant
                double D = (b * b) - (4 * a * c);

                if (D > 0) {
                    double x1 = (-b + Math.sqrt(D)) / (2 * a);
                    double x2 = (-b - Math.sqrt(D)) / (2 * a);

                    System.out.println("");
                    System.out.println("The equation has two real roots:");
                    System.out.println("Root 1: " + df.format(x1));
                    System.out.println("Root 2: " + df.format(x2));
                   
                } else if (D == 0) {
                    double x = -b / (2 * a);

                    System.out.println("");
                    System.out.println("The equation has one real root: " + df.format(x));
                } else {
                    double real = -b / (2 * a);
                    double imaginary = Math.sqrt(-D) / (2 * a);

                    System.out.println("");
                    System.out.println("The equation has two complex roots:");
                    System.out.println("Root 1: " + df.format(real) + " + " + df.format(imaginary) + "i");
                    System.out.println("Root 2: " + df.format(real) + " - " + df.format(imaginary) + "i");
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
