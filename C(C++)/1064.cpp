#include <iostream>
#include <set>
using namespace std;

int getSum(int num) {
    int sum = 0;
    while (num != 0) {
        sum += num % 10;
        num /= 10;
    }
    return sum;
}

int main() {
    set<int> set;
    int n, temp;
    cin >> n;
    for (int i = 0; i < n; i++) {
        cin >> temp;
        set.insert(getSum(temp));
    }
    cout << set.size() << endl;
    for (auto it = set.begin(); it != set.end(); it++) {
        if (it != set.begin()) {
            cout << " ";
        }
        cout << *it;
    }
    return 0;
}