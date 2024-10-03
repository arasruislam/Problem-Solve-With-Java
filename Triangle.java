import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        // Scanner
        Scanner scanner = new Scanner(System.in);

        // variable & inputs
        float area;

        System.out.print("Enter the base of triangle: ");
        float base = scanner.nextFloat();
        System.out.print("Enter the height of triangle: ");
        float height = scanner.nextFloat();

       if(base > 0 && height>0){
           // calculation
           area = (base * height) / 2;

           // output
           System.out.println("Area of triangle: " + area);
       }
    }
}
