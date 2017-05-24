#include <iostream>
#include <algorithm>
#include <vector>
using namespace std;

int main() {
    int n;
    cin >> n;
    vector<int> length(n);
    for (int i = 0; i < n; i++) {
        cin >> length[i];
    }
    sort(length.begin(), length.end());
    int max = length[0];
    for (int i = 1; i < n; i++) {
        max = (max + length[i]) / 2;
    }
    cout << max;
    return 0;
}

