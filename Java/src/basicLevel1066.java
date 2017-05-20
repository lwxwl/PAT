import java.util.Scanner;

public class basicLevel1066 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int value = scanner.nextInt();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int temp = scanner.nextInt();
                if (a <= temp && temp <= b) {
                    temp = value;
                }
                if (j != 0) {
                    System.out.print(" ");
                }
                System.out.printf("%03d", temp);
            }
            System.out.println();
        }
    }
}
