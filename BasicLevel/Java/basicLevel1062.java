import java.util.Scanner;

public class basicLevel1062 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] first = scanner.next().split("/");
        String[] second = scanner.next().split("/");
        int k = scanner.nextInt();
        scanner.close();

        double n1 = Double.parseDouble(first[0]) / Double.parseDouble(first[1]);
        double n2 = Double.parseDouble(second[0]) / Double.parseDouble(second[1]);
        boolean space = false;

        for (int i = 1; i < k; i++) {
            int g = gcd(i, k);
            if (g == 1 && (isBetween(n1, n2, i * 1.0 / k))) {
                if (space) {
                    System.out.print(" ");
                }
                System.out.print(i + "/" + k);
                space = true;
            }
        }
    }
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static boolean isBetween(double a, double b, double c) {
        if (c > Math.min(a, b) && c < Math.max(a, b)) {
            return true;
        }
        return false;
    }
}


