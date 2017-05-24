#include <iostream>
#include <vector>
using namespace std;

int main() {
    int n, m;
    cin >> n >> m;
    vector<int> score(m), answer(m);
    for (int i = 0; i < m; i++) {
        cin >> score[i];
    }
    for (int i = 0; i < m; i++) {
        cin >> answer[i];
    }
    for (int i = 0; i < n; i++) {
        int sum = 0;
        for (int j = 0; j < m; j++) {
            int result;
            cin >> result;
            if (result == answer[j]) {
                sum += score[j];
            }
        }
        cout << sum <<endl;
    }
    return 0;
}




