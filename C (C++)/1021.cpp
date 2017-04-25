#include <stdio.h>
#include <iostream>
#include <string>
using namespace std;

int main() {
    int d[10] = {0,};
    string n;
    cin >> n;
    for(int i = 0; i < n.size(); i++) {
        d[n[i] - '0']++;
    }
    for(int i = 0; i < 10; i++) {
        if(d[i] != 0) {
            printf("%d:%d\n",i,d[i]);
        }
    }
}


