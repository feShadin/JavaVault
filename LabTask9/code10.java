import java.util.Scanner;

class Code10 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {  // 'in' auto-closed
            MyRegex regex = new MyRegex();          // create regex once
            while (in.hasNext()) {
                String IP = in.next();
                System.out.println(IP.matches(regex.pattern));
            }
        }
    }
}

class MyRegex {
    String pattern = "((25[0-5]|2[0-4][0-9]|1[0-9]{2}|0?[0-9]{1,2})\\.){3}"
                   + "(25[0-5]|2[0-4][0-9]|1[0-9]{2}|0?[0-9]{1,2})";
}