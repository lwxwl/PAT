/*
// 
import java.util.Scanner;
import java.util.Stack;

public class basicLevel1048 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        String b = scanner.next();
        scanner.close();
        int i = a.length() - 1;
        int j = b.length() - 1;

        if (i > j) {
            int c = i - j;
            while (c != 0) {
                b = "0" + b;
                c--;
            }
        } else if (i < j) {
            int c = j - i;
            while (c != 0) {
                a = "0" + a;
                c--;
            }
        }
        int index = b.length() - 1;
        boolean isOdd = true;
        Stack<String> stack = new Stack<>();
        while (index >= 0) {
            if (isOdd) {
                isOdd = false;
                int cNumber = a.charAt(index) - '0' + b.charAt(index) - '0';
                String r;
                switch (cNumber) {
                    case 10:
                        r = "J";
                        break;
                    case 11:
                        r = "Q";
                        break;
                    case 12:
                        r = "K";
                        break;
                    default:
                        r = "" + cNumber % 13;
                        break;
                }

                stack.push(r);
            } else {
                isOdd = true;
                int cNumber = (b.charAt(index)  - a.charAt(index) + 10) % 10;
                String r = "" + cNumber;

                stack.push(r);
            }
            index--;
        }

        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
    }

}
*/