// Test point 2 and 3 will run timeout if I use Scanner.
// So I used the BufferedReader and InputStreamReader.
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// import java.util.Scanner;

public class basicLevel1057 {

    public static void main(String[] args) {
        String str = null;
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            str = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        // Scanner scanner = new Scanner(System.in);
        // String str = scanner.nextLine();
        str = str.toLowerCase();
        int n = str.length();
        int num = 0;
        for (int i = 0; i < n; i++) {
            char c = str.charAt(i);
            if (c >= 97 && c <= 122) {
                num = num + c - 96;
            }
        }
        String binary = Integer.toBinaryString(num);
        int n2 = binary.length();
        int zero = 0, one = 0;
        if (num != 0) {
            for (int i = 0; i < n2; i++) {
                if (binary.charAt(i) == 48) {
                    zero++;
                } else {
                    one++;
                }
            }
        }
        System.out.println(zero + " " + one);
    }
}

