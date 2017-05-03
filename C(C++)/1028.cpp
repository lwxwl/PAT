#include <stdio.h>
#include <iostream>
#include <string>
#include <vector>
#include <algorithm>
using namespace std;

struct people{
    char name[20];
    int age;
};

int compare(const people &a, const people &b) {
    return a.age < b.age;
}

vector<people> vec;

int main(){
    
    int n;
    scanf("%d", &n);
    for (int i = 0; i < n; i++) {
        people p;
        int y,m,d;
        scanf("%s %d/%d/%d", &p.name, &y, &m, &d);
        p.age = y * 10000 + m * 100 + d;
        
        if (p.age >= 18140906 && p.age <= 20140906) {
            vec.push_back(p);
        }
    }
    // 这里可以不用去计算月份，直接比数字大小

    sort(vec.begin(), vec.end(), compare);
    int size = vec.size();

    if (size == 0) {
        printf("0\n");
    } else  {
        printf("%d %s %s", size, vec[0].name, vec[size - 1].name);
    }
    return 0;
}



