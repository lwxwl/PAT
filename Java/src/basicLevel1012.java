// Just run timeout...
// 余数 remainder
import java.text.DecimalFormat;
import java.util.Scanner;

public class basicLevel1012 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int input, rem;
        int a1 = 0, a2= 0, a3 = 0, a4 = 0, a5 = 0;
        int count1 = 0, count2 = 0, count3 = 0, count4 = 0, count5 = 0;

        for (int i = 0; i < n; i++) {
            input = scanner.nextInt();
            rem = input % 5;
            switch (rem) {
                case 0:
                    if (input % 2 == 0) {
                        a1 += input;
                        count1 = 1;
                    }
                    break;
                case 1:
                    if (count2 % 2 == 0) {
                        a2 += input;
                    } else {
                        a2 += (-1) * input;
                    }
                    count2++;
                    break;
                case 2:
                    count3++;
                    break;
                case 3:
                    a4 += input;
                    count4++;
                    break;
                case 4:
                    if (a5 < input) {
                        a5 = input;
                    }
                    count5 = 1;
                    break;
            }
        }
        scanner.close();
        DecimalFormat decimalFormat = new DecimalFormat("0.0"); // 格式化数字
        if (count1 != 0) {
            System.out.print(a1 + " ");
        } else {
            System.out.print("N" + " ");
        }
        if (count2 != 0) {
            System.out.print(a2 + " ");
        } else {
            System.out.print("N" + " ");
        }
        if (count3 != 0) {
            System.out.print(count3 + " ");
        } else {
            System.out.print("N" + " ");
        }
        if (count4 != 0) {
            System.out.print(decimalFormat.format((float) a4 / (float) count4) + " ");
        } else {
            System.out.print("N" + " ");
        }
        if (count5 != 0) {
            System.out.print(a5);
        } else {
            System.out.print("N");
        }
    }
}
