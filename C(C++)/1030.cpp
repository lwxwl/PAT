#include <iostream>
#include <algorithm>
#include <vector>
using namespace std;

int main() {
    int n, p;
    cin >> n >> p;
    long num = 1;

    vector<int> array(n);
    for (int i = 0; i < n; i++) {
        cin >> array[i];
    }
    if (n == 0 || p < 0) {
        cout << n;
        return 0;
    }
    sort(array.begin(), array.end());
    /*
     for (int i = 0; i < n; i++) {
        for (int j = i + num; j < n; j++) {
            if (array[j] <= array[i] * p) {
                if (j - i + 1 > num) {
                    num = j - i + 1;
                }
            } else {
                break;
            }
        }
    }
     */
    for (int i = n - 1; i >= 1; i--) {
        int temp = 1;
        long long a = array[i];
        for (int j = i - num; j >= 0 && a * 1.0 / array[j] <= p; j--) {
            temp = i - j + 1;
        }
        num = num > temp ? num : temp;
    }
    cout << num;
    return 0;
}
