/* 
 * Write a Java program to enter length in centimeter and convert it into meter and
   kilometer.
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
        // classes
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.###");

        // variable & inputs
        double meter, kilometer;

        System.out.print("enter length in centimeter: ");
        float centimeter = scanner.nextFloat();

        // calculation
        meter = centimeter / 100;
        kilometer = centimeter / 1e+5;

        // output
        System.out.printf("In meter: " + df.format(meter) + ", In kilometer: " + df.format(kilometer));
    }
}
