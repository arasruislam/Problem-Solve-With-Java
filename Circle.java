/* 
 * Write a Java program to enter radius of a circle and find its diameter, circumference
and area.
 */

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        // scanner
        Scanner scanner = new Scanner(System.in);

        // variable & inputs
        double diameter, circumference, area;

        System.out.print("enter the redius of circle: ");
        float red = scanner.nextFloat();

        // calculation
        diameter = 2 * red;
        circumference = 2 * red * Math.PI;
        area = Math.PI * Math.pow(red, 2);

        // output
        System.out.println("Diameter: "+ diameter + ", Circumference "+ circumference + ", Area: "+ area);

    }
}
