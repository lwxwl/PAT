import java.util.Scanner;

public class advancedLevel1008 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int num[] = new int[n];

        for (int i = 0; i < n; i++) {
            num[i] = scanner.nextInt();
        }
        scanner.close();

        int time = num[0] * 6;
        time += n * 5;

        for (int i = 1; i < n; i++) {
            int temp = Math.abs(num[i] - num[i - 1]);
            if (num[i] > num[i - 1]) {
                time += temp * 6;
            } else if (num[i] < num[i - 1]) {
                time += temp * 4;
            }
        }
        System.out.println(time);
    }
}
