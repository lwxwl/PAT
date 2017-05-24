import java.util.Scanner;

public class basicLevel1009 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        scanner.close();
        String[] array = str.split(" ");   // 在空格处分开，将单词存入数组中

        // 倒序输出数组中的字符串
        for (int i = array.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(array[i]);
            } else {
                System.out.print(array[i] + " ");
            }
        }

    }
}
