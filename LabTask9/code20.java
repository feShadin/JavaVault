import java.util.ArrayList;
import java.util.Scanner;

public class code20 {

    public static void main(String[] args) {
        // Try-with-resources auto-closes Scanner
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt(); // number of lines

            // Store numbers in ArrayList of ArrayLists
            ArrayList<ArrayList<Integer>> list = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                int d = sc.nextInt(); // number of integers in this line
                ArrayList<Integer> temp = new ArrayList<>();
                for (int j = 0; j < d; j++) {
                    temp.add(sc.nextInt());
                }
                list.add(temp);
            }

            int q = sc.nextInt(); // number of queries

            for (int i = 0; i < q; i++) {
                int x = sc.nextInt(); // line number
                int y = sc.nextInt(); // position in line
                try {
                    System.out.println(list.get(x - 1).get(y - 1));
                } catch (Exception e) {
                    System.out.println("ERROR!");
                }
            }
        }
    }
}
