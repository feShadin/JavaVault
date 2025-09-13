import java.util.Scanner;

public class code19 {
    public static void main(String[] args) {
        // Use try-with-resources to auto-close Scanner
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int count = 0;
            // Check all subarrays
            for (int i = 0; i < n; i++) {
                int sum = 0;
                for (int j = i; j < n; j++) {
                    sum += arr[j];
                    if (sum < 0) {
                        count++;
                    }
                }
            }

            System.out.println(count);
        }
    }
}
