import java.text.DecimalFormat;
import java.util.Scanner;

public class Find_Power_Of_Number {
    public static void main(String[] args) {
        // classes
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#");

        // variable & inputs
        double result;

        System.out.print("enter the number: ");
        int base = scanner.nextInt();
        System.out.print("enter the power of number: ");
        int exponent = scanner.nextInt();

        // calculation
        result = Math.pow(base, exponent);

        // output
        System.out.println("Power of number is: " + df.format(result));
    }
}
