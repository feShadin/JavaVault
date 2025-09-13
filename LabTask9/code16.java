import java.util.Scanner;
import java.math.BigInteger;

public class code16 {

    public static void main(String[] args) {
        // Try-with-resources auto-closes the Scanner
        try (Scanner sc = new Scanner(System.in)) {

            // Read two big integers as strings
            BigInteger a = new BigInteger(sc.next());
            BigInteger b = new BigInteger(sc.next());

            // Print sum
            System.out.println(a.add(b));

            // Print product
            System.out.println(a.multiply(b));
        }
    }
}
