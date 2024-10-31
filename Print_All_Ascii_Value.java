public class Print_All_Ascii_Value {
   public static void main(String[] args) {
      for (int i = 0; i <= 127; i++) {
         char ascii = (char) i;
         System.out.println("ASCII value of " + i + " = " + ascii);
      }
   }
}
