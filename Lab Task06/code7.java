import java.util.Scanner;
import java.math.BigInteger;

public class code7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); 

        for (int i = 0; i < t; i++) {
            String input = sc.nextLine();
            try {
                BigInteger num = new BigInteger(input);

                boolean fits = false;
                StringBuilder sb = new StringBuilder();

                if (num.compareTo(BigInteger.valueOf(Byte.MIN_VALUE)) >= 0 &&
                    num.compareTo(BigInteger.valueOf(Byte.MAX_VALUE)) <= 0) {
                    sb.append("* byte\n");
                    fits = true;
                }
                if (num.compareTo(BigInteger.valueOf(Short.MIN_VALUE)) >= 0 &&
                    num.compareTo(BigInteger.valueOf(Short.MAX_VALUE)) <= 0) {
                    sb.append("* short\n");
                    fits = true;
                }
                if (num.compareTo(BigInteger.valueOf(Integer.MIN_VALUE)) >= 0 &&
                    num.compareTo(BigInteger.valueOf(Integer.MAX_VALUE)) <= 0) {
                    sb.append("* int\n");
                    fits = true;
                }
                if (num.compareTo(BigInteger.valueOf(Long.MIN_VALUE)) >= 0 &&
                    num.compareTo(BigInteger.valueOf(Long.MAX_VALUE)) <= 0) {
                    sb.append("* long\n");
                    fits = true;
                }

                if (fits) {
                    System.out.println(input + " can be fitted in:");
                    System.out.print(sb);
                } else {
                    System.out.println(input + " can't be fitted anywhere.");
                }

            } catch (Exception e) {
                System.out.println(input + " can't be fitted anywhere.");
            }
        }
        sc.close();
    }
}
