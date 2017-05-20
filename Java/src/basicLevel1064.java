import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class basicLevel1064 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Set<Integer> set = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            int temp = scanner.nextInt();
            set.add(getSum(temp));
        }
        scanner.close();
        System.out.println(set.size());
        boolean isFirst = true;
        for (int id: set) {
            if (!isFirst) {
                System.out.print(" ");
            }
            System.out.print(id);
            isFirst = false;
        }
    }

    public static int getSum(int num) {
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
