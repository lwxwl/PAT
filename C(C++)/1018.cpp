#include <iostream>
using namespace std;

int main() {
    int n;
    cin >> n;
    int jWin = 0; yWin = 0;
    int jia[3] = {0}, yi[3] = {0};

    for (int i = 0; i < n; i++) {
        char j, y;
        cin >> j >> y;
        if (j == 'B' && y == 'C') {
            jWin++;
            jia[0]++;
        } else if (j == 'B' && y == 'J') {
            yWin++;
            yi[2]++;
        } else if (j == 'C' && y == 'B') {
            yWin++;
            yi[0]++;
        } else if (j == 'C' && y == 'J') {
            jWin++;
            jia[1]++;
        } else if (j == 'J' && y == 'B') {
            jWin++;
            jia[2]++;
        } else if (j == 'J' && y == 'C') {
            yWin++;
            yi[1]++;
        }
    }
    cout << jWin << " " << n - jWin - yWin << " " << yWin << endl
         << yWin << " " << n - jWin - yWin << " " << jWin << endl;

    int maxJ = jia[0] >= jia[1] ? 0 : 1;
    maxJ = jia[maxJ] >= jia[2] ? maxJ : 2;
    int maxY = yi[0] >= yi[1] ? 0 : 1;
    maxY = yi[maxY] >= yi[2] ? maxY : 2;

    char str[4] = {"BCJ"};
    cout << str[maxJ] << " " << str[maxY];
    return 0;
}
