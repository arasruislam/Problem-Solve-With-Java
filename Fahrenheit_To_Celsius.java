import java.util.Scanner;

public class Fahrenheit_To_Celsius {
    public static void main(String[] args) {
        // scanner
        Scanner scanner = new Scanner(System.in);

        // variable & inputs
        float celcius;

        System.out.print("enter the fahrenheit value: ");
        float fahrenheit = scanner.nextFloat();

        // calculation
        celcius = ((fahrenheit - 32) * 5) / 9;

        // output
        System.out.println("In Celcius: " + celcius);

    }
}
