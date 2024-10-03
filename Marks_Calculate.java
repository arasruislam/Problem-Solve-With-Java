import java.text.DecimalFormat;
import java.util.Scanner;

public class Marks_Calculate {
    public static void main(String[] args) {
        // classes
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");

        // variable & inputs
        double totalMarks = 0, avarage = 0, percentage = 0;

        System.out.print("enter total subject number, example(5): ");
        int TotalSubject = scanner.nextInt();

        // array
        float numbers[] = new float[TotalSubject];

        while (true) {
            System.out.println("Enter 1: Submit your marks");
            System.out.println("Enter 2: See total marks");
            System.out.println("Enter 3: See avarage marks");
            System.out.println("Enter 4: See percentage");
            System.out.println("Enter 5: Stop");

            System.out.print("Enter: ");
            int input = scanner.nextInt();

            if (input == 1) {
                System.out.println("Enter your marks: ");
                for (int i = 0; i < TotalSubject; i++) {
                    float mark = scanner.nextFloat();
                    numbers[i] = mark;
                }

                for (int i = 0; i < TotalSubject; i++) {
                    totalMarks += numbers[i];
                }

            } else if (input == 2) {
                System.out.println("Total Mark: " + totalMarks + "\n");

            } else if (input == 3) {
                avarage = totalMarks / TotalSubject;
                System.out.println("Your Avarage Marks: " + df.format(avarage) + "\n");

            } else if (input == 4) {
                System.out.print("Enter exam total Marks: ");
                float ExamTotal = scanner.nextFloat();

                percentage = (totalMarks / ExamTotal) * 100;

                System.out.println("Your Percentage is:" + df.format(percentage) + "%\n");
            } else if (input == 5) {
                System.out.println("End.");
                break;
            } else {
                System.out.println("\n");
                System.out.println("Invalid input\n");
            }

        }

    }
}
