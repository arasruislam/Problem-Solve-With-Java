import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        // scanner
        Scanner scanner = new Scanner(System.in);

        // variable & inputs
        float perimeter, area;

        System.out.print("enter the length of rectangle: ");
        float length = scanner.nextFloat();
        System.out.print("enter the breadth of rectangle: ");
        float breadth = scanner.nextFloat();

        if (length > 0 && breadth > 0) {
            // calculation
            perimeter = 2 * (length + breadth);
            area = length * breadth;

            // output
            System.out.println("Perimeter: " + perimeter + ", Area: " + area);
        } else {
            System.out.println("Invalid input");
        }
    }
}
