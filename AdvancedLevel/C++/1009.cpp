/*
 * I have been wondering that why I couldn't pass the test if I put
 * "cin >> temp >> n1[temp];" together. (ಗ ‸ ಗ )
 * However, I can compile my code successfully and get the right answer in my part.
 */
#include <iostream>
using namespace std;

int main() {
    double n1[1001] = {0};
    double n2[1001] = {0};
    double n[2001] = {0};
    int k = 0, count = 0;;

    cin >> k;
    for (int i = 0; i < k; i++) {
        int temp = 0;
        cin >> temp;
        cin >> n1[temp];
    }

    cin >> k;
    for (int i = 0; i < k; i++) {
        int temp = 0;
        cin >> temp;
        cin >> n2[temp];
    }

    for (int i = 0; i < 1001; i++) {
        for (int j = 0; j < 1001; j++) {
            n[i + j] += n1[i] * n2[j];
        }
    }

    for (int i = 2000; i >= 0; i--) {
        if (n[i] != 0) {
            count++;
        }
    }
    cout << count;

    for (int i = 2000; i >= 0; i--) {
        if (n[i] != 0) {
            printf(" %d %.1f", i, n[i]);
        }
    }
    return 0;
}
