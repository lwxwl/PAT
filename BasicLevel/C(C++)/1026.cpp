#include <stdio.h>
#include <iostream>
#include <math.h>
using namespace std;

int main() {
    float c1, c2, CLK_TCK = 100;
    int n;
    cin >> c1 >> c2;
    n = round((c2 - c1) / CLK_TCK);
    printf("%02d:%02d:%02d", n / 3600, n / 60 % 60, n % 60);
}

// printf("%02d:%02d:%02d", n / 3600, (n % 3600) / 60, n % 60);

