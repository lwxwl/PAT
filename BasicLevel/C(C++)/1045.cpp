#include <iostream>
#include <algorithm>
using namespace std;

int compare(const int a, const int b) {
    return a < b;
}

int main() {
    int n;
    scanf ("%d", &n);
    int input[n], array[n];
    for (int i = 0; i < n; i++) {
        scanf("%d", &input[i]);
        array[i] = input[i];
    }
    sort(array, array + n, compare);
    int max = 0, num = 0;
    int output[n];
    for (int i = 0; i < n; i++) {
        if (input[i] > max) {
            max = input[i];
        }
        if (input[i] == array[i] && input[i] == max) {
            output[num++] = input[i];
        }
    }
    printf("%d\n", num);
    for (int i = 0; i < num; i++) {
        if (i == 0) {
            printf("%d", output[i]);
        } else {
            printf(" %d", output[i]);
        }
    }
    printf("\n");
    return 0;
}






