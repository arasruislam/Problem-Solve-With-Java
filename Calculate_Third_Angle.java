/* 
 * Write a Java program to enter any number and calculate its square root.
 */

import java.util.Scanner;

public class Calculate_Third_Angle {
    public static void main(String[] args) {
        // classes
        Scanner scanner = new Scanner(System.in);

        // variable & inputs
        int third_angle;

        System.out.print("enter first angle of the triangle: : ");
        int first_angle = scanner.nextInt();
        System.out.print("enter second angle of the triangle: ");
        int second_angle = scanner.nextInt();

        // calculation
        third_angle = 180 - (first_angle + second_angle);

        // output
        System.out.println("Third angle is: " + third_angle);
    }
}
