/* 
 * Write a java program to find out the sum of series 1 + (1+ 2) + (1+2+3) .... + (1 + 2 + 3+ ............ + n).
 */

public class Tweenty_Five {
   public static void main(String[] args) {
      // 1 3 6 10.....
      int n = 10, previousValue = 0, sum = 0;

      System.out.print("Series: ");
      for (int i = 1; i <= n; i++) {
         int series = i + previousValue;
         sum += series;
         previousValue += i;
         System.out.print(series + " ");
      }

      System.out.println("\nTotal: " + sum);

   }
}
