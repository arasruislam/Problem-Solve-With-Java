/* 
 * Write a Java program to calculate profit or loss.
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class Calculate_Profit_Loss {
    public static void main(String[] args) {
        // Classes
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");

        while (true) {
            // Ask to user
            System.out.println("");
            System.out.println("Enter 1: To Calculate your profit or loss");
            System.out.println("Enter 2: Stop");

            System.out.print("Enter: ");
            int input = scan.nextInt();

            if (input == 1) {
                // variable & inputs
                System.out.println("");
                System.out.print("Enter the cost price (cp): ");
                double CP = scan.nextDouble();

                System.out.print("Enter the selling price (sp): ");
                double SP = scan.nextDouble();

                if (SP > CP) {
                    double profit = SP - CP;
                    double profitPercentage = (profit * 100) / CP;

                    System.out.println("");
                    System.out.println("You made a profit of: " + df.format(profit));
                    System.out.println("Profit percentage: " + df.format(profitPercentage) + "%");
                } else if (CP > SP) {
                    double loss = CP - SP;
                    double lossPercentage = (loss * 100) / CP;

                    System.out.println("");
                    System.out.println("You made a loss of: " + df.format(loss));
                    System.out.println("Loss percentage: " + df.format(lossPercentage) + "%");
                } else {
                    System.out.println("No profit, no loss.");
                    System.out.println("");
                }

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
