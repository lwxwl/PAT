#include <iostream>
using namespace std;

int team[1001] = {0};
int main() {
    int n = 0, num = 0, member = 0, score = 0;
    cin >> n;
    for (int i = 0; i < n; i++) {
        scanf("%d-%d %d", &num, &member, &score);
        team[num] += score;
    }
    int max = 0, count = 0;
    for (int i = 0; i < 1001; i++) {
        if (max < team[i]) {
            max = team[i];
            count = i;
        }
    }
    printf("%d %d", count, team[count]);
    return 0;
}
