import java.util.Scanner;

public class MidTerm {
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);

      System.out.println("Enter a doube value: ");
      double d = scan.nextDouble();

      byte byt;
      byt = (byte) d;

      System.out.println(byt);
      scan.close();
   };

}

