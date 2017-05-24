import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class basicLevel1029 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 转换成大写
        String a = scanner.nextLine().toUpperCase();
        String b = scanner.nextLine().toUpperCase();
        scanner.close();

        Set<Character> set = new HashSet<>();
        int i = 0, j = 0;
        while (i < a.length()) {
            char c = a.charAt(i++);
            if (j < b.length()) {
                if (c != b.charAt(j)) {
                    if (!set.contains(c)) {
                        System.out.print(c);
                        set.add(c);
                    }
                } else {
                    j++;
                }
            } else {
                if (!set.contains(c)) {
                    System.out.print(c);
                    set.add(c);
                }
            }
        }
    }

}
