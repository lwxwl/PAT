#include <iomanip>
#include <iostream>
using namespace std;

int main() {
    int m, n, a, b, value;
    cin >> m >> n >> a >> b >> value;

    int **gray = new int *[m];
    for (int i = 0; i < m; i++) {
        gray[i] = new int[n];
        for (int j = 0; j < n; j++) {
            cin >> gray[i][j];
        }
    }
    for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
            if (j != 0) {
                cout << " ";
            }
            if (gray[i][j] >= a && gray[i][j] <= b) {
                cout << setw(3) << setfill('0') << value;
            } else {
                cout << setw(3) << setfill('0') << gray[i][j];
            }
        }
        cout << endl;
    }
    return 0;
}

// 可以不用存，直接处理后输出啊₍₍(´ ▿` ∗)⁾⁾，但是这样会超时啊qAq
// 今天注意了一下cout的格式化输出，还是改一下前面的吧...
/*
#include <iostream>
#include <iomanip>
using namespace std;

int main() {
    int m, n, a, b, value, temp;
    cin >> m >> n >> a >> b >> value;
    for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
            cin >> temp;
            if (a <= temp && temp <= b) {
                temp = value;
            }
            if (j != 0) {
                cout << " ";
            }
            // printf("%03d", temp);
            cout << setw(3) << setfill('0') << temp;
        }
        cout << endl;
    }
    return 0;
}
*/




