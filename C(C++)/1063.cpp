#include <iostream>
#include <cmath>
using namespace std;

double getModule(int a, int b) {
    return sqrt(a * a + b * b);
}

int main() {
    int n;
    cin >> n;
    double module = -1;
    for (int i = 0; i < n; i++) {
        int a, b;
        cin >> a >> b;
        double m = getModule(a, b);
        module = module > m? module: m;
    }
    printf("%.2f", module);
}