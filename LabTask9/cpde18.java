import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class cpde18 {
    public static void main(String[] args) throws IOException {
        // Try-with-resources automatically closes the BufferedReader
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {

            List<List<Integer>> arr = new ArrayList<>();

            for (int i = 0; i < 6; i++) {
                String[] arrRowTempItems = bufferedReader.readLine().trim().split(" ");

                List<Integer> arrRowItems = new ArrayList<>();
                for (int j = 0; j < 6; j++) {
                    arrRowItems.add(Integer.parseInt(arrRowTempItems[j]));
                }
                arr.add(arrRowItems);
            }

            // Initialize max with smallest possible value
            int maxSum = Integer.MIN_VALUE;

            // Loop through all possible hourglasses
            for (int i = 0; i <= 3; i++) {
                for (int j = 0; j <= 3; j++) {
                    int sum = arr.get(i).get(j) + arr.get(i).get(j + 1) + arr.get(i).get(j + 2)
                            + arr.get(i + 1).get(j + 1)
                            + arr.get(i + 2).get(j) + arr.get(i + 2).get(j + 1) + arr.get(i + 2).get(j + 2);

                    maxSum = Math.max(maxSum, sum);
                }
            }

            // Print the largest hourglass sum
            System.out.println(maxSum);
        }
    }
}
