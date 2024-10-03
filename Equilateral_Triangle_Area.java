import java.text.DecimalFormat;
import java.util.Scanner;

public class Equilateral_Triangle_Area {
    public static void main(String[] args) {
        // classes
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");

        // variable & inputs
        double area;

        System.out.print("Enter the side of equilateral triangle: ");
        float side = scanner.nextFloat();

        if (side > 0) {
            // calculation
            area = (Math.sqrt(3) * Math.pow(side, 2)) / 4;

            // output
            System.out.println("Area of triangle: " + df.format(area));
        }
    }
}
