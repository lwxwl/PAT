// Test point 2...
import java.util.Scanner;

public class basicLevel1053 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();        // 居民区住房总套数
        double e = scanner.nextDouble();  // 低电量阈值
        int d = scanner.nextInt();        // 观察期阈值
        int may = 0, must = 0;

        for (int i = 0; i < n; i++) {
            int k = scanner.nextInt();    // 观察的天数
            int count = 0;
            for (int j = 0; j < k; j++) {
                double ei = scanner.nextDouble();
                if (ei < e) {
                    count++;
                }
            }
            if (k / 2 < count) {
                if (k > d) {
                    must++;
                } else {
                    may++;
                }
            }
        }
        scanner.close();
        System.out.printf("%.1f%% %.1f%%", may * 1.0 / n * 100, must * 1.0 / n * 100);
    }
}
