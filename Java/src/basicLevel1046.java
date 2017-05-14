import java.util.Scanner;

public class basicLevel1046 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int count1 = 0, count2 = 0;
        for (int i = 0; i < n; i++) {
            int jia1 = scanner.nextInt();
            int jia2 = scanner.nextInt();
            int yi1 = scanner.nextInt();
            int yi2 = scanner.nextInt();
            int sum = jia1 + yi1;
            if (jia2 == sum && yi2 != sum) {
                count2++;
            } else if (yi2 == sum && jia2 != sum) {
                count1++;
            }
        }
        scanner.close();
        System.out.printf("%d %d", count1, count2);
    }
}
