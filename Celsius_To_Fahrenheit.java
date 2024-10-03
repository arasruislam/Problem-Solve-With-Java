import java.util.Scanner;

public class Celsius_To_Fahrenheit {
    public static void main(String[] args) {
        // scanner
        Scanner scanner = new Scanner(System.in);

        // variable & inputs
        float fahrenheit;

        System.out.print("enter the Celsius value: ");
        float celcius = scanner.nextFloat();

        // calculation
        fahrenheit = (celcius * 9) / 5 + 32;

        // output
        System.out.println("In Fahrenheit: "+ fahrenheit);
    }
}