/* 
 * Write a Java program to input electricity unit charges and calculate total electricity
   bill according to the given condition:
   
    For first 50 units BDT. 0.50/unit
    For next 100 units BDT. 0.75/unit
    For next 100 units BDT 1.20/unit
    For unit above 250 BDT. 1.50/unit
   An additional surcharge of 20% is added to the bill
*/

import java.util.Scanner;

public class Electricity_Bill_Calculate {
    public static void main(String[] args) {
        // Classes
        Scanner scan = new Scanner(System.in);

        // variable
        double bill = 0;

        while (true) {
            // Ask to user
            System.out.println("");
            System.out.println("Enter 1: To calculate electricity bill");
            System.out.println("Enter 2: Stop");

            System.out.print("Enter: ");
            int input = scan.nextInt();

            if (input == 1) {
                // inputs
                System.out.println("");
                System.out.print("Enter the number of electricity units: ");
                int units = scan.nextInt();

                // condition
                if (units <= 50) {
                    bill = units * 0.50;
                } else if (units <= 150) {
                    bill = 50 * 0.50 + (units - 50) * 0.75;
                } else if (units <= 250) {
                    bill = 50 * 0.50 + 100 * 0.75 + (units - 150) * 1.20;
                } else {
                    bill = 50 * 0.50 + 100 * 0.75 + 100 * 1.20 + (units - 250) * 1.50;
                }

                double totalElectricBill = bill + 0.20 * bill;

                // output
                System.out.println("");
                System.out.println("Total electricity bill: " + totalElectricBill + " BDT");

            } else if (input == 2) {
                System.out.println("\n");
                System.out.println("Stop.");
                break;
            } else {
                System.out.println("Invalid Input");
                System.out.println("");
            }
        }
    }
}
