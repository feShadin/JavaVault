
import java.util.*;

public class code8 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        scan.close();
        
    // Trim leading/trailing spaces
        s = s.trim();
        
        // Handle empty string edge case
        if (s.isEmpty()) {
            System.out.println(0);
            return;
        }
        
        // Split string on any sequence of non-alphabetic characters
        String[] tokens = s.split("[^A-Za-z]+");
        
        // Print number of tokens
        System.out.println(tokens.length);
        
        // Print each token on a new line
        for (String token : tokens) {
            System.out.println(token);
        }
    }
}
