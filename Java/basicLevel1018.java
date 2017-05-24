/*
import java.util.Scanner;

public class basicLevel1018 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] jia = new int[3];
        int[] yi = new int[3];
        int[] jWin = new int[3];
        int[] yWin = new int[3];

        for (int i = 0; i < n; i++) {
            String str1 = scanner.next();
            String str2 = scanner.next();

            if (compare(str1, str2) == 1) {
                jWin[0]++;
                yWin[2]++;
                if (str1.equals("J")) {
                    jia[0]++;
                } else if (str1.equals("C")) {
                    jia[1]++;
                } else {
                    jia[2]++;
                }
            } else if (compare(str1, str2) == 0) {
                jWin[1]++;
                yWin[1]++;
            } else {
                jWin[2]++;
                yWin[0]++;
                if (str2.equals("J")) {
                    yi[0]++;
                } else if (str2.equals("C")) {
                    yi[1]++;
                } else {
                    yi[2]++;
                }
            }
        }
        scanner.close();
        System.out.println(jWin[0] + " " + jWin[1] + " " + jWin[2]);
        System.out.println(yWin[0] + " " + yWin[1] + " " + yWin[2]);
        System.out.println(findAction(jia) + " " + findAction(yi));
    }

    public static int compare(String x, String y) {
        if (x.equals("C")) {
            if (y.equals("C")) {
                return 0;
            } else if (y.equals("B")) {
                return -1;
            } else {
                return 1;
            }
        } else if (x.equals("J")) {
            if (y.equals("C")) {
                return -1;
            } else if (y.equals("B")) {
                return 1;
            } else {
                return 0;
            }
        } else {
            if (y.equals("C")) {
                return 1;
            } else if (y.equals("B")) {
                return 0;
            } else {
                return -1;
            }
        }
    }

    public static String findAction(int[] action) {
        int num = -1;
        String result;
        int t = 0;
        for (int i = 0; i < action.length; i++) {
            if (t <= action[i]) {
                t = action[i];
                num = i;
            }
        }
        if (num == 0) {
            result = "J";
        } else if (num == 1) {
            result = "C";
        } else {
            result = "B";
        }
        return result;
    }

}

*/
