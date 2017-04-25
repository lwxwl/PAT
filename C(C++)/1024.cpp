#include <iostream>
#include <string>
using namespace std;

int main() {
    string str;
    cin >> str;
    int len = str.length();
    if (str[0] == '-') {
        cout << "-";
    }
    int e = 0;
    for (int i = 0; i < len; i++) {
        if (str[i] == 'E') {
            e = i;
        }
    }
    int dec = 0;
    for (int i = e + 2; i < len; i++) {
        dec = (str[i] - '0') + 10 * dec;
    }
    if (str[e + 1] == '-') {
        if (0 < dec) {
            cout << "0.";
            for (int i = 1; i < dec; i++) {
                cout << 0;
            }
            for (int i = 1; i < e; i++) {
                if (str[i] >= '0' && str[i] <= '9') {
                    cout << str[i];
                }
            }
        } else {
            for (int i = 0; i < e; i++) {
                cout << str[i];
            }
        }
    } else {
        if (e - 3 < dec) {
            if (str[1] != '0') {
                cout << str[1];
            }
            for (int i = 3; i < e; i++) {
                if (str[i] >= '0' && str[i] <= '9') {
                    cout << str[i];
                }
            }
            for (int i = 0; i < dec - (e - 3); i++) {
                cout << 0;
            }
        } else {
            if (str[1] != 0) {
                cout << str[1];
            }
            for (int i = 3; i < e; i++) {
                if (i == dec + 3) {
                    cout << ".";
                }
                if (str[i] >= '0' && str[i] <= '9') {
                    cout << str[i];
                }
            }
        }
    }
    return 0;
}
