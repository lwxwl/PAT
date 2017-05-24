import java.util.Scanner;

public class basicLevel1054 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;
        double x = 0, y = 0;
        String numbers = null;
        for (int i = 0; i < n; i++) {
            try {
                numbers = scanner.next();
                x = Double.parseDouble(numbers);
                double temp = Double.parseDouble(String.format("%.2f", x));
                if (x > 1000 || x < -1000 || Math.abs(temp - x) >= 0.001) {
                    throw new NumberFormatException();
                }
                count++;
                y +=x;
            } catch (NumberFormatException e) {
                System.out.println("ERROR: " + numbers + " is not a legal number");
            }
        }
        scanner.close();

        if (count == 0) {
            System.out.println("The average of 0 numbers is Undefined");
        } else if (count == 1) {
            System.out.printf("The average of 1 number is %.2f", y);
        } else {
            System.out.printf("The average of %d numbers is %.2f", count, y / count);
        }
    }
}
