// Run timeout...

import java.util.*;

class yueBing {
    float unitPrice;   // 单价
    float inventory;   // 库存量
    float totalPrice;  // 总售价
}

class compare implements Comparator<yueBing> {
    public int compare(yueBing a, yueBing b) {
        return b.unitPrice > a.unitPrice ? 1 : -1;
    }
}
public class basicLevel1020 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();  // 月饼的种类数
        float d = scanner.nextInt();  // 市场的最大需求量
        float sum = 0;
        ArrayList<yueBing> array = new ArrayList<>();
        // 读取每种月饼的库存量
        for (int i = 0; i < n; i++) {
            yueBing temp = new yueBing();
            temp.inventory = scanner.nextFloat();
            array.add(temp);
        }
        // 读取每种月饼的总售价，计算单价
        for (int i = 0; i < n; i++) {
            yueBing temp = array.get(i);
            temp.totalPrice = scanner.nextFloat();
            temp.unitPrice = temp.totalPrice / temp.inventory;
        }

        scanner.close();
        compare c = new compare();
        Collections.sort(array, c);

        for (int i = 0; d != 0; i++) {
            yueBing temp = array.get(i);
            if (d > temp.inventory) {
                sum = sum + temp.totalPrice;
                d = d - temp.inventory;
            } else if (d <= temp.inventory) {
                sum = sum + d * temp.unitPrice;
                break;
            }
        }
        System.out.printf("%.2f", sum);
    }
}
