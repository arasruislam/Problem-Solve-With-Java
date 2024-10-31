// Write a java program to find out the sum of series 5-11+17-.... +up to 75 term

public class Tweenty_Four {
   public static void main(String[] args) {
      int n = 75;
      int sum = 0;
      int currentTerm;

      for (int i = 1; i <= n; i++) {
         currentTerm = 5 + (i - 1) * 6;

         if (n % 2 == 0) {
            sum -= currentTerm;
         } else {
            sum += currentTerm;
         }
      }

      System.out.println(sum);

   }
}
