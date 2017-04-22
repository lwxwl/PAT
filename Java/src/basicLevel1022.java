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
// 果不其然运行超时了……尝试用StringBuilder也还是超时，最后还是用C++通过的 づ﹏ど

