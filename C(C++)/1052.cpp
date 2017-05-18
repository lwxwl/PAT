#include <iostream>
#include <cstring>
using namespace std;

int flag = 0;

void search (int num, string s, char temp[], int& p) {
    int count = 0;
    for (int i = 0; i < s.length(); i++) {
        if (s[i] == '[') {
            count++;
        }
        if (count == num) {
            flag = 1;
            for (int j = i + 1; s[j] != ']'; j++) {
                temp[p++] = s[j];
            }
            break;
        }
    }
}

int main(){
    string a[3];
    for (int i = 0; i < 3; i++) {
        getline(cin, a[i]);
    }
    int n;
    cin >> n;
    for (int i = 0; i < n; i++) {
        int lh, le, m, re, rh;
        cin >> lh >> le >> m >> re >> rh;
        char temp[50];
        int p = 0;
        search(lh, a[0], temp, p);
        if (flag) {
            temp[p++] = '(';
            flag = 0;
            search(le, a[1], temp, p);
            if (flag) {
                flag = 0;
                search(m, a[2], temp, p);
                if (flag) {
                    flag = 0;
                    search(re, a[1], temp, p);
                    if (flag) {
                        temp[p++] = ')';
                        flag = 0;
                        search(rh, a[0], temp, p);
                        if (flag) {
                            temp[p] = '\0';
                            cout << temp << endl;
                        } else {
                            cout << "Are you kidding me? @\\/@" << endl;
                        }
                    } else {
                        cout << "Are you kidding me? @\\/@" << endl;
                    }
                } else {
                    cout << "Are you kidding me? @\\/@" << endl;
                }
            } else {
                cout << "Are you kidding me? @\\/@" << endl;
            }
        } else {
            cout << "Are you kidding me? @\\/@" << endl;
        }
    }
    return 0;
}

