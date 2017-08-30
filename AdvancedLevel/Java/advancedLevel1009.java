import java.util.Scanner;

public class advancedLevel1009 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();

        double n1[] = new double[1001];
        double n2[] = new double[1001];
        double n[] = new double[2001];

        for (int i = 0; i < k; i++) {
            n1[scanner.nextInt()] = scanner.nextDouble();
        }

        k = scanner.nextInt();
        for (int i = 0; i < k; i++) {
            n2[scanner.nextInt()] = scanner.nextDouble();
        }
        scanner.close();

        for (int i = 0; i < 1001; i++) {
            for (int j = 0; j < 1001; j++) {
                n[i + j] += n1[i] * n2[j];
            }
        }

        int count = 0;
        for (int i = 2000; i >= 0; i--) {
            if (n[i] != 0) {
                count++;
            }
        }

        System.out.print(count);
        for (int i = 2000; i >= 0; i--) {
            if (n[i] != 0) {
                // The precision of n[i] has to be considered.
                System.out.printf(" %d %.1f", i, n[i]);
            }
        }
    }
}
