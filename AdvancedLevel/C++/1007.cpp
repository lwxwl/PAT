#include <iostream>
using namespace std;

bool isPositive(int *n, int k) {
    for (int i = 0; i < k; i++) {
        if (n[i] >= 0) {
            return 1;
        }
    }
    return 0;
}

int main() {
    int k = 0;
    cin >> k;
    int maxSum = -1, tempSum = 0, tempFirst = 0, first = 0, last = 0;
    int *n = new int[k];
    for (int i = 0; i < k; i++) {
        cin >> n[i];
        tempSum += n[i];
        if (tempSum > maxSum) {
            maxSum = tempSum;
            first = tempFirst;
            last = i;
        } else if (tempSum < 0){
            tempSum = 0;
            tempFirst = i + 1;
        }
    }
    if (isPositive(n, k)) {
        cout << maxSum << " " << n[first] << " " << n[last] << endl;
    } else {
        cout << "0 " << n[0] << " " << n[k - 1] << endl;
    }
    delete [] n;
    return 0;
}
