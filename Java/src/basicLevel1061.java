import java.util.Scanner;

public class basicLevel1061 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] score = new int[m];
        int[] answer = new int[m];
        int[][] result = new int[n][m];
        int[] sum = new int[n];

        for (int i = 0; i < m; i++) {
            score[i] = scanner.nextInt();
        }
        for (int i = 0; i < m; i++) {
            answer[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                result[i][j] = scanner.nextInt();
                if (result[i][j] == answer[j]) {
                    sum[i] += score[j];
                }
            }
            System.out.println(sum[i]);
        }
        scanner.close();
    }
}

