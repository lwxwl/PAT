#include <iostream>
using namespace std;

int main() {
    int a, b, d;
    cin >> a >> b >> d;
    int n = a + b;
    if (n == 0) {
        cout << 0;
        return 0;
    }
    int s[100];
    int i = 0;
    while (n != 0) {
        s[i++] = n % d;
        n = n / d;
    }
    for (int j = i - 1; j >= 0; j--) {
        cout << s[j];
    }
    return 0;
}

