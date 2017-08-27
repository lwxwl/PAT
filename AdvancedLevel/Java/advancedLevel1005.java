import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class advancedLevel1005 {

    public static void main(String[] args) {
        String number[] =  {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        BigInteger n = scanner.nextBigInteger();
        scanner.close();

        // Split BigInteger by digits
        List<Integer> list = new ArrayList<>();
        BigInteger ten = new BigInteger("10");
        while (!n.equals(BigInteger.ZERO)) {
            list.add(0, n.mod(ten).intValue());
            n = n.divide(ten);
        }

        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }

        Stack<String> stack = new Stack<>();

        do {
            stack.push(match(sum % 10));
            sum /= 10;
        } while (sum != 0);

        while (stack.size() != 1) {
            System.out.print(stack.pop() + " ");
        }
        System.out.print(stack.pop());
    }

    private static String match(int digit) {
        switch (digit) {
            case 1:
                return "one";
            case 2:
                return "two";
            case 3:
                return "three";
            case 4:
                return "four";
            case 5:
                return "five";
            case 6:
                return "six";
            case 7:
                return "seven";
            case 8:
                return "eight";
            case 9:
                return "nine";
            default:
                return "zero";
        }
    }
}
/*
*********************************************************************************
// Another way to split BigInteger by digits without using List.

String string = n.toString();
int[] digits = new int[string.length()];
for (int i = 0; i < string.length(); i++) {
    digits[i] = Integer.parseInt(String.valueOf(string.charAt(i)));
    sum += digits[i];
}

*********************************************************************************

// Or we can avoid using BigInteger and just use String directly.
// And this method seems to be easier.

String n = scanner.nextLine();
for (int i = 0; i < n.length(); i++) {
    sum += n.charAt(i) - '0';
}

*********************************************************************************

// Without using match(), we can define a String like this :

String number[] =  {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

// After that, just use ->

stack.push(number[sum % 10]);

// instead of ->

stack.push(match(sum % 10));

*********************************************************************************

* All those methods will be OK to pass the test ♪ヾ(＇∀＇o)ﾉ
*/