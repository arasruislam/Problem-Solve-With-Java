/* 
 * Write a Java program to print all alphabets from a to z. - using while loop
 */

public class AllAlphabetsUsingWhileLoop {
    public static void main(String[] args) {
        int n = 97;

        System.out.println("alphabets from a to z: ");
        while (n <= 122) {
            char alphabet = (char) n;
            System.out.print(alphabet + " ");
            n += 1;
        }
        System.out.println("");
    }
}
