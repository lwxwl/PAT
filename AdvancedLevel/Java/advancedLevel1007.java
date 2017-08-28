import java.util.Scanner;

public class advancedLevel1007 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int n[] = new int[k];
        for (int i = 0; i < k; i++) {
            n[i] = scanner.nextInt();
        }
        scanner.close();

        int tempSum = 0, maxSum = -1, tempFirst = 0, first = 0, last = 0;
        for (int i = 0; i < k; i++) {
            tempSum += n[i];
            if (tempSum > maxSum) {
                maxSum = tempSum;
                first = tempFirst;
                last = i;
            } else if (tempSum < 0) {
                tempSum = 0;
                tempFirst = i + 1;
            }
        }

        if (isPositive(n)) {
            System.out.println(maxSum + " " + n[first] + " " + n[last]);
        } else {
            System.out.println("0 " + n[0] + " " + n[k - 1]);
        }
    }

    private static boolean isPositive(int n[]) {
        for (int i = 0; i < n.length; i++) {
            if (n[i] >= 0) {
                return true;
            }
        }
        return false;
    }
}
