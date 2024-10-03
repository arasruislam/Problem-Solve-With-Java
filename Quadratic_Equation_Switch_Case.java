/* 
 * Write a Java program to find roots of a quadratic equation using switch case.
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class Quadratic_Equation_Switch_Case {
    public static void main(String[] args) {
        // Classes
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");

        // variable & inputs
        System.out.print("Enter coefficient a: ");
        double a = scan.nextDouble();
        System.out.print("Enter coefficient b: ");
        double b = scan.nextDouble();
        System.out.print("Enter coefficient c: ");
        double c = scan.nextDouble();

        // Discriminent
        double D = (b * b) - (4 * a * c);
        int result = (D > 0) ? 1 : (D == 0) ? 2 : 3;

        // condition
        switch (result) {
            case 1:
                System.out.println("");

                double x1 = (-b + Math.sqrt(D)) / (2 * a);
                double x2 = (-b - Math.sqrt(D)) / (2 * a);

                System.out.println("The equation has two distinct real roots:");
                System.out.println("Root 1: " + df.format(x1));
                System.out.println("Root 2: " + df.format(x2));

                break;
            case 2:
                System.out.println(" ");
                double x = -b / (2 * a);
                System.out.println("The equation has one real root (repeated): " + df.format(x));
                break;
            case 3:
                System.out.println("");

                double real = -b / (2 * a);
                double imaginary = Math.sqrt(-D) / (2 * a);

                System.out.println("The equation has two complex roots:");
                System.out.println("Root 1: " + df.format(real) + " + " + df.format(imaginary) + "i");
                System.out.println("Root 2: " + df.format(real) + " - " + df.format(imaginary) + "i");
                break;

            default:
                System.out.println("Invalid input or calculation error.");
                break;
        }
    }
}
