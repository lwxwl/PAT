import java.util.Scanner;

public class basicLevel1008 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();       // 数组中的数
        int count = scanner.nextInt();   // 向右移的位数
        int[] array = new int[n];        // 储存输入的n个整数
        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        scanner.close();
        for (int i = 0; i < count; i++) {
            int temp = array[n - 1];
            for (int j = n - 1; j > 0; j--) {
                array[j] = array[j - 1];
            }
            array[0] = temp;
        }
        for (int i = 0; i < n; i++) {
            if (i == n - 1) {
                System.out.print(array[i]);
            } else {
                System.out.print(array[i] + " ");
            }
        }
    }
}
