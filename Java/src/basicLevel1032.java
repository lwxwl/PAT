// Test point 3 ran timeout...
import java.util.Scanner;

public class basicLevel1032 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int scores[] = new int[100000];
        int school,grade;
        int max = 0, number = 0;
        for (int i = 0; i < n; i++) {
            school = scanner.nextInt();
            grade = scanner.nextInt();
            scores[school] += grade;
            if (max < scores[school]) {
                number = school;
                max = scores[school];
            }
        }
        scanner.close();
        System.out.printf("%d %d", number, max);
    }
}

