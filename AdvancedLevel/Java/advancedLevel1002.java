import java.util.Scanner;

/**
 * Created by lwxwl on 2017/8/23.
 */
public class advancedLevel1002 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        double array[] = new double[1001];
        for (int i = 0; i < num; i++) {
            array[scanner.nextInt()] += scanner.nextDouble();
        }

        num = scanner.nextInt();
        for (int i = 0; i < num; i++) {
            array[scanner.nextInt()] += scanner.nextDouble();
        }

        int count = 0;

        for (int i = 0; i < 1001; i++) {
            if (array[i] != 0) {
                count++;
            }
        }

        System.out.print(count);

        for (int i = 1000; i >= 0; i--) {
            if (array[i] != 0) {
                System.out.printf(" %d %.1f", i, array[i]);
            }
        }
    }

}
