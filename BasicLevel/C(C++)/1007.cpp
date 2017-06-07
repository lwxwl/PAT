#include <iostream>
using namespace std;

bool isPrime(int a) {
    for (int i = 2; i * i <= a; i++) {
        if (a % i == 0) {
            return false;
        }
    }
    return true;
}

int main() {
    int n;
    cin >> n;
    int count = 0;
    for (int i = 5; i <= n; i++) {
        if (isPrime(i - 2) && isPrime(i)) {
            count++;
        }
    }
    cout << count;
    return 0;
}

