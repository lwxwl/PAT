// 这道题主要是注意切分的方法，第一次想的是用nextLine()读取全部输入，再用" "和"\\."切分两次；
// 后来意识到可以用next()读取输入， 然后"\\."切一次会比较简单；
import java.util.Scanner;

public class basicLevel1037 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.next();
        String str2 = scanner.next();
        String[] array1 = str1.split("\\.");
        String[] array2 = str2.split("\\.");
        int num1 = Integer.parseInt(array1[0]) * 17 * 29 + Integer.parseInt(array1[1]) * 29 + Integer.parseInt(array1[2]);
        int num2 = Integer.parseInt(array2[0]) * 17 * 29 + Integer.parseInt(array2[1]) * 29 + Integer.parseInt(array2[2]);
        int rest = num2 - num1;
        if(rest<0){
            System.out.print("-");
            rest = - rest;
        }
        System.out.println(rest / (17 * 29) + "." + (rest % (29 * 17) / 29) + "." + (rest % (29 * 17) % 29));
    }
}