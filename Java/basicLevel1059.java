// Test point 1 and 2 run timeout...
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class basicLevel1059 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Map<String, Integer> input = new HashMap<>();
        Map<String, Boolean> exist = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String id = scanner.next();
            input.put(id, i + 1);
            exist.put(id, false);
        }

        int k = scanner.nextInt();
        String[] check = new String[k];
        for (int i = 0; i < k; i++) {
            check[i] = scanner.next();
        }
        scanner.close();

        for (int i = 0; i < k; i++) {
            if (input.containsKey(check[i])) {
                if (exist.get(check[i])) {
                    System.out.println(check[i] + ": Checked");
                } else {
                    exist.put(check[i], true);
                    if (input.get(check[i]) == 1) {
                        System.out.println(check[i] + ": Mystery Award");
                    } else if (isPrime(input.get(check[i]))) {
                        System.out.println(check[i] + ": Minion");
                    } else {
                        System.out.println(check[i] + ": Chocolate");
                    }
                }
            } else {
                System.out.println(check[i] + ": Are you kidding?");
            }
        }

    }

    public static boolean isPrime(int a) {
        boolean flag = true;
        if (a < 2) {
            return false;
        } else {
            for (int i = 2; i <= Math.sqrt(a); i++) {
                if (a % i == 0) {
                    flag = false;
                    break;
                }
            }
        }
        return flag;
    }

}