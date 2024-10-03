/* 
 * Write a Java program to input basic salary of an employee and calculate its Gross
   salary according to following:

    Basic Salary >= 10000: HRA = 20%, DA = 80%
    Basic Salary >= 20000: HRA = 25%, DA = 90%
    Basic Salary >= 30000: HRA = 30%, DA = 95%
 */

import java.util.Scanner;

public class Employee_Gross_Salary {

    public static void main(String[] args) {
        // classes
        Scanner scan = new Scanner(System.in);

        // variable & inputs
        double HRA = 0;
        double DA = 0;

        System.out.print("Enter your basic salary: ");
        double basicSalary = scan.nextDouble();

        // calculation
        if (basicSalary >= 30000) {
            HRA = 0.3 * basicSalary;
            DA = 0.95 * basicSalary;
        } else if (basicSalary >= 20000) {
            HRA = 0.25 * basicSalary;
            DA = 0.90 * basicSalary;
        } else if (basicSalary >= 10000) {
            HRA = 0.2 * basicSalary;
            DA = 0.8 * basicSalary;
        }

        // output
        double totalGrossSalary = basicSalary + HRA + DA;
        System.out.println("Total Gross Salary: " + totalGrossSalary);
    }
}