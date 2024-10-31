// Write a java program to find out the sum of series 1^2 + 2^2 + .... + n^2.

public class Tweenty_Six {
   public static void main(String[] args) {
      int n = 10, sum = 0;

      for (int i = 1; i <= n; i++) {
         double series = Math.pow(i, 2);
         sum += (int) series;
      }

      System.out.println(sum);
   }
}
