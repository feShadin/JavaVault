
import java.util.Scanner;

public class code9 {
    static int B;
    static int H;

    static {
        Scanner sc = new Scanner(System.in);
        B = sc.nextInt();
        H = sc.nextInt();
        sc.close();

        // Validate input in static block
        if (B <= 0 || H <= 0) {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
            System.exit(0); 
        }
    }

    public static void main(String[] args) {
        int area = B * H;
        System.out.println(area);
    }
}
