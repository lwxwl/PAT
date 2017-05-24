#include <iostream>
#include <cstring>
#include <algorithm>
using namespace std;

struct person {
    string name;
    int height;
    // 按结构体排序
    friend bool operator < (const person a, const person b) {
        // 若身高相同，则按名字的字典序升序排列
        if (a.height == b.height) {
            return a.name > b.name;
        }
        // 按身高从小到大排
        return a.height < b.height;
    }
}person1[10001];

int main() {
    int n, k;
    cin >> n >> k;
    string s = "";
    for (int i = 0; i < n; i++) {
        cin >> person1[i].name >> person1[i].height;
    }
    sort(person1, person1 + n);
    int num = n / k;
    for (int i = 0; i < k; i++) {
        int first = i * num;
        int end = first + num;
        if (i * num + 2 * num > n) {
            end = n;
        }
        string line = person1[end - 1].name;
        for (int j = end - 2; j >= first ; j--) {
            if (j % 2 == end % 2) {
                line = person1[j].name + " " + line;
            } else {
                line = line + " " + person1[j].name;
            }
        }
        s = line + "\n" + s;
    }
    cout << s;
    return 0;
}





