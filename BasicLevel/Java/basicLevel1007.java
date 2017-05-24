import java.util.Scanner;

// 如果n不是素数, 则n有满足1<d<=sqrt(n)的一个"素数"因子d.
public class basicLevel1007 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        int count = 0;
        int[] array = new int[n + 1];
        array[0] = 2;
        count = 1;
        boolean flag = true;

        for (int i = 3; i <= n; i++) {
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                array[count] = i;
                count++;
            }
            flag = true;
        }

        int finalCount = 0;
        for (int i = 0; i < count; i++) {
            if (array[i + 1] - array[i] == 2) {
                finalCount++;
            }
        }
        System.out.println(finalCount);

    }

}
