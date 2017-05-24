import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class basicLevel1043 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        scanner.close();

        List<Character> P = new ArrayList<>();
        List<Character> A = new ArrayList<>();
        List<Character> T = new ArrayList<>();
        List<Character> e = new ArrayList<>();
        List<Character> s = new ArrayList<>();
        List<Character> t = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            switch (str.charAt(i)) {
                case 'P':
                    P.add(str.charAt(i));
                    break;
                case 'A':
                    A.add(str.charAt(i));
                    break;
                case 'T':
                    T.add(str.charAt(i));
                    break;
                case 'e':
                    e.add(str.charAt(i));
                    break;
                case 's':
                    s.add(str.charAt(i));
                    break;
                case 't':
                    t.add(str.charAt(i));
                    break;

            }
        }

        int max = P.size();

        if (A.size() > max) {
            max = A.size();
        }
        if (T.size() > max) {
            max = T.size();
        }
        if (e.size() > max) {
            max = e.size();
        }
        if (s.size() > max) {
            max = s.size();
        }
        if (t.size() > max) {
            max = t.size();
        }

        for (int i = 0; i < max; i++) {
            if (i < P.size()) {
                System.out.print(P.get(i));
            }
            if (i < A.size()) {
                System.out.print(A.get(i));
            }
            if (i < T.size()) {
                System.out.print(T.get(i));
            }
            if (i < e.size()) {
                System.out.print(e.get(i));
            }
            if (i < s.size()) {
                System.out.print(s.get(i));
            }
            if (i < t.size()) {
                System.out.print(t.get(i));
            }
        }
    }

}

// 尝试用Hash，但是没有成功，有待改正...｡ﾟ(*´□`)ﾟ｡
/*
public class basicLevel1043 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        scanner.close();

        char[] ch = str.toCharArray();
        int[] num = new int[6];
        int count = 0;
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == 'P' || ch[i] == 'A' || ch[i] == 'T' || ch[i] == 'e' || ch[i] == 's' || ch[i] == 't') {
                num[ch[i]]++;
                count++;
            }
        }
        int max = -1;
        for (int i = 0; i < count; i++) {
            if (max < num[i]) {
                max = num[i];
            }
        }
        for (int i = 0; i < max; i++) {
            if (ch[i] == 'P' && num[ch[i]] != 0) {
                System.out.print('P');
            }
            if (ch[i] == 'A' && num[ch[i]] != 0) {
                System.out.print('A');
            }
            if (ch[i] == 'T' && num[ch[i]] != 0) {
                System.out.print('T');
            }
            if (ch[i] == 'e' && num[ch[i]] != 0) {
                System.out.print('e');
            }
            if (ch[i] == 's' && num[ch[i]] != 0) {
                System.out.print('s');
            }
            if (ch[i] == 't' && num[ch[i]] != 0) {
                System.out.print('t');
            }
        }
    }
}
*/