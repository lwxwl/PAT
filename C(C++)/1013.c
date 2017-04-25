#include <stdio.h>
#include <math.h>

int main() {
    int m, n, num = 0, flag = 0, isPrime = 1;
    scanf("%d %d", &m, &n);
    int array[n + 1];
    array[1] = 2;

    int index = 2;
    for (int i = 3; index <= n; i++) {
        for (int j = 2; j <= sqrt(i); j++) {
            if (i % j == 0) {
                isPrime = 0;
                break;
            }
        }
        if (isPrime) {
            array[index] = i;
            index++;
        }
        isPrime = 1;
    }
    for (int i = m; i <= n; i++) {
        if (flag) {
            printf(" ");
        }
        flag = 1;
        printf("%d", array[i]);
        num++;
        if (num == 10) {
            printf("\n");
            num = 0;
            flag = 0;
        }
    }
}
