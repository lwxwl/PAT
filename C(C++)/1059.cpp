#include <string>
#include <iostream>
#include <iomanip>
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
    // scanf("%d", &n);
    cin >> n;
    for (int i = 0; i < n; i++) {
        int id;
        // scanf("%d", &id);
        cin >> id;
        input[id] = i + 1;
    }

    int k;
    // scanf("%d", &k);
    cin >> k;
    for (int i = 0; i < k; i++) {
        int id;
        // scanf("%d", &id);
        cin >> id;

        if (input[id] == 0) {
            // printf("%04d: Are you kidding?\n", id);
            cout << setw(4) << setfill('0') << id << ": Are you kidding?" << endl;
            continue;
        }
        if (check[id] == 1) {
            // printf("%04d: Checked\n", id);
            cout << setw(4) << setfill('0') << id << ": Checked" << endl;
            continue;
        }
        if (input[id] == 1) {
            // printf("%04d: Mystery Award\n", id);
            cout << setw(4) << setfill('0') << id << ": Mystery Award" << endl;
            check[id] = 1;
            continue;
        }
        if (isPrime(input[id])) {
            // printf("%04d: Minion\n", id);
            cout << setw(4) << setfill('0') << id << ": Minion" << endl;
            check[id] = 1;
            continue;
        } else {
            // printf("%04d: Chocolate\n", id);
            cout << setw(4) << setfill('0') << id << ": Chocolate" << endl;
            check[id] = 1;
            continue;
        }
    }
    return 0;
}


