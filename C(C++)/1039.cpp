#include <stdio.h>

int main() {
    char c;
    int a[123] = {0};
    int flag = 0, sum = 0;
    c = getchar();
    while (c != '\n') {
        a[(int) c]++;
        c = getchar();
    }
    c = getchar();
    while (c != '\n') {
        a[(int) c]--;
        if (a[(int) c] < 0) {
            flag = 1;
        }
        c = getchar();
    }
    if (flag == 1) {
        for (int i = 0; i < 123; i++) {
            if (a[i] < 0) {
                sum += a[i];
            }
        }
        printf("No %d\n", -sum);
    } else {
        for (int i = 0; i < 123; i++) {
            sum += a[i];
        }
        printf("Yes %d\n", sum);
    }
    return 0;
}

