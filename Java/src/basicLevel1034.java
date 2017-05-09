import java.util.Scanner;

public class basicLevel1034 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] array = scanner.nextLine().split("[\\s/]");
        scanner.close();

        // 用其他数据类型测试点3，4会错
        long a1 = Integer.parseInt(array[0]);
        long b1 = Integer.parseInt(array[1]);
        long a2 = Integer.parseInt(array[2]);
        long b2 = Integer.parseInt(array[3]);

        if (b1 != 0 && b2 != 0) {
            add(a1, b1, a2, b2);
            subtract(a1, b1, a2, b2);
            multiply(a1, b1, a2, b2);
            divide(a1, b1, a2, b2);
        }
    }

    private static void operands(long a, long b) {
        // 输入的数为0
        if (a == 0) {
            System.out.print(0);
            return;
        }
        // 输入的数为负数
        boolean isNegative = (a <= 0);
        if (isNegative) {
            System.out.print("(-");
            a = -a;
        }
        long gcd = getGcd(a, b);
        a = a / gcd;
        b = b / gcd;
        if (a % b == 0) {
            System.out.print(a / b);
        } else if (Math.abs(a) > b) {
            System.out.print(a / b + " " + (a % b) % b + "/" + b);
        } else if (a == b) {
            System.out.print(1);
        } else {
            System.out.print(a + "/" + b);
        }

        if (isNegative) {
            System.out.print(")");
        }
    }

    // 计算时的进位数即最大公约数，辗转相除法
    private static long getGcd(long a, long b) {
        while (a % b != 0) {
            long temp = a % b;
            a = b;
            b = temp;
        }
        return b;
    }

    private static void add(long a1, long b1, long a2, long b2) {
        operands(a1, b1);
        System.out.print(" + ");
        operands(a2, b2);
        System.out.print(" = ");
        operands(a1 * b2 + a2 * b1, b1 * b2);
        System.out.println();
    }

    private static void subtract(long a1, long b1, long a2, long b2) {
        operands(a1, b1);
        System.out.print(" - ");
        operands(a2, b2);
        System.out.print(" = ");
        operands(a1 * b2 - a2 * b1, b1 * b2);
        System.out.println();
    }

    private static void multiply(long a1, long b1, long a2, long b2) {
        operands(a1, b1);
        System.out.print(" * ");
        operands(a2, b2);
        System.out.print(" = ");
        operands(a1 * a2, b1 * b2);
        System.out.println();
    }

    private static void divide(long a1, long b1, long a2, long b2) {
        operands(a1, b1);
        System.out.print(" / ");
        operands(a2, b2);
        System.out.print(" = ");
        if (a2 == 0) {
            System.out.print("Inf");
        } else if (a2 > 0) {
            operands(a1 * b2, a2 * b1);
        } else {
            operands(-1 * a1 * b2, -1 * a2 * b1);
        }
    }
}

