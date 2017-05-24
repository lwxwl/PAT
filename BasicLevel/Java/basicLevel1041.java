import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class basicLevel1041 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Map<Integer, String> student = new HashMap<>();
        Map<Integer, Integer> num = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String id = scanner.next();
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();
            student.put(num1, id);
            num.put(num1, num2);
        }
        int m = scanner.nextInt();
        int[] inquire = new int[n];
        for (int i = 0; i < m; i++) {
            inquire[i] = scanner.nextInt();
            System.out.println(student.get(inquire[i]) + " " + num.get(inquire[i]));
        }
        scanner.close();
    }
}

