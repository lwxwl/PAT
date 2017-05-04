#include <stdio.h>
#include <iostream>
#include <memory.h>
using namespace std;

int main() {
    int n;
    cin >> n;
    int scores[100000];
    memset(scores, 0, sizeof(scores));
    int school = 0;
    int grade = 0;
    int max = 0, number = 0;

    for (int i = 0; i < n; i++) {
        cin >> school >> grade;
        scores[school] += grade;
        if (max < scores[school]) {
            number = school;
            max = scores[school];
        }
    }
    printf("%d %d", number, max);
}
