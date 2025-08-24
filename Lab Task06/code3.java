import java.util.Scanner;

public class code3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read inputs
        int i = scan.nextInt();      // read integer
        double d = scan.nextDouble(); // read double
        scan.nextLine(); // consume the leftover newline
        String s = scan.nextLine();  // read string

        // Print outputs
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);

        scan.close();
    }
}
