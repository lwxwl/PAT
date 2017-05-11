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
        int num[] = findChar(letter);
        char c = (char)(num[0]+97);
        System.out.println(c + " " + num[1]);
    }

    public static int[] findChar(char[] chars) {
        int[] num = new int[2];
        int flag = -1;
        int max = 0;
        int[] result = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        for (int i = 0; i < chars.length; i++) {
            switch (chars[i]) {
                case 97:
                    result[0]++;
                    break;
                case 98:
                    result[1]++;
                    break;
                case 99:
                    result[2]++;
                    break;
                case 100 :
                    result[3]++;
                    break;
                case 101 :
                    result[4]++;
                    break;
                case 102 :
                    result[5]++;
                    break;
                case 103 :
                    result[6]++;
                    break;
                case 104 :
                    result[7]++;
                    break;
                case 105 :
                    result[8]++;
                    break;
                case 106 :
                    result[9]++;
                    break;
                case 107 :
                    result[10]++;
                    break;
                case 108 :
                    result[11]++;
                    break;
                case 109 :
                    result[12]++;
                    break;
                case 110 :
                    result[13]++;
                    break;
                case 111 :
                    result[14]++;
                    break;
                case 112 :
                    result[15]++;
                    break;
                case 113 :
                    result[16]++;
                    break;
                case 114 :
                    result[17]++;
                    break;
                case 115 :
                    result[18]++;
                    break;
                case 116 :
                    result[19]++;
                    break;
                case 117 :
                    result[20]++;
                    break;
                case 118 :
                    result[21]++;
                    break;
                case 119 :
                    result[22]++;
                    break;
                case 120 :
                    result[23]++;
                    break;
                case 121 :
                    result[24]++;
                    break;
                case 122 :
                    result[25]++;
                    break;
            }
        }
        for (int i = 0; i < result.length; i++) {
            if (max <= result[i]) {
                max = result[i];
                flag = i;
            }
        }
        num[0] = flag;
        num[2] = max;
        return num;
    }
}
