// Here stays some questions.
// I haven't consider the situation while the first number is zero...
import java.util.Scanner;

public class basicLevel1023 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = scanner.nextInt();
        }
        scanner.close();
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            if (array[i] != 0) {
                str.append(i);
                array[i]--;
                break;
            }
        }
        for (int i = 0; i < 10; i++) {
            while (array[i] != 0) {
                str.append(i);
                array[i]--;
            }
        }
        System.out.println(str);
    }
}

