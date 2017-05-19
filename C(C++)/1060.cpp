#include <iostream>
#include <algorithm>
using namespace std;

int main() {
    int n;
    cin >> n;
    int distance[n];
    for (int i = 0; i < n; i++) {
        cin >> distance[i];
    }
    sort(distance, distance + n);
    int e;
    if (distance[0] > n) {
        e = n;
        cout << e;
    } else {
        e = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (distance[i] <= n - i) {
                e = n - i - 1;
                break;
            }
        }
        cout << e;
    }
    return 0;
}



