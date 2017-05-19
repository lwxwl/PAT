#include <cstdio>
#include <string>
#include <iostream>
using namespace std;

#define MAX 10000

int input[MAX] = {0};
int check[MAX] = {0};

bool isPrime(int a) {
    for (int i = 2; i < a / 2; i++) {
        if (a % i == 0) {
            return false;
        }
    }
    return true;
}

int main() {

    int n;
    scanf("%d", &n);
    for (int i = 0; i < n; i++) {
        int id;
        scanf("%d", &id);
        input[id] = i + 1;
    }

    int k;
    scanf("%d", &k);
    for (int i = 0; i < k; i++) {
        int id;
        scanf("%d", &id);

        if (input[id] == 0) {
            printf("%04d: Are you kidding?\n", id);
            continue;
        }
        if (check[id] == 1) {
            printf("%04d: Checked\n", id);
            continue;
        }
        if (input[id] == 1) {
            printf("%04d: Mystery Award\n", id);
            check[id] = 1;
            continue;
        }
        if (isPrime(input[id])) {
            printf("%04d: Minion\n", id);
            check[id] = 1;
            continue;
        } else {
            printf("%04d: Chocolate\n", id);
            check[id] = 1;
            continue;
        }
    }
    return 0;
}




