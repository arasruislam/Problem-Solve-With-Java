/* 
 * Write a Java program to find maximum and minimum among three numbers using  conditional/ternary operator.
 */

import java.util.Scanner;

public class Find_Maximum_Minimum_Number {
    public static void main(String[] args) {
        // classes
        Scanner scanner = new Scanner(System.in);

        // variable & inputs
        System.out.print("enter first value: ");
        int a = scanner.nextInt();
        System.out.print("enter second value: ");
        int b = scanner.nextInt();
        System.out.print("enter third value: ");
        int c = scanner.nextInt();

        // condition (ternary operator)
        int max = (a > b) ? ((a > c) ? a : c) : (b > c) ? b : (c > a) ? c : a;

        // output
        System.out.println(max);
    }
}
