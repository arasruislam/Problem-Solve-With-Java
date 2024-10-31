/* 
 * Write a Java program to find GCD of two numbers.
 * Write a Java program to find LCM of two numbers.
 */

public class Tweenty_Eight_Night {
   public static void main(String[] args) {
      int a = 60;
      int b = 24;

      int num1 = a, num2 = b;

      while (num2 != 0) {
         int rem = num1 % num2;
         num1 = num2;
         num2 = rem;
      }
      int gcd = num1;
      int lcm = (a * b)/ gcd;
      System.out.println("GCD: "+ gcd + ", LCM: "+ lcm);

   }
}
