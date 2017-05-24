import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class basicLevel1045 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> output = new ArrayList<>();
        int[] input = new int[n];
        for (int i = 0; i < n; i++) {
            input[i] = scanner.nextInt();
        }
        scanner.close();

        for (int i = 0; i < n; i++) {
            boolean left = true;
            boolean right = true;
            for (int j = i - 1; j >= 0; j--) {
                if (input[j] > input[i]) {
                    left = false;
                    break;
                }
            }
            for (int j = i + 1; j < n; j++) {
                if (input[j] < input[i]) {
                    right = false;
                    break;
                }
            }
            if (left && right) {
                output.add(input[i]);
            }
        }
        int num = output.size();
        System.out.println(num);
        for (int i = 0; i < num - 1; i++) {
            System.out.print(output.get(i) + " ");
        }
        System.out.println(output.get(num - 1));
    }

}
