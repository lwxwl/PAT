#include <stdio.h>
#include <iostream>
using namespace std;

int main() {
    int n;
    double sum=0.0, temp;
    cin >> n;

    for (int i = 0; i < n; i++) {
        cin >> temp;
        sum += temp * (n - i) * (i + 1);
    }
    printf("%.2f", sum);
}
