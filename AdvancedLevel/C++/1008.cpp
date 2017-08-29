#include <iostream>
#include <cmath>
using namespace std;

int main() {
    int n;
    cin >> n;
    int array[n];
    for (int i = 0; i < n; i++) {
        cin >> array[i];
    }

    int time = array[0] * 6;
    time += n * 5;

    for (int i = 1; i < n; i++) {
        int temp = abs(array[i] - array[i - 1]);

        if (array[i] < array[i - 1]) {
            time += temp * 4;
        } else if (array[i] > array[i - 1]) {
            time += temp * 6;
        }
    }
    cout << time << endl;
    return 0;
}
