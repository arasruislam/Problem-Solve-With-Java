/* 
 * Write a Java program to enter P, T, and R and calculate Simple and Compound
    Interest.
    [Hints:
    Compound Interest:
    Formula: P * ((1 + R / 100) T - 1) (where P = Principle, T = Time, R = Rate) Simple Interest:
    Formula: Principle * Time * Rate / 100]
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public record Interest() {
    public static void main(String[] args) {
        // classes
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");

        // variable & input
        float P = 0, T = 0, R = 0;
        double simple_interest, component_interest;

        while (true) {
            System.out.println("Enter 1: submit data");
            System.out.println("Enter 2: See Simple interest");
            System.out.println("Enter 3: See Component interest");
            System.out.println("Enter 4: Stop");
            System.out.print("Enter: ");
            int input = scanner.nextInt();

            if (input == 1) {
                System.out.print("Enter princile value: ");
                P = scanner.nextFloat();
                System.out.print("Enter Time value: ");
                T = scanner.nextFloat();
                System.out.print("Enter Rate value: ");
                R = scanner.nextFloat();
            } else if (input == 2) {
                simple_interest = (P * T * R) / 100;
                System.out.println("Simple Interest: " + df.format(simple_interest) + "%\n");
            } else if (input == 3) {
                component_interest = P * (((1 + R) / 100) * (T - 1));
                System.out.println("Component Interest: " + df.format(component_interest) + "%\n");
            } else if (input == 4) {
                System.out.println("End.");
                break;
            } else {
                System.out.println("\n");
                System.out.println("Invalid input\n");
            }
        }

    }
}
