import java.util.Scanner;

public class CalculateFactorialValueOfNumber {
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);

      while (true) {
         // Ask to user
         System.out.println("");
         System.out.println("Enter 1: Start");
         System.out.println("Enter 2: Stop");

         System.out.print("Enter: ");
         int input = scan.nextInt();

         if (input == 1) {
            // varibale & inputs
            int result = 1;
            System.out.println("");
            System.out.print("Enter a number: ");
            int value = scan.nextInt();

            if (value == 0) {
               System.out.println("The factorial of " + value + " is: 1");
               return;
            }
            for (int i = 1; i <= value; i++) {
               result *= i;
            }
            System.out.println(result);

         } else if (input == 2) {
            System.out.print("\n");
            System.out.println("Stop.");
            break;
         } else {
            System.out.println("Invalid Input");
            System.out.println("");
         }
      }
   }
}
