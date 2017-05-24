import java.util.Scanner;

public class basicLevel1026 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int c1 = scanner.nextInt();
        int c2 = scanner.nextInt();
        scanner.close();
        int seconds = (int) ((c2 - c1) * 1.0 / 100 + 0.5);
        System.out.printf("%02d:%02d:02d", seconds / 3600, seconds / 60 % 60, seconds % 60);
    }
}
