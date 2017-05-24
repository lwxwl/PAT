#include <iostream>
using namespace std;

int main() {
    int n, result = 0;
    int score[101] = {0};
    cin >> n;
    for (int i = 0; i < n; i++) {
        cin >> result;
        score[result]++;
    }
    cin >> n;
    int point[n];
    for (int i = 0; i < n; i++) {
        cin >> point[i];
    }
    printf("%d", score[point[0]]);
    for (int i = 1; i < n; i++) {
        printf(" %d", score[point[i]]);
    }
}
