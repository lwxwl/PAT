// This time I known how to find the highest digit and passed successfully.
// But sometimes it will run timeout, maybe it takes luck to pass this test.

import java.util.Scanner;

public class basicLevel1023 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = scanner.nextInt();
        }
        scanner.close();
        System.out.printf("%s", min(array));
    }

    public static String min(int[] a) {

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1; i < a.length; i++) {
            if (a[i] != 0) {
                stringBuilder.append(i);
                a[i]--;
                break;
            }
        }

        for (int j = 0; j < a.length; j++) {
            if (a[j] != 0) {
                for (int k = 0; k < a[j]; k++) {
                    stringBuilder.append(j);
                }
            }
        }
        return stringBuilder.toString();
    }
}

