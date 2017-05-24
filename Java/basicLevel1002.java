import java.util.Scanner;
import java.util.Stack;

public class basicLevel1002 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();
        scanner.close();

        int sum = 0;
        for (int i = 0; i < n.length(); i++) {
            sum += n.charAt(i) - '0';
        }

        Stack<String> stack = new Stack<>();
        do {
            int number = sum % 10;
            switch (number) {
                case 0:
                    stack.push("ling");
                    break;
                case 1:
                    stack.push("yi");
                    break;
                case 2:
                    stack.push("er");
                    break;
                case 3:
                    stack.push("san");
                    break;
                case 4:
                    stack.push("si");
                    break;
                case 5:
                    stack.push("wu");
                    break;
                case 6:
                    stack.push("liu");
                    break;
                case 7:
                    stack.push("qi");
                    break;
                case 8:
                    stack.push("ba");
                    break;
                case 9:
                    stack.push("jiu");
                    break;
            }
            sum /= 10;
        } while (sum != 0);

        System.out.print(stack.pop());

        while (!stack.isEmpty()) {
            System.out.print(" " + stack.pop());
        }
    }

}
