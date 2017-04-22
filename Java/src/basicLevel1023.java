import java.util.Scanner;

public class basicLevel1023 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = scanner.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            if(array[i] != 0) {
                System.out.print(i);
                array[i]--;
                break;
            }
        }
        for (int i = 0; i < 10; i++) {
            while (array[i] != 0) {
                System.out.print(i);
                array[i]--;
            }
        }
    }
}
// 部分正确，还有情况没有考虑到