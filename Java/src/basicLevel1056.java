import java.util.Scanner;

public class basicLevel1056 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] num = new int[n];

        for (int i = 0; i < n; i++) {
            num[i] = scanner.nextInt();
        }
        scanner.close();

        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int num1 = num[i] * 10 + num[j];
                int num2 = num[j] * 10 + num[i];
                sum += (num1 + num2);
            }
        }
        System.out.println(sum);
    }
}
