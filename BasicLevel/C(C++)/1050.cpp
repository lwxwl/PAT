#include <iostream>
#include <cstring>
#include <algorithm>
using namespace std;

int main() {
    int N;
    cin >> N;
    int num[N + 5];
    for (int i = 0; i < N; i++) {
        cin >> num[i];
    }
    sort(num, num + N, greater<int>());
    int m = 0, n = 0, min = N;
    for (int i = 0; i <= N; i++) {
        for (int j = 0; j <= i; j++) {
            if (i * j == N && (i - j) < min) {
                min = i - j;
                m = i;
                n = j;
            }
        }
    }
    int screw[m][n];
    memset(screw, 0, sizeof(screw));
    int i = 0, j = 0, k = 0;
    screw[i][j] = num[k++];
    while (k < N) {
        while (j + 1 < n && !screw[i][j + 1]) {
            screw[i][++j] = num[k++];
        }
        while (i + 1 < m && !screw[i + 1][j]) {
            screw[++i][j] = num[k++];
        }
        while (i - 1 >= 0 && !screw[i - 1][j]) {
            screw[--i][j] = num[k++];
        }
        while (j - 1 >= 0 && !screw[i][j - 1]) {
            screw[i][--j] = num[k++];
        }
    }
    for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
            if (j != 0) {
                cout << " ";
            }
            cout << screw[i][j];
        }
        cout << endl;
    }
    return 0;
}