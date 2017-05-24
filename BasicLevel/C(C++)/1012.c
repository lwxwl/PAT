/**
 * A1 = 能被5整除的数字中所有偶数的和；
 * A2 = 将被5除后余1的数字按给出顺序进行交错求和，即计算n1-n2+n3-n4...；
 * A3 = 被5除后余2的数字的个数；
 * A4 = 被5除后余3的数字的平均数，精确到小数点后1位；
 * A5 = 被5除后余4的数字中最大数字。
 */
// 编译器用c的话，使用布尔类型要导入头文件#include <stdbool.h>； 用c++的话就可以直接使用

#include <stdbool.h>
#include <stdio.h>

int main (){
    int a1 = 0, a2 = 0, a3 = 0, a5 = -1;
    float a4 = 0;
    int num = 0;
    bool flag1 = true;
    bool flag2 =false;

    int n;
    scanf("%d", &n);
    int array[n];
    for (int i = 0; i < n; i++) {
        scanf("%d", &array[i]);
        if (array[i] % 5 == 0 && array[i] % 2 == 0) {
            a1 += array[i];
        }
        if (array[i] % 5 == 1) {
            flag2 = true;
            if (flag1) {
                a2 = a2+array[i];
                flag1 = false;
            } else {
                a2 = a2 - array[i];
                flag1 = true;
            }
        }
        if (array[i] % 5 == 2) {
            a3++;
        }
        if (array[i] % 5 == 3) {
            a4 = a4 + array[i];
            num++;
        }
        if (array[i] % 5 == 4) {
            if (a5 < array[i]) {
                a5 = array[i];
            }
        }
    }
    if (a1 != 0) {
        printf("%d ", a1);
    } else {
        printf("N ");
    }
    if (flag2) {
        printf("%d ", a2);
    } else {
        printf("N ");
    }
    if (a3 == 0) {
        printf("N ");
    } else {
        printf("%d ", a3);
    }
    if (num == 0) {
        printf("N ");
    } else {
        printf("%.1f ", a4 / num);
    }
    if (a5 == -1) {
        printf("N");
    } else {
        printf("%d", a5);
    }
    return 0;
}
