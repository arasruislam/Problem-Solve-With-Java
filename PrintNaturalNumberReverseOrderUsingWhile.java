/* 
 * Write a Java program to print all natural numbers in reverse (from n to 1).   
 * using while loop
*/

import java.util.Scanner;

public class PrintNaturalNumberReverseOrderUsingWhile {

    public static void main(String[] args) {
        // Classes
        Scanner scan = new Scanner(System.in);

        // variable
        System.out.print("enter natural number: ");
        int n = scan.nextInt();

        System.out.println("");
        while (n > 0) {
            System.out.println(n);
            n -= 1;
        }
    }
}