/* 
 * Write a Java program to input marks of five subjects Physics, Chemistry, Biology,
   Mathematics and Computer. Calculate percentage and grade according to following:

    Percentage >= 90%: Grade A
    Percentage >= 80%: Grade B
    Percentage >= 70%: Grade C
    Percentage >= 60%: Grade D
    Percentage >= 40%: Grade E
    Percentage < 40%: Grade F
*/

import java.util.Scanner;

public class Grade_Calculation {
    public static void main(String[] args) {
        // Classes
        Scanner scanner = new Scanner(System.in);

        // Variable & inputs
        char grade;

        System.out.print("Enter marks for Physics: ");
        double physics = scanner.nextDouble();

        System.out.print("Enter marks for Chemistry: ");
        double chemistry = scanner.nextDouble();

        System.out.print("Enter marks for Biology: ");
        double biology = scanner.nextDouble();

        System.out.print("Enter marks for Mathematics: ");
        double mathematics = scanner.nextDouble();

        System.out.print("Enter marks for Computer: ");
        double computer = scanner.nextDouble();

        // Calculation
        double totalMarks = physics + chemistry + biology + mathematics + computer;
        double percentage = (totalMarks / 500) * 100;

        // Condition for grade
        if (percentage >= 90)
            grade = 'A';
        else if (percentage >= 80)
            grade = 'B';
        else if (percentage >= 70)
            grade = 'C';
        else if (percentage >= 60)
            grade = 'D';
        else if (percentage >= 40)
            grade = 'E';
        else
            grade = 'F';

        // output
        System.out.println("");
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Your Grade is: " + grade);
    }
}
