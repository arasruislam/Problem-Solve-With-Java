import java.util.Scanner;

public class PrintAllFactorsOfAnyNumber {
   public static void main(String[] args) {
      // classes
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
            System.out.println("");
            System.out.print("Enter a number: ");
            int value = scan.nextInt();

            for (int i = 1; i <= value; i++) {
               if (value % i == 0) {
                  System.out.println(i);
               }
            }

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
