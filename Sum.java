import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        // Scanner
        Scanner scanner = new Scanner(System.in);

        // varible & inputs
        int sum;
        System.out.print("enter your first value: ");
        int a = scanner.nextInt();
        System.out.print("enter your second value: ");
        int b = scanner.nextInt();

        // calculation
        sum = a + b;

        // output
        System.out.println("Total Sum: " + sum);

    }
}
