import java.util.*;

public class code6 {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        sc.close();
        
        // Reverse the string using StringBuilder
        String reversed = new StringBuilder(A).reverse().toString();
        
        // Check if original and reversed are equal
        if (A.equals(reversed)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
    }
}
