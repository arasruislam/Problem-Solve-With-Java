import java.util.Scanner;

public class SumOfNaturalNumberSeries {
   public static void main(String[] args) {
      // classes
      Scanner scan = new Scanner(System.in);

      // variable & inputs
      int n, sum = 0;

      System.out.print("Enter a number: ");
      n = scan.nextInt();

      for (int i = 1; i <= n; i++) {
         sum += i;
      }
      System.out.println("sum of series 1 + 2 + .... + n: "+ sum);
      scan.close();
   }

}
