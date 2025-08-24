import java.util.Scanner;

public class code6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt(); // number of queries

        for (int i = 0; i < q; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();

            int sum = a;
            for (int j = 0; j < n; j++) {
                sum += b * (1 << j); // 1 << j is 2^j
                System.out.print(sum + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
