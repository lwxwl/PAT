import java.util.Scanner;
import java.util.Stack;

/**
 * Created by lwxwl on 2017/8/23.
 */
public class advancedLevel1001 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();

        int sum = a + b;

        if (sum < 0) {
            System.out.print("-");
            sum = -sum;
        }

        Stack<Integer> stack = new Stack<>();

        while (sum >= 1000) {
            stack.push(sum % 1000);
            sum /= 1000;
        }

        if (sum != 0) {
            System.out.print(sum);
            while (!stack.isEmpty()) {
                System.out.printf(",%03d", stack.pop());
            }
        } else if (sum == 0) {
            System.out.print("0");
        } else {
            System.out.printf("%03d", stack.pop());
            while (!stack.isEmpty()) {
                System.out.printf(",%03d", stack.pop());
            }
        }
    }
}
