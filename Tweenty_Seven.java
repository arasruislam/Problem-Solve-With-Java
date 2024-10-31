/* 
 * Java program to Find Sum of the Series 1/1! + 2/2! + 3/3! + ......1/N!
 */

public class Tweenty_Seven {
   public static void main(String[] args) {
      int n = 10;
      double facto = 1, sum = 0;

      for (int i = 1; i <= n; i++) {
         facto *= i;
         sum += (i / facto);
      }

      System.out.println(sum);

   }
}
