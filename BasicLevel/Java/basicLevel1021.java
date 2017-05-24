import java.util.Scanner;

public class basicLevel1021 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();
        scanner.close();
        int d[] = new int[10];

        for (int i = 0; i < n.length(); i++) {
            d[n.charAt(i) - '0']++;
        }

        for (int j = 0; j < n.length(); j++) {
            if (d[j] != 0) {
                System.out.printf("%d:%d\n", j, d[j]);
            }
        }

    }
}
