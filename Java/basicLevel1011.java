import java.math.BigInteger;
import java.util.Scanner;

public class basicLevel1011 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();              // 测试用例的个数

        for (int i = 0; i <= n; i++) {
            BigInteger a = scanner.nextBigInteger();
            BigInteger b = scanner.nextBigInteger();
            BigInteger c = scanner.nextBigInteger();

            if (a.add(b).compareTo(c) > 0) {
                System.out.println("Case #" + i + ": true");
            } else {
                System.out.println("Case #" + i + ": false");
            }
        }
    }
}
