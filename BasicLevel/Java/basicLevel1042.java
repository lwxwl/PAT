import java.util.Scanner;

public class basicLevel1042 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        scanner.close();
        str = str.toLowerCase();
        char[] letter = str.toCharArray();
        int[] num = new int[256];
        for (int i = 0; i < letter.length; i++) {
            if (letter[i] >= 'a' && letter[i] <= 'z') {
                num[letter[i]]++;
            }
        }
        int max = -1, index = -1;
        for (int i = 0; i < 256; i++) {
            if (max < num[i]) {
                max = num[i];
                index = i;
            }
        }
        System.out.printf("%c %d\n", (char)index, max);
    }
}



// 对另一种输入输出方式的尝试，但是发现还是Scanner比较好用。
/*
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class basicLevel1042 {

    public static void main(String[] args) {
        String str = null;
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            str = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        str = str.toLowerCase();
        char[] letter = str.toCharArray();
        int[] num = new int[256];
        for (int i = 0; i < letter.length; i++) {
            if (letter[i] >= 'a' && letter[i] <= 'z') {
                num[letter[i]]++;
            }
        }
        int max = -1, index = -1;
        for (int i = 0; i < 256; i++) {
            if (max < num[i]) {
                max = num[i];
                index = i;
            }
        }
        System.out.printf("%c %d\n", (char)index, max);
    }
}
*/

