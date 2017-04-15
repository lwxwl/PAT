// 运行超时，还要改
import java.util.Scanner;

public class basicLevel1014 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] array = new String[4];
        int flag = 0;
        array[0] = scanner.nextLine();
        array[1] = scanner.nextLine();
        array[2] = scanner.nextLine();
        array[3] = scanner.nextLine();

        for (int i = 0; i < array[0].length(); i++) {
            if (flag == 0) {
                if (array[0].charAt(i) == array[1].charAt(i)
                        && array[0].charAt(i) >= 'A'
                        && array[0].charAt(i) <= 'G') {
                    switch (array[0].charAt(i)) {
                        case 'A' :
                            System.out.println("MON ");
                            break;
                        case 'B' :
                            System.out.println("TUE ");
                            break;
                        case 'C' :
                            System.out.println("WED ");
                            break;
                        case 'D' :
                            System.out.println("THU ");
                            break;
                        case 'E' :
                            System.out.println("FRI ");
                            break;
                        case 'F' :
                            System.out.println("SAT ");
                            break;
                        case 'G' :
                            System.out.println("SUN ");
                            break;
                        default:
                            break;
                    }
                    flag++;
                }
            } else if (flag == 1) {
                if (array[0].charAt(i) == array[1].charAt(i)
                        && (('0' <= array[0].charAt(i) && array[0].charAt(i) <= 9)
                        || ('A' <= array[0].charAt(i) && array[0].charAt(i) <= 'N'))){
                    if (array[0].charAt(i) <= '9' && array[0].charAt(i) >= '0'){
                        System.out.printf("%02d:", array[0].charAt(i) - '0');
                    } else {
                        System.out.printf("%02d:", array[0].charAt(i) - 'A' + 10);
                    }
                    flag++;
                    break;
                }
            }
        }

        for (int i = 0; i < array[2].length(); i++) {
            if (array[2].charAt(i) == array[3].charAt(i) && isAlpha(array[2].charAt(i))) {
                System.out.printf("%02d", i);
                break;
            }
        }

    }

    public static boolean isAlpha(char ch) {
        if (ch >= 'a' && ch <= 'z') {
            return true;
        } else if (ch >= 'A' && ch <= 'Z') {
            return true;
        } else {
            return false;
        }
    }

}
