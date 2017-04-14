import java.util.Scanner;

// 系数coefficient 指数degree

public class basicLevel1010 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean flag = false;

        while (scanner.hasNext()) {
            int coe = scanner.nextInt();
            int deg = scanner.nextInt();

            if (coe * deg != 0) {
                if (flag) {
                    System.out.print(" ");
                } else {
                    flag = true;
                }
                System.out.print(coe * deg + " " + (deg - 1));
            }
        }
        scanner.close();

        if (!flag) {
            System.out.print("0 0");
        }
    }

}

