import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class code13 {
    public static void main(String[] args) {
        // Try-with-resources automatically closes the Scanner
        try (Scanner in = new Scanner(System.in)) {
            int testCases = Integer.parseInt(in.nextLine());

            while (testCases > 0) {
                String line = in.nextLine();

                // Regex pattern to match valid content inside tags
                String regex = "<([^<>]+)>([^<>]+)</\\1>";
                Pattern p = Pattern.compile(regex);
                Matcher m = p.matcher(line);

                boolean found = false;
                while (m.find()) {
                    System.out.println(m.group(2));
                    found = true;
                }

                if (!found) {
                    System.out.println("None");
                }

                testCases--;
            }
        }
    }
}
