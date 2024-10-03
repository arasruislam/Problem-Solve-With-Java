/* 
 * Write a Java program to print sum of all even numbers between 1 to n.
 */

import java.util.Scanner;

public class SumEvenNumberUsingWhileLoop {
    public static void main(String[] args) {
        // Classes
        Scanner scan = new Scanner(System.in);

        // variable & inputs
        System.out.println("");
        System.out.print("Enter a natural number (1 to n): ");
        int n = scan.nextInt();

        int total = 0;

        while (n > 0) {
            total += n;
            n -= 1;
        }

        System.out.println("Total Sum: " + total);
    }
}