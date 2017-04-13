import java.util.Scanner;

public class basicLevel1004 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String string[] = new String[n];
        for (int i = 0; i < n; i++) {
            string[i] = scanner.nextLine();
        }
        int min = 101;
        int max = -1;
        int minIndex = 0;
        int maxIndex = 0;

        for (int j = 0; j < n; j++) {
            String temp[] = string[j].split(" ");
            if (min > Integer.valueOf(temp[2])) {
                min = Integer.valueOf(temp[2]);
                minIndex = j;
            }
            if (max < Integer.valueOf(temp[2])) {
                max = Integer.valueOf(temp[2]);
                maxIndex = j;
            }
        }
        String maxN[] = string[maxIndex].split(" ");
        String minN[] = string[minIndex].split(" ");
        System.out.println(maxN[0] + " " + maxN[1]);
        System.out.println(minN[0] + " " + minN[1]);

    }
}
