import java.util.Arrays;
import java.util.Scanner;

public class basicLevel1030 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int p = scanner.nextInt();
        int num = 1;
        double[] array = new double[n];

        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextFloat();
        }
        scanner.close();
        Arrays.sort(array);

        for (int i = 0; i < n; i++) {
            for (int j = i + num; j < n; j++) {
                if (array[j] <= array[i] * p) {
                    if (j - i + 1 > num) {
                        num = j - i + 1;
                    }
                } else {
                    break;
                }
            }
        }
        System.out.println(num);
    }
}

}