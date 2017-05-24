import java.util.Scanner;

public class basicLevel1016 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String A = scanner.next();
        int Da = scanner.nextInt();
        String B = scanner.next();
        int Db = scanner.nextInt();
        scanner.close();

        long a = 0;
        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(i) - '0' == Da) {
                a = a * 10 + (A.charAt(i) - '0');
            }
        }

        long b = 0;
        for (int i = 0; i < B.length(); i++) {
            if (B.charAt(i) - '0' == Db) {
                b = b * 10 + (A.charAt(i) - '0');
            }
        }
        System.out.print(a + b);
    }
}

