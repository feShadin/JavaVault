import java.util.Scanner;

public class code4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        in.close();
        
        // Check if indices are valid
        if (start < 0 || end > S.length() || start > end) {
            System.out.println("Invalid indices");
        } else {
            String result = S.substring(start, end);
            System.out.println(result);
        }
    }
}