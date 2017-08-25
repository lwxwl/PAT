#include <iostream>
using namespace std;

int main() {
    int num1, num2, exp, count = 0;
    float array[1001] = {0};
    float coe;

    cin >> num1;

    for (int i = 0; i < num1; i++) {
        cin >> exp >> coe;
        array[exp] += coe;
    }

    cin >> num2;

    for (int i = 0; i < num2; i++) {
        cin >> exp >> coe;
        array[exp] += coe;
    }

    for (int i = 0; i < 1001; i++) {
        if (array[i] != 0) {
            count++;
        }
    }

    cout << count;

    for (int i = 1000; i >= 0; i--) {
        if (array[i] != 0.0) {
            printf(" %d %.1f", i, array[i]);
        }
    }
    return 0;
}