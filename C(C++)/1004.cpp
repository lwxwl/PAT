#include <iostream>
using namespace std;

int main(){
    int n;
    cin >> n;
    int max = -1, min = 101, score;
    string maxName, minName, maxNum, minNum, name, num;
    for (int i = 0; i < n; i++) {
        cin >> name;
        cin >> num;
        cin >> score;
        if (max < score) {
            max = score;
            maxName = name;
            maxNum = num;

        }
        if (min > score) {
            min = score;
            minName = name;
            minNum = num;
        }
    }
    cout << maxName << " " << maxNum << endl << minName << " " << minNum;
    return 0;
}