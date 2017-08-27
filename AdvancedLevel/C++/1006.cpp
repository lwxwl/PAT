// I have tried to compare the time directly, but it has failed.
// So I compared them partly.
#include <iostream>
#include <cstdio>
#include <string>
#include <algorithm>
using namespace std;

struct Person{
    string id;
    int h1;
    int m1;
    int s1;
    int h2;
    int m2;
    int s2;
};

bool cmp1(Person o1, Person o2) {
    if (o1.h1 != o2.h1) {
        return o1.h1 < o2.h1;
    } else if (o1.m1 != o2.m1) {
        return o1.m1 < o2.m1;
    } else {
        return o1.s1 < o2.s1;
    }
}

bool cmp2(Person o1, Person o2) {
    if (o1.h2 != o2.h2) {
        return o1.h2 < o2.h2;
    } else if (o1.m2 != o2.m2) {
        return o1.m2 < o2.m2;
    } else {
        return o1.s2 < o2.s2;
    }
}

int main() {
    int n;
    cin >> n;
    Person person[n];
    for (int i = 0; i < n; i++) {
        cin >> person[i].id;
        scanf("%d:%d:%d%d:%d:%d", &person[i].h1, &person[i].m1, &person[i].s1,
        &person[i].h2, &person[i].m2, &person[i].s2);
    }
    sort(person, person + n, cmp1);
    cout << person[0].id << " ";
    sort(person, person + n, cmp2);
    cout << person[n - 1].id << endl;
    return 0;
}
