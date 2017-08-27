#include <iostream>
#include <string>
#include <vector>
using namespace std;

int main() {
    int sum = 0;
    string s[10] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    string n;
    cin >> n;
    for (int i = 0; i < n.length(); i++) {
        sum += (n[i] - '0');
    }

    vector<int> v;
    do {
        v.push_back(sum % 10);
        sum /= 10;
    } while (sum != 0);

    int length = v.size();

    if (length == 0) {
        cout << v[0];
    } else {
        cout << s[v[length - 1]];
    }

    for (int i = length - 2; i >= 0; i--) {
        cout << " " << s[v[i]];
    }
    return 0;
}
