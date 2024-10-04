/* 
 * Write a Java program to enter any number and calculate its square root.
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class Calculate_Square_Root {
    public static void main(String[] args) {
        // classes
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");

        // variable & inputs
        double result;

        System.out.print("enter the number: ");
        int value = scanner.nextInt();

        // calculation
        result = Math.sqrt(value);

        // output
        System.out.println("Square root is: " + df.format(result));
    }
}