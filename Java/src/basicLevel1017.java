import java.math.BigInteger;
import java.util.Scanner;

public class basicLevel1017 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        BigInteger a = scanner.nextBigInteger();
        BigInteger b = scanner.nextBigInteger();
        scanner.close();

        System.out.println(a.divide(b) + " " + a.mod(b));
    }
}
