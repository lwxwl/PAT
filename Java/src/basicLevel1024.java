import java.util.Scanner;

public class basicLevel1024 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] str = scanner.nextLine().split("[.E]");
        scanner.close();
        // coefficient系数 exponent指数（ 日常英语(˶‾᷄ ⁻̫ ‾᷅˵) ）
        int coe = Integer.parseInt(str[0]);
        int exp = Integer.parseInt(str[2]);
        if (exp >= 0) {
            System.out.print(coe);
            boolean flag = true;
            if (str[1].length() <= exp) {
                flag = false;
            }
            int i = 0;
            for (i = 0; i < str[1].length() && exp != 0; i++, exp--) {
                System.out.print(str[1].charAt(i));
            }
            if (flag) {
                System.out.print(".");
                for (; i < str[1].length(); i++) {
                    System.out.print(str[1].charAt(i));
                }
            }
            while (exp != 0) {
                System.out.print("0");
                exp--;
            }
        } else {
            if (coe < 0) {
                System.out.print("-");
                coe = -coe;
            }
            System.out.print("0.");
            for (int i = 1; i < Math.abs(exp); i++) {
                System.out.print(coe);
                System.out.print(str[1]);
            }
        }
    }
}