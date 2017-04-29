import java.util.Scanner;

public class basicLevel1027 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        char c = scanner.next().charAt(0);
        scanner.close();

        int num  = (int) Math.sqrt((n + 1) / 2);

        for (int i = 0; i < 2 * num - 1; i++) {

            for (int j =0; j < 2 * num - 1; j++) {
                if ((i > j && i + j < 2 * num - 2) || (i < j && i + j > 2 * num - 2)) {

                    if (i > j && i + j < 2 * num - 2) {
                        System.out.print(" ");
                    }

                } else {
                    System.out.print(c);
                }
            }

            System.out.println();
        }

        System.out.println(n - 2 * num * num + 1);
    }
}


