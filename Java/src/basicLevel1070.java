import java.util.Arrays;
import java.util.Scanner;

public class basicLevel1070 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] length = new int[n];
        for (int i = 0; i < n; i++) {
            length[i] = scanner.nextInt();
        }
        Arrays.sort(length);
        int max = length[0];
        for (int i = 0; i < n; i++) {
            max = (max + length[i]) / 2;
        }
        System.out.println(max);
    }
}

