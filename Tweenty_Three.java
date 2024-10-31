// Write a java program to find out the sum of series 7+ 20 + 33 + .... + up to 100 term


public class Tweenty_Three {
   public static void main(String[] args) {
      int a = 7, d = 13, n = 100;

      int sum = (n / 2) * ((2 * a) + (n - 1) * d);
      System.out.println(sum);
   }
}
