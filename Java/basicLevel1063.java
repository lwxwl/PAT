// 意料之中的超时，测试点2
import java.util.Scanner;

public class basicLevel1063 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double module = -1;

        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            double m = getModule(a, b);
            module = module > m? module: m;
        }
        scanner.close();
        System.out.printf("%.2f", module);
    }

    public static double getModule(int a, int b) {
        return Math.sqrt(a * a + b * b);
    }
}
