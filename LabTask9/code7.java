import java.util.Scanner;

public class code7 {

    static boolean isAnagram(String a, String b) {
        // Convert to lowercase
        a = a.toLowerCase();
        b = b.toLowerCase();

        // If lengths differ, not anagrams
        if (a.length() != b.length()) {
            return false;
        }

        int[] count = new int[26]; // frequency array for letters a-z

        // Count characters in both strings
        for (int i = 0; i < a.length(); i++) {
            count[a.charAt(i) - 'a']++;  // increment for string a
            count[b.charAt(i) - 'a']--;  // decrement for string b
        }

        // Check if all counts are zero
        for (int c : count) {
            if (c != 0) return false;
        }

        return true;
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}