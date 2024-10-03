/* 
 * Write a Java program to create Simple Calculator using switch case.
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class Simple_Calculator {
    public static void main(String[] args) {
        // Classes
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");

        // variable
        double a = 0, b = 0;
        double addition, subtraction, multipication, division;

        while (true) {
            // Ask to user
            System.out.println("");
            System.out.println("Enter 1: To input value");
            System.out.println("Enter 2: Addition");
            System.out.println("Enter 3: Subtraction");
            System.out.println("Enter 4: Multipication");
            System.out.println("Enter 5: Division");
            System.out.println("Enter 6: Stop");

            System.out.print("Enter: ");
            int input = scan.nextInt();

            switch (input) {
                case 1:
                    System.out.println("");
                    System.out.print("Enter number: ");
                    a = scan.nextDouble();
                    System.out.print("Enter another number: ");
                    b = scan.nextDouble();
                    break;
                case 2:
                    addition = a + b;

                    System.out.println("");
                    System.out.println("Output: " + addition);
                    break;
                case 3:
                    subtraction = a - b;

                    System.out.println("");
                    System.out.println("Output: " + subtraction);
                    break;
                case 4:
                    multipication = a * b;

                    System.out.println("");
                    System.out.println("Output: " + df.format(multipication));
                    break;
                case 5:
                    if (b == 0) {
                        System.out.println("");
                        System.out.println("Can't divided my zero.");
                        return;
                    }
                    division = a / b;

                    System.out.println("");
                    System.out.println("Output: " + df.format(division));
                    break;
                case 6:
                    System.out.println("\n");
                    System.out.println("Stop.");
                    return;
                default:
                    System.out.println("Invalid Input");
                    System.out.println("");
                    continue;
            }

        }
    }
}
