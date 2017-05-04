import java.util.Scanner;

public class basicLevel1031 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        boolean pass = true;

        for (int i = 0; i < n; i++) {
            String id = scanner.next();

            if (!inspection(id.substring(0, 17), id.charAt(17))) {
                pass = false;
                System.out.println(id);
            }
        }
        scanner.close();
        if (pass) {
            System.out.println("All passed");
        }
    }

    public static boolean inspection(String number, char last) {
        int[] weights = {7, 9, 10, 5, 8, 4, 2, 1, 6, 3, 7, 9, 10, 5, 8, 4, 2};
        int sum = 0, z = 0;
        for (int i = 0; i < number.length(); i++) {
            sum += weights[i] * (number.charAt(i) - '0');
        }
        char[] m = {'1', '0', 'X', '9', '8', '7', '6', '5', '4', '3', '2'};
        z = sum % 11;
        if (last == m[z]) {
            return true;
        }
        return false;
    }
}

