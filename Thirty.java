/* 
 * Write a Java program to check whether a number is Armstrong number or not.
 */

public class Thirty {
   public static void main(String[] args) {
      int value = 153;
      double sum = 0;
      int mainValue = value;
      int length = String.valueOf(mainValue).length();
      System.out.println(length);

      while (value != 0) {
         int rem = value % 10;
         sum += Math.pow(rem, length);
         value /= 10;
      }

      if (mainValue == sum) {
         System.out.println("Armstrong");
      } else {
         System.out.println("Not Armstrong");
      }
   }
}
