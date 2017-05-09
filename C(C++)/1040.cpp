#include <iostream>
#include <string>
using namespace std;

int main() {
    string str;
    cin >> str;
    int p = 0, pa = 0, pat = 0;
    for (int i = 0; i < str.size(); i++) {
        if (str[i] == 'P') {
            p++;
        } else if (str[i] == 'A') {
            pa += p;
            pa %= 1000000007;
        } else {
            pat += pa;
            pat %= 1000000007;
        }
    }
    cout << pat;
    return 0;
}
