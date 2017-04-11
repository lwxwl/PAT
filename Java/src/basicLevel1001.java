import java.util.Scanner;

public class basicLevel1001 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        int i = 0;
        while (n != 1) {
            if (n % 2 != 0) {
                n = 3 * n + 1;
            }
            n /= 2;
            i++;
        }
        System.out.println(i);
    }

}


