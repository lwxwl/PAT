// coefficient系数 exponent指数 decimal小数（ 日常英语(˶‾᷄ ⁻̫ ‾᷅˵) ）
// Forever time-out, the method is right, but I don't know how to improve it to make it more efficient.
import java.util.Scanner;

public class basicLevel1024 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] str = scanner.nextLine().split("[.E]");
        scanner.close();
        int coe = Integer.parseInt(str[0]);
        int exp = Integer.parseInt(str[2]);

        if (exp >= 0) {
            // 指数大于0的情况
            System.out.print(coe);
            boolean hasDecimal = true;
            // 判断转换后的数字是否有小数
            if (str[1].length() <= exp) {
                hasDecimal = false;
            }
            for (int i = 0; i < str[1].length() && exp != 0; i++, exp--) {
                System.out.print(str[1].charAt(i));
            }
            if (hasDecimal) {
                System.out.print(".");
                for (int i = 0; i < str[1].length(); i++) {
                    System.out.print(str[1].charAt(i));
                }
            }
            while (exp != 0) {
                System.out.print("0");
                exp--;
            }

        } else {
            // 指数小于0的情况
            exp = -exp;
            if (coe < 0) {
                System.out.print("-");
                coe = -coe;
            }
            System.out.print("0.");
            for (int i = 1; i < exp; i++) {
                System.out.print("0");
            }
            System.out.print(coe);
            System.out.print(str[1]);
        }
    }
}