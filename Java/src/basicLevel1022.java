// 2017.05.04
// Ok, I tried to use different data types and passed without run timeout.
// I have to say, if you run timeout, you'd better try for more times and it may pass. ٩(∗ ›ω‹ ∗)و
import java.util.Scanner;

public class basicLevel1022 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int d = scanner.nextInt();
        scanner.close();
        long sum = (long) a + b;
        System.out.printf("%s", toTransform(sum, d));
    }

    public static String toTransform(long i, int j) {
        String str = "";
        if (i == 0) {
            return "0";
        }
        long divide = i;
        int divisor = j;
        while (i != 0) {
            str += divide % divisor;
            divide = divisor / divisor;
        }
        return str;
    }
}


// 2017.04.22
// 果不其然运行超时了……最后还是用C++通过的 づ﹏ど
/*
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class basicLevel1022 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a, b, d;
        a = scanner.nextInt();
        b = scanner.nextInt();
        d = scanner.nextInt();
        scanner.close();
        toTransform(a, b, d);
    }
    public static void toTransform(int a, int b, int d) {
        List<Integer> num = new ArrayList<>();
        int sum = a + b;
        while (sum != 0) {
            num.add(sum % d);
            sum /= d;
        }
        for (int i = num.size() - 1; i >= 0; i--) {
            System.out.print(num.get(i));
        }
    }
}
*/

// 用下面这种方法的时候输出的是反的，待改正……如果在最后用数组再存一次c的话是不是太麻烦了？？？求教
/*
import java.math.BigInteger;
import java.util.Scanner;

public class basicLevel1022 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        BigInteger a, b, d, sum;
        a = scanner.nextBigInteger();
        b = scanner.nextBigInteger();
        d = scanner.nextBigInteger();
        scanner.close();
        sum = a.add(b);

        if(sum.compareTo(BigInteger.ZERO) != 0) {
            System.out.println(toTransform(sum, d));
        } else {
            System.out.println("0");
        }
    }
    private static String toTransform(BigInteger a, BigInteger b) {
        String str = "";
        while(a.compareTo(BigInteger.ZERO) != 0){
            BigInteger temp = a.mod(b);
            a = a.divide(b);
            String c = temp.toString();
            str += c;
        }
        return str;
    }
}
*/
