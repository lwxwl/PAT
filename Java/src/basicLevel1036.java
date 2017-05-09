import java.util.Scanner;

public class basicLevel1036 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        char c = scanner.next().charAt(0);
        scanner.close();
        int row = (int) (n / 2.0 + 0.5);

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0 || i == row - 1 || j == n - 1) {
                    System.out.print(c);
                } else {
                    System.out.print(' ');
                }
            }
            System.out.println();
        }
    }
}

