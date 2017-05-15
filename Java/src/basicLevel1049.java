import java.text.DecimalFormat;
import java.util.Scanner;

public class basicLevel1049 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double[] input = new double[n];
        double sum = 0;

        for (int i = 0; i < n; i++) {
            input[i] = scanner.nextDouble();
        }
        scanner.close();

        for (int i = 0; i < n; i++) {
            double temp = input[i];
            for (int j = i + 1; j < n; j++) {
                sum += temp;
                temp += input[j];
            }
            sum += temp;
        }
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        System.out.println(decimalFormat.format(sum));
    }
}

// 其实这道题最后的输出可以换成 System.out.printf("%.2f", sum);
/*
   中间也可以先计算，然后简化成：
   double total = 0.0;
   double input;
   for (int i = 0; i < n; i++) {
       input = in.nextDouble();
 	   sum += input * (i + 1) * (n - i);
   }
   可是无论怎么改，测试点3，4都超时qAq
 */




