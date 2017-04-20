import java.util.Arrays;
import java.util.Scanner;

public class basicLevel1019 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        int temp = n;
        do {
            System.out.printf("%04d - %04d = %04d\n", down(temp), up(temp), down(temp) - up(temp));
            temp = down(temp) - up(temp);
        } while (temp != 0 && temp != 6174);
    }
    // 按升序排列
    public static int up(int temp) {
        int[] array = new int[4];
        for (int i = 0; i < 4; i++) {
            array[i] = temp % 10;
            temp /= 10;
        }
        Arrays.sort(array);
        return array[0] * 1000 + array[1] * 100 + array[2] * 10 + array[3];
    }
    // 按降序排列
    public static int down(int temp) {
        int[] array = new int[4];
        for (int i = 0; i < 4; i++) {
            array[i] = temp % 10;
            temp /= 10;
        }
        Arrays.sort(array);
        return array[3] * 1000 + array[2] * 100 + array[1] * 10 + array[0];
    }

}

/**
 * 另一种排列数字的方式
 *
 * public static int up(int temp) {
 *     char[] array = String.format("%4d", temp).toCharArray();
 *     Arrays.sort(array);
 *     int a = 0;
 *     for (int i = 0; i < 4; i++) {
 *         a = a * 10 + (array[i] - '0');
 *     }
 *     return a;
 * }
 */
