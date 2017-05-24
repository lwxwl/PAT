// Test point 3 run timeout...
import java.util.Arrays;
import java.util.Scanner;

public class basicLevel1060 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] distance = new int[n];
        for (int i = 0; i < n; i++) {
            distance[i] = scanner.nextInt();
        }
        scanner.close();
        Arrays.sort(distance);
        int e;
        if (distance[0] > n) {
            e = n;
            System.out.println(e);
        } else {
            e = 0;
            for (int i = n - 1; i >= 0 ; i--) {
                if (distance[i] <= n - i) {
                    e = n - i - 1;
                    break;
                }
            }
            System.out.println(e);
        }
    }
}
