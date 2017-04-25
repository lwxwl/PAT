// 用Java一直超时，向大佬学习的c++的写法
#include <iostream>
#include <algorithm>
#include <cstdio>
#include <vector>
using namespace std;

struct student {
    int id;
    int moral;
    int talent;
};

int compareTo(struct student a, struct student b) {
    if ((a.moral + a.talent) != (b.moral + b.talent)) {
        return (a.moral + a.talent) > (b.moral + b.talent);
    } else if (a.moral != b.moral) {
        return a.moral > b.moral;
    } else {
        return a.id < b.id;
    }
}

int main() {
    int n, low, high;
    cin >> n >> low >> high;
    vector<student> a, b, c, d;
    student temp;
    int score = n;
    for (int i = 0; i < n; i++) {
        cin >> temp.id >> temp.moral >> temp.talent;
        if (temp.moral < low || temp.talent < low) {
            score--;
            continue;
        }
        if (temp.moral >= high && temp.talent >= high) {
            a.push_back(temp);
        } else if (temp.moral >= high && temp.talent < high) {
            b.push_back(temp);
        } else if (temp.moral < high && temp.talent < high && temp.moral >= temp.talent) {
            c.push_back(temp);
        } else {
            d.push_back(temp);
        }
    }

    sort(a.begin(), a.end(), compareTo);
    sort(b.begin(), b.end(), compareTo);
    sort(c.begin(), c.end(), compareTo);
    sort(d.begin(), d.end(), compareTo);

    printf("%d\n", score);
    vector<student>::iterator itr;
    for(itr = a.begin(); itr != a.end(); itr++)
        printf("%d %d %d\n", itr->id, itr->moral, itr->talent);
    for(itr = b.begin(); itr != b.end(); itr++)
        printf("%d %d %d\n", itr->id, itr->moral, itr->talent);
    for(itr = c.begin(); itr != c.end(); itr++)
        printf("%d %d %d\n", itr->id, itr->moral, itr->talent);
    for(itr = d.begin(); itr != d.end(); itr++)
        printf("%d %d %d\n", itr->id, itr->moral, itr->talent);

    return 0;
}