// Pay attention to the use of indexOf() and substring().
// Test point 4 ran timeout.
import java.util.Scanner;

public class basicLevel1033 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String key = scanner.nextLine();
        String str = scanner.nextLine();
        scanner.close();
        int flag = 0;      // 判断能否有字符被打出
        int upper = key.indexOf("+");

        if (key.isEmpty()) {
            System.out.println(str);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            String temp = str.substring(i, i + 1);
            if (!key.contains(temp.toUpperCase())) {
                if (upper == -1) {
                    flag = 1;
                    System.out.print(temp);
                } else {
                    char c[] = temp.toCharArray();
                    if (c[0] >= 'A' && c[0] <= 'Z') {
                        continue;
                    } else {
                        flag = 1;
                        System.out.print(temp.toLowerCase());
                    }
                }
            }
        }
        if (flag == 0) {
            System.out.println();
        }
    }
}



